package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings extends StObject {
  
  /** If true, DF Interaction logging is currently enabled. */
  var enableInteractionLogging: js.UndefOr[Boolean] = js.undefined
  
  /** If true, StackDriver logging is currently enabled. */
  var enableStackdriverLogging: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettings](x: Self) {
    
    inline def setEnableInteractionLogging(value: Boolean): Self = StObject.set(x, "enableInteractionLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractionLoggingUndefined: Self = StObject.set(x, "enableInteractionLogging", js.undefined)
    
    inline def setEnableStackdriverLogging(value: Boolean): Self = StObject.set(x, "enableStackdriverLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverLoggingUndefined: Self = StObject.set(x, "enableStackdriverLogging", js.undefined)
  }
}
