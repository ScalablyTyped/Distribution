package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestContext extends js.Object {
  
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[String] = js.native
  
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6, or a token which is derived from the IP address, depending on the data that has been provided in the error
    * report.
    */
  var remoteIp: js.UndefOr[String] = js.native
  
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[Double] = js.native
  
  /** The URL of the request. */
  var url: js.UndefOr[String] = js.native
  
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[String] = js.native
}
object HttpRequestContext {
  
  @scala.inline
  def apply(): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestContext]
  }
  
  @scala.inline
  implicit class HttpRequestContextOps[Self <: HttpRequestContext] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = this.set("remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIp: Self = this.set("remoteIp", js.undefined)
    
    @scala.inline
    def setResponseStatusCode(value: Double): Self = this.set("responseStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseStatusCode: Self = this.set("responseStatusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
