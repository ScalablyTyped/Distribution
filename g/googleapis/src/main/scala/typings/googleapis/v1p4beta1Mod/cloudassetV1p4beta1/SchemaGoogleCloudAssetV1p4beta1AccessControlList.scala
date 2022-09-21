package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudAssetV1p4beta1AccessControlList extends StObject {
  
  /**
    * The accesses that match one of the following conditions: - The access_selector, if it is specified in request; - Otherwise, access specifiers reachable from the policy binding's role.
    */
  var accesses: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1p4beta1Access]] = js.undefined
  
  /**
    * Resource edges of the graph starting from the policy attached resource to any descendant resources. The Edge.source_node contains the full resource name of a parent resource and Edge.target_node contains the full resource name of a child resource. This field is present only if the output_resource_edges option is enabled in request.
    */
  var resourceEdges: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1p4beta1Edge]] = js.undefined
  
  /**
    * The resources that match one of the following conditions: - The resource_selector, if it is specified in request; - Otherwise, resources reachable from the policy attached resource.
    */
  var resources: js.UndefOr[js.Array[SchemaGoogleCloudAssetV1p4beta1Resource]] = js.undefined
}
object SchemaGoogleCloudAssetV1p4beta1AccessControlList {
  
  inline def apply(): SchemaGoogleCloudAssetV1p4beta1AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudAssetV1p4beta1AccessControlList]
  }
  
  extension [Self <: SchemaGoogleCloudAssetV1p4beta1AccessControlList](x: Self) {
    
    inline def setAccesses(value: js.Array[SchemaGoogleCloudAssetV1p4beta1Access]): Self = StObject.set(x, "accesses", value.asInstanceOf[js.Any])
    
    inline def setAccessesUndefined: Self = StObject.set(x, "accesses", js.undefined)
    
    inline def setAccessesVarargs(value: SchemaGoogleCloudAssetV1p4beta1Access*): Self = StObject.set(x, "accesses", js.Array(value*))
    
    inline def setResourceEdges(value: js.Array[SchemaGoogleCloudAssetV1p4beta1Edge]): Self = StObject.set(x, "resourceEdges", value.asInstanceOf[js.Any])
    
    inline def setResourceEdgesUndefined: Self = StObject.set(x, "resourceEdges", js.undefined)
    
    inline def setResourceEdgesVarargs(value: SchemaGoogleCloudAssetV1p4beta1Edge*): Self = StObject.set(x, "resourceEdges", js.Array(value*))
    
    inline def setResources(value: js.Array[SchemaGoogleCloudAssetV1p4beta1Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaGoogleCloudAssetV1p4beta1Resource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
