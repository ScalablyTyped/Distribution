package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText extends StObject {
  
  /**
    * Optional. One or more suggestions to show to the user.
    */
  var rbmSuggestion: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]] = js.undefined
  
  /**
    * Required. Text sent and displayed to the user.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText](x: Self) {
    
    inline def setRbmSuggestion(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]): Self = StObject.set(x, "rbmSuggestion", value.asInstanceOf[js.Any])
    
    inline def setRbmSuggestionUndefined: Self = StObject.set(x, "rbmSuggestion", js.undefined)
    
    inline def setRbmSuggestionVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion*): Self = StObject.set(x, "rbmSuggestion", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
