package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3AdvancedSettings extends StObject {
  
  /** Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level. */
  var loggingSettings: js.UndefOr[GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings] = js.undefined
}
object GoogleCloudDialogflowCxV3AdvancedSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3AdvancedSettings]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3AdvancedSettings](x: Self) {
    
    inline def setLoggingSettings(value: GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings): Self = StObject.set(x, "loggingSettings", value.asInstanceOf[js.Any])
    
    inline def setLoggingSettingsUndefined: Self = StObject.set(x, "loggingSettings", js.undefined)
  }
}
