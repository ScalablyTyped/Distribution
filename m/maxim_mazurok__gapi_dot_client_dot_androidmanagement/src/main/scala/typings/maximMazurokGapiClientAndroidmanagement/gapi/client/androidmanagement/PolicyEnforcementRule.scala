package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyEnforcementRule extends StObject {
  
  /**
    * An action to block access to apps and data on a fully managed device or in a work profile. This action also triggers a user-facing notification with information (where possible) on
    * how to correct the compliance issue. Note: wipeAction must also be specified.
    */
  var blockAction: js.UndefOr[BlockAction] = js.native
  
  /** The top-level policy to enforce. For example, applications or passwordPolicies. */
  var settingName: js.UndefOr[String] = js.native
  
  /** An action to reset a fully managed device or delete a work profile. Note: blockAction must also be specified. */
  var wipeAction: js.UndefOr[WipeAction] = js.native
}
object PolicyEnforcementRule {
  
  @scala.inline
  def apply(): PolicyEnforcementRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyEnforcementRule]
  }
  
  @scala.inline
  implicit class PolicyEnforcementRuleMutableBuilder[Self <: PolicyEnforcementRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockAction(value: BlockAction): Self = StObject.set(x, "blockAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockActionUndefined: Self = StObject.set(x, "blockAction", js.undefined)
    
    @scala.inline
    def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    @scala.inline
    def setWipeAction(value: WipeAction): Self = StObject.set(x, "wipeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWipeActionUndefined: Self = StObject.set(x, "wipeAction", js.undefined)
  }
}
