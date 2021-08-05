package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The suggestion chip message that the user can tap to quickly post a reply
  * to the conversation.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageSuggestion extends StObject {
  
  /**
    * Required. The text shown the in the suggestion chip.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageSuggestion {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSuggestion]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageSuggestion](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
