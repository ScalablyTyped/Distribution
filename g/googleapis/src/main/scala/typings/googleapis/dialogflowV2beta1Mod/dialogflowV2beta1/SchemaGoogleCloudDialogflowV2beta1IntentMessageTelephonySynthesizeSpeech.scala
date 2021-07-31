package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Synthesizes speech and plays back the synthesized audio to the caller in
  * Telephony Gateway.  Telephony Gateway takes the synthesizer settings from
  * `DetectIntentResponse.output_audio_config` which can either be set at
  * request-level or can come from the agent-level synthesizer config.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends StObject {
  
  /**
    * The SSML to be synthesized. For more information, see
    * [SSML](https://developers.google.com/actions/reference/ssml).
    */
  var ssml: js.UndefOr[String] = js.undefined
  
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
