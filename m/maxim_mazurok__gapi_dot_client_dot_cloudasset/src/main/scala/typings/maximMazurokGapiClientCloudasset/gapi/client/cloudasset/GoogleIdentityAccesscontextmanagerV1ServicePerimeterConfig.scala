package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig extends StObject {
  
  /**
    * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this
    * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google
    * Cloud calls with request origins within the perimeter. Example: `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}` */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Google Cloud services that are subject to the Service Perimeter restrictions. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the
    * perimeter must meet the perimeter's access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Configuration for APIs allowed within Perimeter. */
  var vpcAccessibleServices: js.UndefOr[GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig](x: Self) {
    
    inline def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value :_*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setRestrictedServices(value: js.Array[String]): Self = StObject.set(x, "restrictedServices", value.asInstanceOf[js.Any])
    
    inline def setRestrictedServicesUndefined: Self = StObject.set(x, "restrictedServices", js.undefined)
    
    inline def setRestrictedServicesVarargs(value: String*): Self = StObject.set(x, "restrictedServices", js.Array(value :_*))
    
    inline def setVpcAccessibleServices(value: GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices): Self = StObject.set(x, "vpcAccessibleServices", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessibleServicesUndefined: Self = StObject.set(x, "vpcAccessibleServices", js.undefined)
  }
}
