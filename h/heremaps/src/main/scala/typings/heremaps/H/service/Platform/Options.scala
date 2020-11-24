package typings.heremaps.H.service.Platform

import typings.heremaps.H.service.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property app_id {string} - The application ID to identify the client against the platform (mandatory to provide)
  * @property app_code {string} - The application code to identify the client against the platform (mandatory to provide)
  * @property baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com
  * @property useCIT {boolean=} - Indicates whether the Customer Integration Testing should be used, default is false
  * @property useHTTPS {boolean=} - Indicates whether secure communication should be used, default is false
  */
@js.native
trait Options extends js.Object {
  
  var apikey: String = js.native
  
  var baseUrl: js.UndefOr[Url] = js.native
  
  var useCIT: js.UndefOr[Boolean] = js.native
  
  var useHTTPS: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(apikey: String): Options = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setApikey(value: String): Self = this.set("apikey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: Url): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setUseCIT(value: Boolean): Self = this.set("useCIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCIT: Self = this.set("useCIT", js.undefined)
    
    @scala.inline
    def setUseHTTPS(value: Boolean): Self = this.set("useHTTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHTTPS: Self = this.set("useHTTPS", js.undefined)
  }
}
