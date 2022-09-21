package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecognitionMetadata extends StObject {
  
  /**
    * Description of the content. Eg. "Recordings of federal supreme court hearings from 2012".
    */
  var audioTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The industry vertical to which this speech recognition request most closely applies. This is most indicative of the topics contained in the audio. Use the 6-digit NAICS code to identify the industry vertical - see https://www.naics.com/search/.
    */
  var industryNaicsCodeOfAudio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The use case most closely describing the audio content to be recognized.
    */
  var interactionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The audio type that most closely describes the audio being recognized.
    */
  var microphoneDistance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original media the speech was recorded on.
    */
  var originalMediaType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mime type of the original audio file. For example `audio/m4a`, `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`. A list of possible audio mime types is maintained at http://www.iana.org/assignments/media-types/media-types.xhtml#audio
    */
  var originalMimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device used to make the recording. Examples 'Nexus 5X' or 'Polycom SoundStation IP 6000' or 'POTS' or 'VoIP' or 'Cardioid Microphone'.
    */
  var recordingDeviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of device the speech was recorded with.
    */
  var recordingDeviceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRecognitionMetadata {
  
  inline def apply(): SchemaRecognitionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionMetadata]
  }
  
  extension [Self <: SchemaRecognitionMetadata](x: Self) {
    
    inline def setAudioTopic(value: String): Self = StObject.set(x, "audioTopic", value.asInstanceOf[js.Any])
    
    inline def setAudioTopicNull: Self = StObject.set(x, "audioTopic", null)
    
    inline def setAudioTopicUndefined: Self = StObject.set(x, "audioTopic", js.undefined)
    
    inline def setIndustryNaicsCodeOfAudio(value: Double): Self = StObject.set(x, "industryNaicsCodeOfAudio", value.asInstanceOf[js.Any])
    
    inline def setIndustryNaicsCodeOfAudioNull: Self = StObject.set(x, "industryNaicsCodeOfAudio", null)
    
    inline def setIndustryNaicsCodeOfAudioUndefined: Self = StObject.set(x, "industryNaicsCodeOfAudio", js.undefined)
    
    inline def setInteractionType(value: String): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    inline def setInteractionTypeNull: Self = StObject.set(x, "interactionType", null)
    
    inline def setInteractionTypeUndefined: Self = StObject.set(x, "interactionType", js.undefined)
    
    inline def setMicrophoneDistance(value: String): Self = StObject.set(x, "microphoneDistance", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneDistanceNull: Self = StObject.set(x, "microphoneDistance", null)
    
    inline def setMicrophoneDistanceUndefined: Self = StObject.set(x, "microphoneDistance", js.undefined)
    
    inline def setOriginalMediaType(value: String): Self = StObject.set(x, "originalMediaType", value.asInstanceOf[js.Any])
    
    inline def setOriginalMediaTypeNull: Self = StObject.set(x, "originalMediaType", null)
    
    inline def setOriginalMediaTypeUndefined: Self = StObject.set(x, "originalMediaType", js.undefined)
    
    inline def setOriginalMimeType(value: String): Self = StObject.set(x, "originalMimeType", value.asInstanceOf[js.Any])
    
    inline def setOriginalMimeTypeNull: Self = StObject.set(x, "originalMimeType", null)
    
    inline def setOriginalMimeTypeUndefined: Self = StObject.set(x, "originalMimeType", js.undefined)
    
    inline def setRecordingDeviceName(value: String): Self = StObject.set(x, "recordingDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRecordingDeviceNameNull: Self = StObject.set(x, "recordingDeviceName", null)
    
    inline def setRecordingDeviceNameUndefined: Self = StObject.set(x, "recordingDeviceName", js.undefined)
    
    inline def setRecordingDeviceType(value: String): Self = StObject.set(x, "recordingDeviceType", value.asInstanceOf[js.Any])
    
    inline def setRecordingDeviceTypeNull: Self = StObject.set(x, "recordingDeviceType", null)
    
    inline def setRecordingDeviceTypeUndefined: Self = StObject.set(x, "recordingDeviceType", js.undefined)
  }
}
