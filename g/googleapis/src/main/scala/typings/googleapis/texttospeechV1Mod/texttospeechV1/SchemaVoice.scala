package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a voice supported by the TTS service.
  */
@js.native
trait SchemaVoice extends js.Object {
  /**
    * The languages that this voice supports, expressed as
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags
    * (e.g. &quot;en-US&quot;, &quot;es-419&quot;, &quot;cmn-tw&quot;).
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of this voice.  Each distinct voice has a unique name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The natural sample rate (in hertz) for this voice.
    */
  var naturalSampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * The gender of this voice.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}

object SchemaVoice {
  @scala.inline
  def apply(): SchemaVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoice]
  }
  @scala.inline
  implicit class SchemaVoiceOps[Self <: SchemaVoice] (val x: Self) extends AnyVal {
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
    def setLanguageCodesVarargs(value: String*): Self = this.set("languageCodes", js.Array(value :_*))
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = this.set("languageCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCodes: Self = this.set("languageCodes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNaturalSampleRateHertz(value: Double): Self = this.set("naturalSampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalSampleRateHertz: Self = this.set("naturalSampleRateHertz", js.undefined)
    @scala.inline
    def setSsmlGender(value: String): Self = this.set("ssmlGender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsmlGender: Self = this.set("ssmlGender", js.undefined)
  }
  
}

