package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyAssociation extends StObject {
  
  /** The target that the firewall policy is attached to. */
  var attachmentTarget: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Deprecated, please use short name instead. The display name of the firewall policy of the association. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The firewall policy ID of the association. */
  var firewallPolicyId: js.UndefOr[String] = js.undefined
  
  /** The name for an association. */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The short name of the firewall policy of the association. */
  var shortName: js.UndefOr[String] = js.undefined
}
object FirewallPolicyAssociation {
  
  inline def apply(): FirewallPolicyAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallPolicyAssociation] (val x: Self) extends AnyVal {
    
    inline def setAttachmentTarget(value: String): Self = StObject.set(x, "attachmentTarget", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTargetUndefined: Self = StObject.set(x, "attachmentTarget", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirewallPolicyId(value: String): Self = StObject.set(x, "firewallPolicyId", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyIdUndefined: Self = StObject.set(x, "firewallPolicyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
