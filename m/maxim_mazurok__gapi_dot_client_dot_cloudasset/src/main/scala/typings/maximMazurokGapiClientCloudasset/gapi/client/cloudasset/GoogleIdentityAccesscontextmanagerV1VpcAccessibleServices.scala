package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices extends js.Object {
  
  /**
    * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the
    * 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
    */
  var allowedServices: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'. */
  var enableRestriction: js.UndefOr[Boolean] = js.native
}
object GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1VpcAccessibleServicesOps[Self <: GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices] (val x: Self) extends AnyVal {
    
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
    def setAllowedServicesVarargs(value: String*): Self = this.set("allowedServices", js.Array(value :_*))
    
    @scala.inline
    def setAllowedServices(value: js.Array[String]): Self = this.set("allowedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedServices: Self = this.set("allowedServices", js.undefined)
    
    @scala.inline
    def setEnableRestriction(value: Boolean): Self = this.set("enableRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRestriction: Self = this.set("enableRestriction", js.undefined)
  }
}
