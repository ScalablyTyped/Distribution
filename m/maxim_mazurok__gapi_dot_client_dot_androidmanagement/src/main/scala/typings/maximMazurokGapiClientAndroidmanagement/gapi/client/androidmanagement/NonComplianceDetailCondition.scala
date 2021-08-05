package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonComplianceDetailCondition extends StObject {
  
  /** The reason the device is not in compliance with the setting. If not set, then this condition matches any reason. */
  var nonComplianceReason: js.UndefOr[String] = js.undefined
  
  /** The package name of the app that's out of compliance. If not set, then this condition matches any package name. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The name of the policy setting. This is the JSON field name of a top-level Policy field. If not set, then this condition matches any setting name. */
  var settingName: js.UndefOr[String] = js.undefined
}
object NonComplianceDetailCondition {
  
  inline def apply(): NonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonComplianceDetailCondition]
  }
  
  extension [Self <: NonComplianceDetailCondition](x: Self) {
    
    inline def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    inline def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    inline def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
  }
}
