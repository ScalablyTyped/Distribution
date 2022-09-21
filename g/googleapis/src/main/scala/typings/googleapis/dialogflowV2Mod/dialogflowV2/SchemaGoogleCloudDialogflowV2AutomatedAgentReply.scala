package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AutomatedAgentReply extends StObject {
  
  /**
    * Indicates whether the partial automated agent reply is interruptible when a later reply message arrives. e.g. if the agent specified some music as partial response, it can be cancelled.
    */
  var allowCancellation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * AutomatedAgentReply type.
    */
  var automatedAgentReplyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Response of the Dialogflow Sessions.DetectIntent call.
    */
  var detectIntentResponse: js.UndefOr[SchemaGoogleCloudDialogflowV2DetectIntentResponse] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AutomatedAgentReply {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AutomatedAgentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AutomatedAgentReply]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AutomatedAgentReply](x: Self) {
    
    inline def setAllowCancellation(value: Boolean): Self = StObject.set(x, "allowCancellation", value.asInstanceOf[js.Any])
    
    inline def setAllowCancellationNull: Self = StObject.set(x, "allowCancellation", null)
    
    inline def setAllowCancellationUndefined: Self = StObject.set(x, "allowCancellation", js.undefined)
    
    inline def setAutomatedAgentReplyType(value: String): Self = StObject.set(x, "automatedAgentReplyType", value.asInstanceOf[js.Any])
    
    inline def setAutomatedAgentReplyTypeNull: Self = StObject.set(x, "automatedAgentReplyType", null)
    
    inline def setAutomatedAgentReplyTypeUndefined: Self = StObject.set(x, "automatedAgentReplyType", js.undefined)
    
    inline def setDetectIntentResponse(value: SchemaGoogleCloudDialogflowV2DetectIntentResponse): Self = StObject.set(x, "detectIntentResponse", value.asInstanceOf[js.Any])
    
    inline def setDetectIntentResponseUndefined: Self = StObject.set(x, "detectIntentResponse", js.undefined)
  }
}
