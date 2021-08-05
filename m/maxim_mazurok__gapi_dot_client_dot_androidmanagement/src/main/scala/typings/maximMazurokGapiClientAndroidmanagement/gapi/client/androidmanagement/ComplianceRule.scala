package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceRule extends StObject {
  
  /** A condition which is satisfied if the Android Framework API level on the device doesn't meet a minimum requirement. */
  var apiLevelCondition: js.UndefOr[ApiLevelCondition] = js.undefined
  
  /**
    * If set to true, the rule includes a mitigating action to disable apps so that the device is effectively disabled, but app data is preserved. If the device is running an app in
    * locked task mode, the app will be closed and a UI showing the reason for non-compliance will be displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.undefined
  
  /** A condition which is satisfied if there exists any matching NonComplianceDetail for the device. */
  var nonComplianceDetailCondition: js.UndefOr[NonComplianceDetailCondition] = js.undefined
  
  /** If set, the rule includes a mitigating action to disable apps specified in the list, but app data is preserved. */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.undefined
}
object ComplianceRule {
  
  inline def apply(): ComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceRule]
  }
  
  extension [Self <: ComplianceRule](x: Self) {
    
    inline def setApiLevelCondition(value: ApiLevelCondition): Self = StObject.set(x, "apiLevelCondition", value.asInstanceOf[js.Any])
    
    inline def setApiLevelConditionUndefined: Self = StObject.set(x, "apiLevelCondition", js.undefined)
    
    inline def setDisableApps(value: Boolean): Self = StObject.set(x, "disableApps", value.asInstanceOf[js.Any])
    
    inline def setDisableAppsUndefined: Self = StObject.set(x, "disableApps", js.undefined)
    
    inline def setNonComplianceDetailCondition(value: NonComplianceDetailCondition): Self = StObject.set(x, "nonComplianceDetailCondition", value.asInstanceOf[js.Any])
    
    inline def setNonComplianceDetailConditionUndefined: Self = StObject.set(x, "nonComplianceDetailCondition", js.undefined)
    
    inline def setPackageNamesToDisable(value: js.Array[String]): Self = StObject.set(x, "packageNamesToDisable", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesToDisableUndefined: Self = StObject.set(x, "packageNamesToDisable", js.undefined)
    
    inline def setPackageNamesToDisableVarargs(value: String*): Self = StObject.set(x, "packageNamesToDisable", js.Array(value :_*))
  }
}
