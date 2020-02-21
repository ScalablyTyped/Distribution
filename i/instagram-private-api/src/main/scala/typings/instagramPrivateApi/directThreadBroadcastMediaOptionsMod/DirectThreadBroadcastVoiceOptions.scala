package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastVoiceOptions extends js.Object {
  var file: Buffer
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
  var waveform: js.UndefOr[js.Array[Double]] = js.undefined
  var waveformSamplingFrequencyHz: js.UndefOr[Double] = js.undefined
}

object DirectThreadBroadcastVoiceOptions {
  @scala.inline
  def apply(
    file: Buffer,
    transcodeDelay: Int | Double = null,
    uploadId: String = null,
    waveform: js.Array[Double] = null,
    waveformSamplingFrequencyHz: Int | Double = null
  ): DirectThreadBroadcastVoiceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (waveform != null) __obj.updateDynamic("waveform")(waveform.asInstanceOf[js.Any])
    if (waveformSamplingFrequencyHz != null) __obj.updateDynamic("waveformSamplingFrequencyHz")(waveformSamplingFrequencyHz.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVoiceOptions]
  }
}

