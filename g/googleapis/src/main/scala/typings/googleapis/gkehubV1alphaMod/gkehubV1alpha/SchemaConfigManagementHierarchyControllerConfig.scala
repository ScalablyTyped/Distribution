package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementHierarchyControllerConfig extends StObject {
  
  /**
    * Whether hierarchical resource quota is enabled in this cluster.
    */
  var enableHierarchicalResourceQuota: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether pod tree labels are enabled in this cluster.
    */
  var enablePodTreeLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Hierarchy Controller is enabled in this cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigManagementHierarchyControllerConfig {
  
  inline def apply(): SchemaConfigManagementHierarchyControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementHierarchyControllerConfig]
  }
  
  extension [Self <: SchemaConfigManagementHierarchyControllerConfig](x: Self) {
    
    inline def setEnableHierarchicalResourceQuota(value: Boolean): Self = StObject.set(x, "enableHierarchicalResourceQuota", value.asInstanceOf[js.Any])
    
    inline def setEnableHierarchicalResourceQuotaNull: Self = StObject.set(x, "enableHierarchicalResourceQuota", null)
    
    inline def setEnableHierarchicalResourceQuotaUndefined: Self = StObject.set(x, "enableHierarchicalResourceQuota", js.undefined)
    
    inline def setEnablePodTreeLabels(value: Boolean): Self = StObject.set(x, "enablePodTreeLabels", value.asInstanceOf[js.Any])
    
    inline def setEnablePodTreeLabelsNull: Self = StObject.set(x, "enablePodTreeLabels", null)
    
    inline def setEnablePodTreeLabelsUndefined: Self = StObject.set(x, "enablePodTreeLabels", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
