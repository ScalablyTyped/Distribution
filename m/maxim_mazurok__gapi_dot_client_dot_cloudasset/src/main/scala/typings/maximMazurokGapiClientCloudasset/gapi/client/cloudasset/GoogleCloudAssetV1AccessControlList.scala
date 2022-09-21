package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1AccessControlList extends StObject {
  
  /**
    * The accesses that match one of the following conditions: - The access_selector, if it is specified in request; - Otherwise, access specifiers reachable from the policy binding's
    * role.
    */
  var accesses: js.UndefOr[js.Array[GoogleCloudAssetV1Access]] = js.undefined
  
  /** Condition evaluation for this AccessControlList, if there is a condition defined in the above IAM policy binding. */
  var conditionEvaluation: js.UndefOr[ConditionEvaluation] = js.undefined
  
  /**
    * Resource edges of the graph starting from the policy attached resource to any descendant resources. The Edge.source_node contains the full resource name of a parent resource and
    * Edge.target_node contains the full resource name of a child resource. This field is present only if the output_resource_edges option is enabled in request.
    */
  var resourceEdges: js.UndefOr[js.Array[GoogleCloudAssetV1Edge]] = js.undefined
  
  /** The resources that match one of the following conditions: - The resource_selector, if it is specified in request; - Otherwise, resources reachable from the policy attached resource. */
  var resources: js.UndefOr[js.Array[GoogleCloudAssetV1Resource]] = js.undefined
}
object GoogleCloudAssetV1AccessControlList {
  
  inline def apply(): GoogleCloudAssetV1AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1AccessControlList]
  }
  
  extension [Self <: GoogleCloudAssetV1AccessControlList](x: Self) {
    
    inline def setAccesses(value: js.Array[GoogleCloudAssetV1Access]): Self = StObject.set(x, "accesses", value.asInstanceOf[js.Any])
    
    inline def setAccessesUndefined: Self = StObject.set(x, "accesses", js.undefined)
    
    inline def setAccessesVarargs(value: GoogleCloudAssetV1Access*): Self = StObject.set(x, "accesses", js.Array(value*))
    
    inline def setConditionEvaluation(value: ConditionEvaluation): Self = StObject.set(x, "conditionEvaluation", value.asInstanceOf[js.Any])
    
    inline def setConditionEvaluationUndefined: Self = StObject.set(x, "conditionEvaluation", js.undefined)
    
    inline def setResourceEdges(value: js.Array[GoogleCloudAssetV1Edge]): Self = StObject.set(x, "resourceEdges", value.asInstanceOf[js.Any])
    
    inline def setResourceEdgesUndefined: Self = StObject.set(x, "resourceEdges", js.undefined)
    
    inline def setResourceEdgesVarargs(value: GoogleCloudAssetV1Edge*): Self = StObject.set(x, "resourceEdges", js.Array(value*))
    
    inline def setResources(value: js.Array[GoogleCloudAssetV1Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: GoogleCloudAssetV1Resource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
