package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3AdvancedSettings extends StObject {
  
  /**
    * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
    */
  var loggingSettings: js.UndefOr[SchemaGoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3AdvancedSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3AdvancedSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3AdvancedSettings](x: Self) {
    
    inline def setLoggingSettings(value: SchemaGoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings): Self = StObject.set(x, "loggingSettings", value.asInstanceOf[js.Any])
    
    inline def setLoggingSettingsUndefined: Self = StObject.set(x, "loggingSettings", js.undefined)
  }
}
