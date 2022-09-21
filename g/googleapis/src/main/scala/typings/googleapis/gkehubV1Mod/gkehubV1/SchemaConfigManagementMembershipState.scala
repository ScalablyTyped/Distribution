package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementMembershipState extends StObject {
  
  /**
    * The user-defined name for the cluster used by ClusterSelectors to group clusters together. This should match Membership's membership_name, unless the user installed ACM on the cluster manually prior to enabling the ACM hub feature. Unique within a Anthos Config Management installation.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current sync status
    */
  var configSyncState: js.UndefOr[SchemaConfigManagementConfigSyncState] = js.undefined
  
  /**
    * Hierarchy Controller status
    */
  var hierarchyControllerState: js.UndefOr[SchemaConfigManagementHierarchyControllerState] = js.undefined
  
  /**
    * Membership configuration in the cluster. This represents the actual state in the cluster, while the MembershipSpec in the FeatureSpec represents the intended state
    */
  var membershipSpec: js.UndefOr[SchemaConfigManagementMembershipSpec] = js.undefined
  
  /**
    * Current install status of ACM's Operator
    */
  var operatorState: js.UndefOr[SchemaConfigManagementOperatorState] = js.undefined
  
  /**
    * PolicyController status
    */
  var policyControllerState: js.UndefOr[SchemaConfigManagementPolicyControllerState] = js.undefined
}
object SchemaConfigManagementMembershipState {
  
  inline def apply(): SchemaConfigManagementMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementMembershipState]
  }
  
  extension [Self <: SchemaConfigManagementMembershipState](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfigSyncState(value: SchemaConfigManagementConfigSyncState): Self = StObject.set(x, "configSyncState", value.asInstanceOf[js.Any])
    
    inline def setConfigSyncStateUndefined: Self = StObject.set(x, "configSyncState", js.undefined)
    
    inline def setHierarchyControllerState(value: SchemaConfigManagementHierarchyControllerState): Self = StObject.set(x, "hierarchyControllerState", value.asInstanceOf[js.Any])
    
    inline def setHierarchyControllerStateUndefined: Self = StObject.set(x, "hierarchyControllerState", js.undefined)
    
    inline def setMembershipSpec(value: SchemaConfigManagementMembershipSpec): Self = StObject.set(x, "membershipSpec", value.asInstanceOf[js.Any])
    
    inline def setMembershipSpecUndefined: Self = StObject.set(x, "membershipSpec", js.undefined)
    
    inline def setOperatorState(value: SchemaConfigManagementOperatorState): Self = StObject.set(x, "operatorState", value.asInstanceOf[js.Any])
    
    inline def setOperatorStateUndefined: Self = StObject.set(x, "operatorState", js.undefined)
    
    inline def setPolicyControllerState(value: SchemaConfigManagementPolicyControllerState): Self = StObject.set(x, "policyControllerState", value.asInstanceOf[js.Any])
    
    inline def setPolicyControllerStateUndefined: Self = StObject.set(x, "policyControllerState", js.undefined)
  }
}
