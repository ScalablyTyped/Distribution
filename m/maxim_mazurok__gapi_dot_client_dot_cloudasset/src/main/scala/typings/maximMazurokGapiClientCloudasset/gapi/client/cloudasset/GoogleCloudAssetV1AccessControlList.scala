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
  
  /**
    * Resource edges of the graph starting from the policy attached resource to any descendant resources. The Edge.source_node contains the full resource name of a parent resource and
    * Edge.target_node contains the full resource name of a child resource. This field is present only if the output_resource_edges option is enabled in request.
    */
  var resourceEdges: js.UndefOr[js.Array[GoogleCloudAssetV1Edge]] = js.undefined
  
  /** The resources that match one of the following conditions: - The resource_selector, if it is specified in request; - Otherwise, resources reachable from the policy attached resource. */
  var resources: js.UndefOr[js.Array[GoogleCloudAssetV1Resource]] = js.undefined
}
object GoogleCloudAssetV1AccessControlList {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1AccessControlList]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1AccessControlListMutableBuilder[Self <: GoogleCloudAssetV1AccessControlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccesses(value: js.Array[GoogleCloudAssetV1Access]): Self = StObject.set(x, "accesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessesUndefined: Self = StObject.set(x, "accesses", js.undefined)
    
    @scala.inline
    def setAccessesVarargs(value: GoogleCloudAssetV1Access*): Self = StObject.set(x, "accesses", js.Array(value :_*))
    
    @scala.inline
    def setResourceEdges(value: js.Array[GoogleCloudAssetV1Edge]): Self = StObject.set(x, "resourceEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceEdgesUndefined: Self = StObject.set(x, "resourceEdges", js.undefined)
    
    @scala.inline
    def setResourceEdgesVarargs(value: GoogleCloudAssetV1Edge*): Self = StObject.set(x, "resourceEdges", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[GoogleCloudAssetV1Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: GoogleCloudAssetV1Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
