package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends StObject {
  
  /**
    * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
    */
  var ssml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech](x: Self) {
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
