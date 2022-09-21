package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateNodePoolRequest extends StObject {
  
  /**
    * Required. Deprecated. The name of the cluster. This field has been deprecated and replaced by the parent field.
    */
  var clusterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The node pool to create.
    */
  var nodePool: js.UndefOr[SchemaNodePool] = js.undefined
  
  /**
    * The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateNodePoolRequest {
  
  inline def apply(): SchemaCreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNodePoolRequest]
  }
  
  extension [Self <: SchemaCreateNodePoolRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdNull: Self = StObject.set(x, "clusterId", null)
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setNodePool(value: SchemaNodePool): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    inline def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
