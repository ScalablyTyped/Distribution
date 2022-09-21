package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreConfig extends StObject {
  
  /**
    * Restore all namespaced resources in the Backup if set to "True". Specifying this field to "False" is an error.
    */
  var allNamespaces: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Defines the behavior for handling the situation where cluster-scoped resources being restored already exist in the target cluster. This MUST be set to a value other than CLUSTER_RESOURCE_CONFLICT_POLICY_UNSPECIFIED if cluster_resource_restore_scope is not empty.
    */
  var clusterResourceConflictPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the cluster-scoped resources to restore from the Backup. Not specifying it means NO cluster resource will be restored.
    */
  var clusterResourceRestoreScope: js.UndefOr[SchemaClusterResourceRestoreScope] = js.undefined
  
  /**
    * Defines the behavior for handling the situation where sets of namespaced resources being restored already exist in the target cluster. This MUST be set to a value other than NAMESPACED_RESOURCE_RESTORE_MODE_UNSPECIFIED.
    */
  var namespacedResourceRestoreMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of selected ProtectedApplications to restore. The listed ProtectedApplications and all the resources to which they refer will be restored.
    */
  var selectedApplications: js.UndefOr[SchemaNamespacedNames] = js.undefined
  
  /**
    * A list of selected Namespaces to restore from the Backup. The listed Namespaces and all resources contained in them will be restored.
    */
  var selectedNamespaces: js.UndefOr[SchemaNamespaces] = js.undefined
  
  /**
    * A list of transformation rules to be applied against Kubernetes resources as they are selected for restoration from a Backup. Rules are executed in order defined - this order matters, as changes made by a rule may impact the filtering logic of subsequent rules. An empty list means no substitution will occur.
    */
  var substitutionRules: js.UndefOr[js.Array[SchemaSubstitutionRule]] = js.undefined
  
  /**
    * Specifies the mechanism to be used to restore volume data. Default: VOLUME_DATA_RESTORE_POLICY_UNSPECIFIED (will be treated as NO_VOLUME_DATA_RESTORATION).
    */
  var volumeDataRestorePolicy: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreConfig {
  
  inline def apply(): SchemaRestoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreConfig]
  }
  
  extension [Self <: SchemaRestoreConfig](x: Self) {
    
    inline def setAllNamespaces(value: Boolean): Self = StObject.set(x, "allNamespaces", value.asInstanceOf[js.Any])
    
    inline def setAllNamespacesNull: Self = StObject.set(x, "allNamespaces", null)
    
    inline def setAllNamespacesUndefined: Self = StObject.set(x, "allNamespaces", js.undefined)
    
    inline def setClusterResourceConflictPolicy(value: String): Self = StObject.set(x, "clusterResourceConflictPolicy", value.asInstanceOf[js.Any])
    
    inline def setClusterResourceConflictPolicyNull: Self = StObject.set(x, "clusterResourceConflictPolicy", null)
    
    inline def setClusterResourceConflictPolicyUndefined: Self = StObject.set(x, "clusterResourceConflictPolicy", js.undefined)
    
    inline def setClusterResourceRestoreScope(value: SchemaClusterResourceRestoreScope): Self = StObject.set(x, "clusterResourceRestoreScope", value.asInstanceOf[js.Any])
    
    inline def setClusterResourceRestoreScopeUndefined: Self = StObject.set(x, "clusterResourceRestoreScope", js.undefined)
    
    inline def setNamespacedResourceRestoreMode(value: String): Self = StObject.set(x, "namespacedResourceRestoreMode", value.asInstanceOf[js.Any])
    
    inline def setNamespacedResourceRestoreModeNull: Self = StObject.set(x, "namespacedResourceRestoreMode", null)
    
    inline def setNamespacedResourceRestoreModeUndefined: Self = StObject.set(x, "namespacedResourceRestoreMode", js.undefined)
    
    inline def setSelectedApplications(value: SchemaNamespacedNames): Self = StObject.set(x, "selectedApplications", value.asInstanceOf[js.Any])
    
    inline def setSelectedApplicationsUndefined: Self = StObject.set(x, "selectedApplications", js.undefined)
    
    inline def setSelectedNamespaces(value: SchemaNamespaces): Self = StObject.set(x, "selectedNamespaces", value.asInstanceOf[js.Any])
    
    inline def setSelectedNamespacesUndefined: Self = StObject.set(x, "selectedNamespaces", js.undefined)
    
    inline def setSubstitutionRules(value: js.Array[SchemaSubstitutionRule]): Self = StObject.set(x, "substitutionRules", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionRulesUndefined: Self = StObject.set(x, "substitutionRules", js.undefined)
    
    inline def setSubstitutionRulesVarargs(value: SchemaSubstitutionRule*): Self = StObject.set(x, "substitutionRules", js.Array(value*))
    
    inline def setVolumeDataRestorePolicy(value: String): Self = StObject.set(x, "volumeDataRestorePolicy", value.asInstanceOf[js.Any])
    
    inline def setVolumeDataRestorePolicyNull: Self = StObject.set(x, "volumeDataRestorePolicy", null)
    
    inline def setVolumeDataRestorePolicyUndefined: Self = StObject.set(x, "volumeDataRestorePolicy", js.undefined)
  }
}
