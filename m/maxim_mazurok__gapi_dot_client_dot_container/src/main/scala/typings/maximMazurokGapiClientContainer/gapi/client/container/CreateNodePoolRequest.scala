package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNodePoolRequest extends StObject {
  
  /** Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** Required. The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.native
  
  /** The parent (project, location, cluster id) where the node pool will be created. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced
    * by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}
object CreateNodePoolRequest {
  
  @scala.inline
  def apply(): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
  
  @scala.inline
  implicit class CreateNodePoolRequestMutableBuilder[Self <: CreateNodePoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setNodePool(value: NodePool): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
