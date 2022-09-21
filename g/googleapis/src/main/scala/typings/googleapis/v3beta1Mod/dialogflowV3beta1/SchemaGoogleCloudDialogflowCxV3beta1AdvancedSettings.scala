package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettings extends StObject {
  
  /**
    * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
    */
  var loggingSettings: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettings](x: Self) {
    
    inline def setLoggingSettings(value: SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings): Self = StObject.set(x, "loggingSettings", value.asInstanceOf[js.Any])
    
    inline def setLoggingSettingsUndefined: Self = StObject.set(x, "loggingSettings", js.undefined)
  }
}
