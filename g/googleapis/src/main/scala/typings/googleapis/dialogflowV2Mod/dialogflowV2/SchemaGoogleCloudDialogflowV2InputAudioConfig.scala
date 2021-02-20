package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instructs the speech recognizer how to process the audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2InputAudioConfig extends StObject {
  
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
object SchemaGoogleCloudDialogflowV2InputAudioConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2InputAudioConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2InputAudioConfigMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2InputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    @scala.inline
    def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value :_*))
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
  }
}
