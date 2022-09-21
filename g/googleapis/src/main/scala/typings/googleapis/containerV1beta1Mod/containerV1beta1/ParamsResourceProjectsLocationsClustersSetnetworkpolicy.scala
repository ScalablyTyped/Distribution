package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersSetnetworkpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster name) of the cluster to set networking policy. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetNetworkPolicyRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersSetnetworkpolicy {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersSetnetworkpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersSetnetworkpolicy]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersSetnetworkpolicy](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSetNetworkPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
