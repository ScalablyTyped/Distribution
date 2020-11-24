package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Synthesizes speech and plays back the synthesized audio to the caller in
  * Telephony Gateway.  Telephony Gateway takes the synthesizer settings from
  * `DetectIntentResponse.output_audio_config` which can either be set at
  * request-level or can come from the agent-level synthesizer config.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends js.Object {
  
  /**
    * The SSML to be synthesized. For more information, see
    * [SSML](https://developers.google.com/actions/reference/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSsml(value: String): Self = this.set("ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsml: Self = this.set("ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
