package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings extends StObject {
  
  /**
    * If true, DF Interaction logging is currently enabled.
    */
  var enableInteractionLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, StackDriver logging is currently enabled.
    */
  var enableStackdriverLogging: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettings](x: Self) {
    
    inline def setEnableInteractionLogging(value: Boolean): Self = StObject.set(x, "enableInteractionLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractionLoggingNull: Self = StObject.set(x, "enableInteractionLogging", null)
    
    inline def setEnableInteractionLoggingUndefined: Self = StObject.set(x, "enableInteractionLogging", js.undefined)
    
    inline def setEnableStackdriverLogging(value: Boolean): Self = StObject.set(x, "enableStackdriverLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverLoggingNull: Self = StObject.set(x, "enableStackdriverLogging", null)
    
    inline def setEnableStackdriverLoggingUndefined: Self = StObject.set(x, "enableStackdriverLogging", js.undefined)
  }
}
