package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The text response message.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageText extends StObject {
  
  /**
    * Optional. The collection of the agent&#39;s responses.
    */
  var text: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageText {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageText]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageText](x: Self) {
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
