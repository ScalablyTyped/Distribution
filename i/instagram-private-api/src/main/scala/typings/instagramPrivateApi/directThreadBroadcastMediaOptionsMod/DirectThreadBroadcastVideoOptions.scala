package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastVideoOptions extends js.Object {
  var sampled: js.UndefOr[Boolean] = js.undefined
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
  var video: Buffer
}

object DirectThreadBroadcastVideoOptions {
  @scala.inline
  def apply(
    video: Buffer,
    sampled: js.UndefOr[Boolean] = js.undefined,
    transcodeDelay: js.UndefOr[Double] = js.undefined,
    uploadId: String = null
  ): DirectThreadBroadcastVideoOptions = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(sampled)) __obj.updateDynamic("sampled")(sampled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transcodeDelay)) __obj.updateDynamic("transcodeDelay")(transcodeDelay.get.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
  }
}

