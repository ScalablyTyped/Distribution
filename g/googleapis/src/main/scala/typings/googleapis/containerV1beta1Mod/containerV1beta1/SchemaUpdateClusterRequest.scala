package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateClusterRequest extends StObject {
  
  /**
    * Required. Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name (project, location, cluster) of the cluster to update. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Deprecated. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects). This field has been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A description of the update.
    */
  var update: js.UndefOr[SchemaClusterUpdate] = js.undefined
  
  /**
    * Required. Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateClusterRequest {
  
  inline def apply(): SchemaUpdateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateClusterRequest]
  }
  
  extension [Self <: SchemaUpdateClusterRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdNull: Self = StObject.set(x, "clusterId", null)
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setUpdate(value: SchemaClusterUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
