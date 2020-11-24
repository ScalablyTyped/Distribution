package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information involved in an HTTP/HTTPS uptime check request.
  */
@js.native
trait SchemaHttpCheck extends js.Object {
  
  /**
    * The authentication information. Optional when creating an HTTP check;
    * defaults to empty.
    */
  var authInfo: js.UndefOr[SchemaBasicAuthentication] = js.native
  
  /**
    * The list of headers to send as part of the uptime check request. If two
    * headers have the same key and different values, they should be entered as
    * a single header, with the value being a comma-separated list of all the
    * desired values as described at
    * https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two
    * separate headers with the same key in a Create call will cause the first
    * to be overwritten by the second. The maximum number of headers allowed is
    * 100.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Boolean specifiying whether to encrypt the header information. Encryption
    * should be specified for any headers related to authentication that you do
    * not wish to be seen when retrieving the configuration. The server will be
    * responsible for encrypting the headers. On Get/List calls, if
    * mask_headers is set to True then the headers will be obscured with
    * ******.
    */
  var maskHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * The path to the page to run the check against. Will be combined with the
    * host (specified within the MonitoredResource) and port to construct the
    * full URL. Optional (defaults to &quot;/&quot;). If the provided path does
    * not begin with &quot;/&quot;, it will be prepended automatically.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The port to the page to run the check against. Will be combined with host
    * (specified within the MonitoredResource) and path to construct the full
    * URL. Optional (defaults to 80 without SSL, or 443 with SSL).
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * If true, use HTTPS instead of HTTP to run the check.
    */
  var useSsl: js.UndefOr[Boolean] = js.native
}
object SchemaHttpCheck {
  
  @scala.inline
  def apply(): SchemaHttpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpCheck]
  }
  
  @scala.inline
  implicit class SchemaHttpCheckOps[Self <: SchemaHttpCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthInfo(value: SchemaBasicAuthentication): Self = this.set("authInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthInfo: Self = this.set("authInfo", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaskHeaders(value: Boolean): Self = this.set("maskHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskHeaders: Self = this.set("maskHeaders", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setUseSsl(value: Boolean): Self = this.set("useSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSsl: Self = this.set("useSsl", js.undefined)
  }
}
