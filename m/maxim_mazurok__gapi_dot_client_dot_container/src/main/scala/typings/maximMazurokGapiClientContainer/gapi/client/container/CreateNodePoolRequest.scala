package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodePoolRequest extends StObject {
  
  /** Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field. */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /** Required. The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.undefined
  
  /** The parent (project, location, cluster id) where the node pool will be created. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced
    * by the parent field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object CreateNodePoolRequest {
  
  inline def apply(): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
  
  extension [Self <: CreateNodePoolRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setNodePool(value: NodePool): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    inline def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
