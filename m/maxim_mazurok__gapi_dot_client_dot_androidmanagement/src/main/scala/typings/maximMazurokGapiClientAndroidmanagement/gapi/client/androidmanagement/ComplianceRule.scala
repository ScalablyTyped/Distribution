package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceRule extends StObject {
  
  /** A condition which is satisfied if the Android Framework API level on the device doesn't meet a minimum requirement. */
  var apiLevelCondition: js.UndefOr[ApiLevelCondition] = js.native
  
  /**
    * If set to true, the rule includes a mitigating action to disable apps so that the device is effectively disabled, but app data is preserved. If the device is running an app in
    * locked task mode, the app will be closed and a UI showing the reason for non-compliance will be displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.native
  
  /** A condition which is satisfied if there exists any matching NonComplianceDetail for the device. */
  var nonComplianceDetailCondition: js.UndefOr[NonComplianceDetailCondition] = js.native
  
  /** If set, the rule includes a mitigating action to disable apps specified in the list, but app data is preserved. */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.native
}
object ComplianceRule {
  
  @scala.inline
  def apply(): ComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceRule]
  }
  
  @scala.inline
  implicit class ComplianceRuleMutableBuilder[Self <: ComplianceRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiLevelCondition(value: ApiLevelCondition): Self = StObject.set(x, "apiLevelCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiLevelConditionUndefined: Self = StObject.set(x, "apiLevelCondition", js.undefined)
    
    @scala.inline
    def setDisableApps(value: Boolean): Self = StObject.set(x, "disableApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAppsUndefined: Self = StObject.set(x, "disableApps", js.undefined)
    
    @scala.inline
    def setNonComplianceDetailCondition(value: NonComplianceDetailCondition): Self = StObject.set(x, "nonComplianceDetailCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonComplianceDetailConditionUndefined: Self = StObject.set(x, "nonComplianceDetailCondition", js.undefined)
    
    @scala.inline
    def setPackageNamesToDisable(value: js.Array[String]): Self = StObject.set(x, "packageNamesToDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNamesToDisableUndefined: Self = StObject.set(x, "packageNamesToDisable", js.undefined)
    
    @scala.inline
    def setPackageNamesToDisableVarargs(value: String*): Self = StObject.set(x, "packageNamesToDisable", js.Array(value :_*))
  }
}
