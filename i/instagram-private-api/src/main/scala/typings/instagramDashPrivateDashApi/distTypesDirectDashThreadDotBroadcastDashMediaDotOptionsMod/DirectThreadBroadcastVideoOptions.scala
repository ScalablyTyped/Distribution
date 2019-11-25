package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod

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
    transcodeDelay: Int | Double = null,
    uploadId: String = null
  ): DirectThreadBroadcastVideoOptions = {
    val __obj = js.Dynamic.literal(video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(sampled)) __obj.updateDynamic("sampled")(sampled.asInstanceOf[js.Any])
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastVideoOptions]
  }
}

