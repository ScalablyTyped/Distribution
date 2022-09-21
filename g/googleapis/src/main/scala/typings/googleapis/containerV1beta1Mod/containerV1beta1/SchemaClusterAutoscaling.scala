package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterAutoscaling extends StObject {
  
  /**
    * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
    */
  var autoprovisioningLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
    */
  var autoprovisioningNodePoolDefaults: js.UndefOr[SchemaAutoprovisioningNodePoolDefaults] = js.undefined
  
  /**
    * Defines autoscaling behaviour.
    */
  var autoscalingProfile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[SchemaResourceLimit]] = js.undefined
}
object SchemaClusterAutoscaling {
  
  inline def apply(): SchemaClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterAutoscaling]
  }
  
  extension [Self <: SchemaClusterAutoscaling](x: Self) {
    
    inline def setAutoprovisioningLocations(value: js.Array[String]): Self = StObject.set(x, "autoprovisioningLocations", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisioningLocationsNull: Self = StObject.set(x, "autoprovisioningLocations", null)
    
    inline def setAutoprovisioningLocationsUndefined: Self = StObject.set(x, "autoprovisioningLocations", js.undefined)
    
    inline def setAutoprovisioningLocationsVarargs(value: String*): Self = StObject.set(x, "autoprovisioningLocations", js.Array(value*))
    
    inline def setAutoprovisioningNodePoolDefaults(value: SchemaAutoprovisioningNodePoolDefaults): Self = StObject.set(x, "autoprovisioningNodePoolDefaults", value.asInstanceOf[js.Any])
    
    inline def setAutoprovisioningNodePoolDefaultsUndefined: Self = StObject.set(x, "autoprovisioningNodePoolDefaults", js.undefined)
    
    inline def setAutoscalingProfile(value: String): Self = StObject.set(x, "autoscalingProfile", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingProfileNull: Self = StObject.set(x, "autoscalingProfile", null)
    
    inline def setAutoscalingProfileUndefined: Self = StObject.set(x, "autoscalingProfile", js.undefined)
    
    inline def setEnableNodeAutoprovisioning(value: Boolean): Self = StObject.set(x, "enableNodeAutoprovisioning", value.asInstanceOf[js.Any])
    
    inline def setEnableNodeAutoprovisioningNull: Self = StObject.set(x, "enableNodeAutoprovisioning", null)
    
    inline def setEnableNodeAutoprovisioningUndefined: Self = StObject.set(x, "enableNodeAutoprovisioning", js.undefined)
    
    inline def setResourceLimits(value: js.Array[SchemaResourceLimit]): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    
    inline def setResourceLimitsVarargs(value: SchemaResourceLimit*): Self = StObject.set(x, "resourceLimits", js.Array(value*))
  }
}
