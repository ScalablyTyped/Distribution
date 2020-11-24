package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends js.Object {
  
  /**
    * The effective connection type is the general connection class that all users experienced for this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as
    * specified in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type is unspecified, then aggregated data over all effective connection types
    * will be returned.
    */
  var effectiveConnectionType: js.UndefOr[String] = js.native
  
  /**
    * The form factor is the device class that all users used to access the site for this record. If the form factor is unspecified, then aggregated data over all form factors will be
    * returned.
    */
  var formFactor: js.UndefOr[String] = js.native
  
  /**
    * Origin specifies the origin that this record is for. Note: When specifying an origin, data for loads under this origin over all pages are aggregated into origin level user
    * experience data.
    */
  var origin: js.UndefOr[String] = js.native
  
  /** Url specifies a specific url that this record is for. Note: When specifying a "url" only data for that specific url will be aggregated. */
  var url: js.UndefOr[String] = js.native
}
object Key {
  
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    
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
    def setEffectiveConnectionType(value: String): Self = this.set("effectiveConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveConnectionType: Self = this.set("effectiveConnectionType", js.undefined)
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
