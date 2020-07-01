package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpeakerDiarizationConfig extends js.Object {
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Maximum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 6.
    */
  var maxSpeakerCount: js.UndefOr[Double] = js.native
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Minimum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 2.
    */
  var minSpeakerCount: js.UndefOr[Double] = js.native
}

object SchemaSpeakerDiarizationConfig {
  @scala.inline
  def apply(
    enableSpeakerDiarization: js.UndefOr[Boolean] = js.undefined,
    maxSpeakerCount: js.UndefOr[Double] = js.undefined,
    minSpeakerCount: js.UndefOr[Double] = js.undefined
  ): SchemaSpeakerDiarizationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableSpeakerDiarization)) __obj.updateDynamic("enableSpeakerDiarization")(enableSpeakerDiarization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSpeakerCount)) __obj.updateDynamic("maxSpeakerCount")(maxSpeakerCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSpeakerCount)) __obj.updateDynamic("minSpeakerCount")(minSpeakerCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpeakerDiarizationConfig]
  }
}

