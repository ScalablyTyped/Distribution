package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementMembershipSpec extends StObject {
  
  /**
    * Binauthz conifguration for the cluster.
    */
  var binauthz: js.UndefOr[SchemaConfigManagementBinauthzConfig] = js.undefined
  
  /**
    * Config Sync configuration for the cluster.
    */
  var configSync: js.UndefOr[SchemaConfigManagementConfigSync] = js.undefined
  
  /**
    * Hierarchy Controller configuration for the cluster.
    */
  var hierarchyController: js.UndefOr[SchemaConfigManagementHierarchyControllerConfig] = js.undefined
  
  /**
    * Policy Controller configuration for the cluster.
    */
  var policyController: js.UndefOr[SchemaConfigManagementPolicyController] = js.undefined
  
  /**
    * Version of ACM installed.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementMembershipSpec {
  
  inline def apply(): SchemaConfigManagementMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementMembershipSpec]
  }
  
  extension [Self <: SchemaConfigManagementMembershipSpec](x: Self) {
    
    inline def setBinauthz(value: SchemaConfigManagementBinauthzConfig): Self = StObject.set(x, "binauthz", value.asInstanceOf[js.Any])
    
    inline def setBinauthzUndefined: Self = StObject.set(x, "binauthz", js.undefined)
    
    inline def setConfigSync(value: SchemaConfigManagementConfigSync): Self = StObject.set(x, "configSync", value.asInstanceOf[js.Any])
    
    inline def setConfigSyncUndefined: Self = StObject.set(x, "configSync", js.undefined)
    
    inline def setHierarchyController(value: SchemaConfigManagementHierarchyControllerConfig): Self = StObject.set(x, "hierarchyController", value.asInstanceOf[js.Any])
    
    inline def setHierarchyControllerUndefined: Self = StObject.set(x, "hierarchyController", js.undefined)
    
    inline def setPolicyController(value: SchemaConfigManagementPolicyController): Self = StObject.set(x, "policyController", value.asInstanceOf[js.Any])
    
    inline def setPolicyControllerUndefined: Self = StObject.set(x, "policyController", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
