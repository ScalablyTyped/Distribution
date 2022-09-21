package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata extends StObject {
  
  /**
    * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This field allows such producers to publish per-node SLO meta data, which will be consumed by SSA Eligibility Exporter and published in the form of per node metric to Monarch.
    */
  var nodes: js.UndefOr[js.Array[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]] = js.undefined
  
  /**
    * Optional. Multiple per-instance SLI eligibilities which apply for individual SLIs.
    */
  var perSliEligibility: js.UndefOr[SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility] = js.undefined
  
  /**
    * Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers specified in the service SLO configuration. Field is mandatory and must not be empty.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata](x: Self) {
    
    inline def setNodes(value: js.Array[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPerSliEligibility(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility): Self = StObject.set(x, "perSliEligibility", value.asInstanceOf[js.Any])
    
    inline def setPerSliEligibilityUndefined: Self = StObject.set(x, "perSliEligibility", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
