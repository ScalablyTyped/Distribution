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
  
  /**
    * List of EgressPolicies to apply to the perimeter. A perimeter may have multiple EgressPolicies, each of which is evaluated separately. Access is granted if any EgressPolicy grants
    * it. Must be empty for a perimeter bridge.
    */
  var egressPolicies: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1EgressPolicy]] = js.undefined
  
  /**
    * List of IngressPolicies to apply to the perimeter. A perimeter may have multiple IngressPolicies, each of which is evaluated separately. Access is granted if any Ingress Policy
    * grants it. Must be empty for a perimeter bridge.
    */
  var ingressPolicies: js.UndefOr[js.Array[GoogleIdentityAccesscontextmanagerV1IngressPolicy]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleIdentityAccesscontextmanagerV1ServicePerimeterConfig] (val x: Self) extends AnyVal {
    
    inline def setAccessLevels(value: js.Array[String]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: String*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setEgressPolicies(value: js.Array[GoogleIdentityAccesscontextmanagerV1EgressPolicy]): Self = StObject.set(x, "egressPolicies", value.asInstanceOf[js.Any])
    
    inline def setEgressPoliciesUndefined: Self = StObject.set(x, "egressPolicies", js.undefined)
    
    inline def setEgressPoliciesVarargs(value: GoogleIdentityAccesscontextmanagerV1EgressPolicy*): Self = StObject.set(x, "egressPolicies", js.Array(value*))
    
    inline def setIngressPolicies(value: js.Array[GoogleIdentityAccesscontextmanagerV1IngressPolicy]): Self = StObject.set(x, "ingressPolicies", value.asInstanceOf[js.Any])
    
    inline def setIngressPoliciesUndefined: Self = StObject.set(x, "ingressPolicies", js.undefined)
    
    inline def setIngressPoliciesVarargs(value: GoogleIdentityAccesscontextmanagerV1IngressPolicy*): Self = StObject.set(x, "ingressPolicies", js.Array(value*))
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRestrictedServices(value: js.Array[String]): Self = StObject.set(x, "restrictedServices", value.asInstanceOf[js.Any])
    
    inline def setRestrictedServicesUndefined: Self = StObject.set(x, "restrictedServices", js.undefined)
    
    inline def setRestrictedServicesVarargs(value: String*): Self = StObject.set(x, "restrictedServices", js.Array(value*))
    
    inline def setVpcAccessibleServices(value: GoogleIdentityAccesscontextmanagerV1VpcAccessibleServices): Self = StObject.set(x, "vpcAccessibleServices", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessibleServicesUndefined: Self = StObject.set(x, "vpcAccessibleServices", js.undefined)
  }
}
