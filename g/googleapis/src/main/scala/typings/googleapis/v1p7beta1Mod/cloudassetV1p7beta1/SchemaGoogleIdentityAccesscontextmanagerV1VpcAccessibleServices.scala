package typings.googleapis.v1p7beta1Mod.cloudassetV1p7beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1VpcAccessibleServices extends StObject {
  
  /**
    * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
    */
  var allowedServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'.
    */
  var enableRestriction: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1VpcAccessibleServices {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1VpcAccessibleServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1VpcAccessibleServices]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1VpcAccessibleServices](x: Self) {
    
    inline def setAllowedServices(value: js.Array[String]): Self = StObject.set(x, "allowedServices", value.asInstanceOf[js.Any])
    
    inline def setAllowedServicesNull: Self = StObject.set(x, "allowedServices", null)
    
    inline def setAllowedServicesUndefined: Self = StObject.set(x, "allowedServices", js.undefined)
    
    inline def setAllowedServicesVarargs(value: String*): Self = StObject.set(x, "allowedServices", js.Array(value*))
    
    inline def setEnableRestriction(value: Boolean): Self = StObject.set(x, "enableRestriction", value.asInstanceOf[js.Any])
    
    inline def setEnableRestrictionNull: Self = StObject.set(x, "enableRestriction", null)
    
    inline def setEnableRestrictionUndefined: Self = StObject.set(x, "enableRestriction", js.undefined)
  }
}
