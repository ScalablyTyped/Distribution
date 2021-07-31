package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of audio data to be recognized.
  */
trait SchemaRecognitionMetadata extends StObject {
  
  /**
    * Description of the content. Eg. &quot;Recordings of federal supreme court
    * hearings from 2012&quot;.
    */
  var audioTopic: js.UndefOr[String] = js.undefined
  
  /**
    * The industry vertical to which this speech recognition request most
    * closely applies. This is most indicative of the topics contained in the
    * audio.  Use the 6-digit NAICS code to identify the industry vertical -
    * see https://www.naics.com/search/.
    */
  var industryNaicsCodeOfAudio: js.UndefOr[Double] = js.undefined
  
  /**
    * The use case most closely describing the audio content to be recognized.
    */
  var interactionType: js.UndefOr[String] = js.undefined
  
  /**
    * The audio type that most closely describes the audio being recognized.
    */
  var microphoneDistance: js.UndefOr[String] = js.undefined
  
  /**
    * Obfuscated (privacy-protected) ID of the user, to identify number of
    * unique users using the service.
    */
  var obfuscatedId: js.UndefOr[String] = js.undefined
  
  /**
    * The original media the speech was recorded on.
    */
  var originalMediaType: js.UndefOr[String] = js.undefined
  
  /**
    * Mime type of the original audio file.  For example `audio/m4a`,
    * `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`. A list of possible audio
    * mime types is maintained at
    * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
    */
  var originalMimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The device used to make the recording.  Examples &#39;Nexus 5X&#39; or
    * &#39;Polycom SoundStation IP 6000&#39; or &#39;POTS&#39; or
    * &#39;VoIP&#39; or &#39;Cardioid Microphone&#39;.
    */
  var recordingDeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of device the speech was recorded with.
    */
  var recordingDeviceType: js.UndefOr[String] = js.undefined
}
object SchemaRecognitionMetadata {
  
  @scala.inline
  def apply(): SchemaRecognitionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognitionMetadata]
  }
  
  @scala.inline
  implicit class SchemaRecognitionMetadataMutableBuilder[Self <: SchemaRecognitionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioTopic(value: String): Self = StObject.set(x, "audioTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTopicUndefined: Self = StObject.set(x, "audioTopic", js.undefined)
    
    @scala.inline
    def setIndustryNaicsCodeOfAudio(value: Double): Self = StObject.set(x, "industryNaicsCodeOfAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryNaicsCodeOfAudioUndefined: Self = StObject.set(x, "industryNaicsCodeOfAudio", js.undefined)
    
    @scala.inline
    def setInteractionType(value: String): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionTypeUndefined: Self = StObject.set(x, "interactionType", js.undefined)
    
    @scala.inline
    def setMicrophoneDistance(value: String): Self = StObject.set(x, "microphoneDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophoneDistanceUndefined: Self = StObject.set(x, "microphoneDistance", js.undefined)
    
    @scala.inline
    def setObfuscatedId(value: String): Self = StObject.set(x, "obfuscatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscatedIdUndefined: Self = StObject.set(x, "obfuscatedId", js.undefined)
    
    @scala.inline
    def setOriginalMediaType(value: String): Self = StObject.set(x, "originalMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalMediaTypeUndefined: Self = StObject.set(x, "originalMediaType", js.undefined)
    
    @scala.inline
    def setOriginalMimeType(value: String): Self = StObject.set(x, "originalMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalMimeTypeUndefined: Self = StObject.set(x, "originalMimeType", js.undefined)
    
    @scala.inline
    def setRecordingDeviceName(value: String): Self = StObject.set(x, "recordingDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDeviceNameUndefined: Self = StObject.set(x, "recordingDeviceName", js.undefined)
    
    @scala.inline
    def setRecordingDeviceType(value: String): Self = StObject.set(x, "recordingDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDeviceTypeUndefined: Self = StObject.set(x, "recordingDeviceType", js.undefined)
  }
}
