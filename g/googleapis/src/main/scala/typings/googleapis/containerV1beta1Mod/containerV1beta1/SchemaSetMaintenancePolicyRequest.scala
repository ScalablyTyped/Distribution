package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetMaintenancePolicyRequest extends StObject {
  
  /**
    * Required. The name of the cluster to update.
    */
  var clusterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The maintenance policy to be set for the cluster. An empty field clears the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[SchemaMaintenancePolicy] = js.undefined
  
  /**
    * The name (project, location, cluster name) of the cluster to set maintenance policy. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The Google Developers Console [project ID or project number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaSetMaintenancePolicyRequest {
  
  inline def apply(): SchemaSetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetMaintenancePolicyRequest]
  }
  
  extension [Self <: SchemaSetMaintenancePolicyRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdNull: Self = StObject.set(x, "clusterId", null)
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setMaintenancePolicy(value: SchemaMaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
