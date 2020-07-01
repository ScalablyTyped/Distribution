package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instructs the speech recognizer how to process the audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1InputAudioConfig extends js.Object {
  /**
    * Required. Audio encoding of the audio content to process.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * Required. The language of the supplied audio. Dialogflow does not do
    * translations. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. Which Speech model to select for the given request. Select the
    * model best suited to your domain to get best results. If a model is not
    * explicitly specified, then we auto-select a model based on the parameters
    * in the InputAudioConfig. If enhanced speech model is enabled for the
    * agent and an enhanced version of the specified model for the language
    * does not exist, then the speech is recognized using the standard version
    * of the specified model. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
    * for more details.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of phrase hints which are used to boost accuracy
    * of speech recognition. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
    * for more details.
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query.
    * Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
    * more details.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1InputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: String = null,
    languageCode: String = null,
    model: String = null,
    phraseHints: js.Array[String] = null,
    sampleRateHertz: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudDialogflowV2beta1InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (phraseHints != null) __obj.updateDynamic("phraseHints")(phraseHints.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig]
  }
}

