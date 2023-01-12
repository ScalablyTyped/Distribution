package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyEnforcementRule extends StObject {
  
  /**
    * An action to block access to apps and data on a fully managed device or in a work profile. This action also triggers a user-facing notification with information (where possible) on
    * how to correct the compliance issue. Note: wipeAction must also be specified.
    */
  var blockAction: js.UndefOr[BlockAction] = js.undefined
  
  /** The top-level policy to enforce. For example, applications or passwordPolicies. */
  var settingName: js.UndefOr[String] = js.undefined
  
  /** An action to reset a fully managed device or delete a work profile. Note: blockAction must also be specified. */
  var wipeAction: js.UndefOr[WipeAction] = js.undefined
}
object PolicyEnforcementRule {
  
  inline def apply(): PolicyEnforcementRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyEnforcementRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyEnforcementRule] (val x: Self) extends AnyVal {
    
    inline def setBlockAction(value: BlockAction): Self = StObject.set(x, "blockAction", value.asInstanceOf[js.Any])
    
    inline def setBlockActionUndefined: Self = StObject.set(x, "blockAction", js.undefined)
    
    inline def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
    
    inline def setWipeAction(value: WipeAction): Self = StObject.set(x, "wipeAction", value.asInstanceOf[js.Any])
    
    inline def setWipeActionUndefined: Self = StObject.set(x, "wipeAction", js.undefined)
  }
}
