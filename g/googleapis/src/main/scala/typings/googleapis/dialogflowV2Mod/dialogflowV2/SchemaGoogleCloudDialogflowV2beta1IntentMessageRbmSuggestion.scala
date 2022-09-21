package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion extends StObject {
  
  /**
    * Predefined client side actions that user can choose
    */
  var action: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction] = js.undefined
  
  /**
    * Predefined replies for user to select instead of typing
    */
  var reply: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion](x: Self) {
    
    inline def setAction(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setReply(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
  }
}
