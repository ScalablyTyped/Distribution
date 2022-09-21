package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton extends StObject {
  
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton](x: Self) {
    
    inline def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
    
    inline def setPostbackNull: Self = StObject.set(x, "postback", null)
    
    inline def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
