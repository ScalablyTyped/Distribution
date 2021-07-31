package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
  */
trait SchemaSetMaintenancePolicyRequest extends StObject {
  
  /**
    * The name of the cluster to update.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The maintenance policy to be set for the cluster. An empty field clears
    * the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[SchemaMaintenancePolicy] = js.undefined
  
  /**
    * The name (project, location, cluster id) of the cluster to set
    * maintenance policy. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840).
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaSetMaintenancePolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetMaintenancePolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetMaintenancePolicyRequestMutableBuilder[Self <: SchemaSetMaintenancePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setMaintenancePolicy(value: SchemaMaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
