package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2LoggingConfig extends StObject {
  
  /**
    * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
    */
  var enableStackdriverLogging: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2LoggingConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2LoggingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2LoggingConfig](x: Self) {
    
    inline def setEnableStackdriverLogging(value: Boolean): Self = StObject.set(x, "enableStackdriverLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverLoggingNull: Self = StObject.set(x, "enableStackdriverLogging", null)
    
    inline def setEnableStackdriverLoggingUndefined: Self = StObject.set(x, "enableStackdriverLogging", js.undefined)
  }
}
