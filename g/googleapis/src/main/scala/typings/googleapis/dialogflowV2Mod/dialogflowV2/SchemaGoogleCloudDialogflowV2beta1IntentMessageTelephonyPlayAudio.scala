package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plays audio from a file in Telephony Gateway.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio extends js.Object {
  /**
    * Required. URI to a Google Cloud Storage object containing the audio to
    * play, e.g., &quot;gs://bucket/object&quot;. The object must contain a
    * single channel (mono) of linear PCM audio (2 bytes / sample) at 8kHz.
    * This object must be readable by the `service-&lt;Project
    * Number&gt;@gcp-sa-dialogflow.iam.gserviceaccount.com` service account
    * where &lt;Project Number&gt; is the number of the Telephony Gateway
    * project (usually the same as the Dialogflow agent project). If the Google
    * Cloud Storage bucket is in the Telephony Gateway project, this permission
    * is added by default when enabling the Dialogflow V2 API.  For audio from
    * other sources, consider using the `TelephonySynthesizeSpeech` message
    * with SSML.
    */
  var audioUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] (val x: Self) extends AnyVal {
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
    def setAudioUri(value: String): Self = this.set("audioUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioUri: Self = this.set("audioUri", js.undefined)
  }
  
}

