package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata extends StObject {
  
  /**
    * The location of the node, if different from instance location.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the node. This should be equal to SaasInstanceNode.node_id.
    */
  var nodeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If present, this will override eligibility for the node coming from instance or exclusions for specified SLIs.
    */
  var perSliEligibility: js.UndefOr[SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdNull: Self = StObject.set(x, "nodeId", null)
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setPerSliEligibility(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility): Self = StObject.set(x, "perSliEligibility", value.asInstanceOf[js.Any])
    
    inline def setPerSliEligibilityUndefined: Self = StObject.set(x, "perSliEligibility", js.undefined)
  }
}
