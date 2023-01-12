package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1AudioInput extends StObject {
  
  /**
    * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For
    * non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be
    * provided in all following requests.
    */
  var audio: js.UndefOr[String] = js.undefined
  
  /** Required. Instructs the speech recognizer how to process the speech audio. */
  var config: js.UndefOr[GoogleCloudDialogflowCxV3beta1InputAudioConfig] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1AudioInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1AudioInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1AudioInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1AudioInput] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: GoogleCloudDialogflowCxV3beta1InputAudioConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
