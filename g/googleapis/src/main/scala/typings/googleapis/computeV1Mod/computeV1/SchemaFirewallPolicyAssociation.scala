package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPolicyAssociation extends StObject {
  
  /**
    * The target that the firewall policy is attached to.
    */
  var attachmentTarget: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy of the association.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The firewall policy ID of the association.
    */
  var firewallPolicyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for an association.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The short name of the firewall policy of the association.
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirewallPolicyAssociation {
  
  inline def apply(): SchemaFirewallPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPolicyAssociation]
  }
  
  extension [Self <: SchemaFirewallPolicyAssociation](x: Self) {
    
    inline def setAttachmentTarget(value: String): Self = StObject.set(x, "attachmentTarget", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTargetNull: Self = StObject.set(x, "attachmentTarget", null)
    
    inline def setAttachmentTargetUndefined: Self = StObject.set(x, "attachmentTarget", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirewallPolicyId(value: String): Self = StObject.set(x, "firewallPolicyId", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyIdNull: Self = StObject.set(x, "firewallPolicyId", null)
    
    inline def setFirewallPolicyIdUndefined: Self = StObject.set(x, "firewallPolicyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
