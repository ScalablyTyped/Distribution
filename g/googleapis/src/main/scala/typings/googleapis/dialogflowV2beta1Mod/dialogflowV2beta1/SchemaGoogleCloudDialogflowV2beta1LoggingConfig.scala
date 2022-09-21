package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1LoggingConfig extends StObject {
  
  /**
    * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
    */
  var enableStackdriverLogging: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1LoggingConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1LoggingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1LoggingConfig](x: Self) {
    
    inline def setEnableStackdriverLogging(value: Boolean): Self = StObject.set(x, "enableStackdriverLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableStackdriverLoggingNull: Self = StObject.set(x, "enableStackdriverLogging", null)
    
    inline def setEnableStackdriverLoggingUndefined: Self = StObject.set(x, "enableStackdriverLogging", js.undefined)
  }
}
