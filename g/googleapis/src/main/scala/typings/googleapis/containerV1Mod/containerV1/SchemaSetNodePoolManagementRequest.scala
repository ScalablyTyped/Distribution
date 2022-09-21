package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetNodePoolManagementRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. NodeManagement configuration for the node pool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.undefined
  
  /**
    * The name (project, location, cluster, node pool id) of the node pool to set management properties. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. The name of the node pool to update. This field has been deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetNodePoolManagementRequest {
  
  inline def apply(): SchemaSetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNodePoolManagementRequest]
  }
  
  extension [Self <: SchemaSetNodePoolManagementRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdNull: Self = StObject.set(x, "clusterId", null)
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setManagement(value: SchemaNodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodePoolId(value: String): Self = StObject.set(x, "nodePoolId", value.asInstanceOf[js.Any])
    
    inline def setNodePoolIdNull: Self = StObject.set(x, "nodePoolId", null)
    
    inline def setNodePoolIdUndefined: Self = StObject.set(x, "nodePoolId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
