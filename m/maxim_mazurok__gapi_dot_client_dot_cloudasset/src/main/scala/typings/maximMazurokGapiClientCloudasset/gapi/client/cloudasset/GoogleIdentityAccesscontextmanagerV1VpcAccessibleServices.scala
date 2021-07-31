package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices extends StObject {
  
  /**
    * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the
    * 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
    */
  var allowedServices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'. */
  var enableRestriction: js.UndefOr[Boolean] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices {
  
  @scala.inline
  def apply(): GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices]
  }
  
  @scala.inline
  implicit class GoogleIdentityAccesscontextmanagerV1VpcAccessibleServicesMutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedServices(value: js.Array[String]): Self = StObject.set(x, "allowedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedServicesUndefined: Self = StObject.set(x, "allowedServices", js.undefined)
    
    @scala.inline
    def setAllowedServicesVarargs(value: String*): Self = StObject.set(x, "allowedServices", js.Array(value :_*))
    
    @scala.inline
    def setEnableRestriction(value: Boolean): Self = StObject.set(x, "enableRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRestrictionUndefined: Self = StObject.set(x, "enableRestriction", js.undefined)
  }
}
