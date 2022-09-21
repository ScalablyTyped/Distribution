package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServicePerimeterConfig extends StObject {
  
  /**
    * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number\}`
    */
  var resources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Google Cloud services that are subject to the Service Perimeter restrictions. Must contain a list of services. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter's access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard "*". The wildcard means that unless explicitly specified by "restricted_services" list, any service is treated as unrestricted.
    */
  var unrestrictedServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Beta. Configuration for APIs allowed within Perimeter.
    */
  var vpcAccessibleServices: js.UndefOr[SchemaVpcAccessibleServices] = js.undefined
}
object SchemaServicePerimeterConfig {
  
  inline def apply(): SchemaServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeterConfig]
  }
  
  extension [Self <: SchemaServicePerimeterConfig](x: Self) {
    
    inline def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsNull: Self = StObject.set(x, "accessLevels", null)
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesNull: Self = StObject.set(x, "resources", null)
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRestrictedServices(value: js.Array[String]): Self = StObject.set(x, "restrictedServices", value.asInstanceOf[js.Any])
    
    inline def setRestrictedServicesNull: Self = StObject.set(x, "restrictedServices", null)
    
    inline def setRestrictedServicesUndefined: Self = StObject.set(x, "restrictedServices", js.undefined)
    
    inline def setRestrictedServicesVarargs(value: String*): Self = StObject.set(x, "restrictedServices", js.Array(value*))
    
    inline def setUnrestrictedServices(value: js.Array[String]): Self = StObject.set(x, "unrestrictedServices", value.asInstanceOf[js.Any])
    
    inline def setUnrestrictedServicesNull: Self = StObject.set(x, "unrestrictedServices", null)
    
    inline def setUnrestrictedServicesUndefined: Self = StObject.set(x, "unrestrictedServices", js.undefined)
    
    inline def setUnrestrictedServicesVarargs(value: String*): Self = StObject.set(x, "unrestrictedServices", js.Array(value*))
    
    inline def setVpcAccessibleServices(value: SchemaVpcAccessibleServices): Self = StObject.set(x, "vpcAccessibleServices", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessibleServicesUndefined: Self = StObject.set(x, "vpcAccessibleServices", js.undefined)
  }
}
