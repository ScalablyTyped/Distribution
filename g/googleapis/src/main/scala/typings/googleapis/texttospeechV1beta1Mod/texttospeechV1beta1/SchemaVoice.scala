package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

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
  def apply(
    languageCodes: js.Array[String] = null,
    name: String = null,
    naturalSampleRateHertz: js.UndefOr[Double] = js.undefined,
    ssmlGender: String = null
  ): SchemaVoice = {
    val __obj = js.Dynamic.literal()
    if (languageCodes != null) __obj.updateDynamic("languageCodes")(languageCodes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(naturalSampleRateHertz)) __obj.updateDynamic("naturalSampleRateHertz")(naturalSampleRateHertz.get.asInstanceOf[js.Any])
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVoice]
  }
}

