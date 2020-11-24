package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyEnforcementRule extends js.Object {
  
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
  implicit class PolicyEnforcementRuleOps[Self <: PolicyEnforcementRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockAction(value: BlockAction): Self = this.set("blockAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockAction: Self = this.set("blockAction", js.undefined)
    
    @scala.inline
    def setSettingName(value: String): Self = this.set("settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingName: Self = this.set("settingName", js.undefined)
    
    @scala.inline
    def setWipeAction(value: WipeAction): Self = this.set("wipeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWipeAction: Self = this.set("wipeAction", js.undefined)
  }
}
