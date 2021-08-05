package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional. Contains information about a button.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageCardButton extends StObject {
  
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageCardButton {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCardButton]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageCardButton](x: Self) {
    
    inline def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
    
    inline def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
