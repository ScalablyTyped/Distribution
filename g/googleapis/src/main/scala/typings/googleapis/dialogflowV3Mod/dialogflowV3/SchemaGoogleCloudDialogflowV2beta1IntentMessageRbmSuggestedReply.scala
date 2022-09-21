package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply extends StObject {
  
  /**
    * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested reply. This data will be also forwarded to webhook to allow performing custom business logic.
    */
  var postbackData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suggested reply text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply](x: Self) {
    
    inline def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
    
    inline def setPostbackDataNull: Self = StObject.set(x, "postbackData", null)
    
    inline def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
