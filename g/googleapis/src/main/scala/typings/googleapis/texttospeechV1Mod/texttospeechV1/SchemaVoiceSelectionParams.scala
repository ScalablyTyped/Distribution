package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of which voice to use for a synthesis request.
  */
@js.native
trait SchemaVoiceSelectionParams extends js.Object {
  
  /**
    * The language (and optionally also the region) of the voice expressed as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
    * &quot;en-US&quot;. Required. This should not include a script tag (e.g.
    * use &quot;cmn-cn&quot; rather than &quot;cmn-Hant-cn&quot;), because the
    * script will be inferred from the input provided in the SynthesisInput.
    * The TTS service will use this parameter to help choose an appropriate
    * voice.  Note that the TTS service may choose a voice with a slightly
    * different language code than the one selected; it may substitute a
    * different region (e.g. using en-US rather than en-CA if there isn&#39;t a
    * Canadian voice available), or even a different language, e.g. using
    * &quot;nb&quot; (Norwegian Bokmal) instead of &quot;no&quot;
    * (Norwegian)&quot;.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * The name of the voice. Optional; if not set, the service will choose a
    * voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The preferred gender of the voice. Optional; if not set, the service will
    * choose a voice based on the other parameters such as language_code and
    * name. Note that this is only a preference, not requirement; if a voice of
    * the appropriate gender is not available, the synthesizer should
    * substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}
object SchemaVoiceSelectionParams {
  
  @scala.inline
  def apply(): SchemaVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoiceSelectionParams]
  }
  
  @scala.inline
  implicit class SchemaVoiceSelectionParamsOps[Self <: SchemaVoiceSelectionParams] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSsmlGender(value: String): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmlGender: Self = this.set("ssmlGender", js.undefined)
  }
}
