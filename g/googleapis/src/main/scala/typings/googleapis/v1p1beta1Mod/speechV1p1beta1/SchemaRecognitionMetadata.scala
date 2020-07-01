package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of audio data to be recognized.
  */
@js.native
trait SchemaRecognitionMetadata extends js.Object {
  /**
    * Description of the content. Eg. &quot;Recordings of federal supreme court
    * hearings from 2012&quot;.
    */
  var audioTopic: js.UndefOr[String] = js.native
  /**
    * The industry vertical to which this speech recognition request most
    * closely applies. This is most indicative of the topics contained in the
    * audio.  Use the 6-digit NAICS code to identify the industry vertical -
    * see https://www.naics.com/search/.
    */
  var industryNaicsCodeOfAudio: js.UndefOr[Double] = js.native
  /**
    * The use case most closely describing the audio content to be recognized.
    */
  var interactionType: js.UndefOr[String] = js.native
  /**
    * The audio type that most closely describes the audio being recognized.
    */
  var microphoneDistance: js.UndefOr[String] = js.native
  /**
    * Obfuscated (privacy-protected) ID of the user, to identify number of
    * unique users using the service.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  /**
    * The original media the speech was recorded on.
    */
  var originalMediaType: js.UndefOr[String] = js.native
  /**
    * Mime type of the original audio file.  For example `audio/m4a`,
    * `audio/x-alaw-basic`, `audio/mp3`, `audio/3gpp`. A list of possible audio
    * mime types is maintained at
    * http://www.iana.org/assignments/media-types/media-types.xhtml#audio
    */
  var originalMimeType: js.UndefOr[String] = js.native
  /**
    * The device used to make the recording.  Examples &#39;Nexus 5X&#39; or
    * &#39;Polycom SoundStation IP 6000&#39; or &#39;POTS&#39; or
    * &#39;VoIP&#39; or &#39;Cardioid Microphone&#39;.
    */
  var recordingDeviceName: js.UndefOr[String] = js.native
  /**
    * The type of device the speech was recorded with.
    */
  var recordingDeviceType: js.UndefOr[String] = js.native
}

object SchemaRecognitionMetadata {
  @scala.inline
  def apply(
    audioTopic: String = null,
    industryNaicsCodeOfAudio: js.UndefOr[Double] = js.undefined,
    interactionType: String = null,
    microphoneDistance: String = null,
    obfuscatedId: String = null,
    originalMediaType: String = null,
    originalMimeType: String = null,
    recordingDeviceName: String = null,
    recordingDeviceType: String = null
  ): SchemaRecognitionMetadata = {
    val __obj = js.Dynamic.literal()
    if (audioTopic != null) __obj.updateDynamic("audioTopic")(audioTopic.asInstanceOf[js.Any])
    if (!js.isUndefined(industryNaicsCodeOfAudio)) __obj.updateDynamic("industryNaicsCodeOfAudio")(industryNaicsCodeOfAudio.get.asInstanceOf[js.Any])
    if (interactionType != null) __obj.updateDynamic("interactionType")(interactionType.asInstanceOf[js.Any])
    if (microphoneDistance != null) __obj.updateDynamic("microphoneDistance")(microphoneDistance.asInstanceOf[js.Any])
    if (obfuscatedId != null) __obj.updateDynamic("obfuscatedId")(obfuscatedId.asInstanceOf[js.Any])
    if (originalMediaType != null) __obj.updateDynamic("originalMediaType")(originalMediaType.asInstanceOf[js.Any])
    if (originalMimeType != null) __obj.updateDynamic("originalMimeType")(originalMimeType.asInstanceOf[js.Any])
    if (recordingDeviceName != null) __obj.updateDynamic("recordingDeviceName")(recordingDeviceName.asInstanceOf[js.Any])
    if (recordingDeviceType != null) __obj.updateDynamic("recordingDeviceType")(recordingDeviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecognitionMetadata]
  }
}

