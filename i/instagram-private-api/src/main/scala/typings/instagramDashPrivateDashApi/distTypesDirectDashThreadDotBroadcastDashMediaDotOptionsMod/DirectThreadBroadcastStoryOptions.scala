package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.once
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.replayable
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastStoryOptions extends js.Object {
  var replyType: js.UndefOr[story | String] = js.undefined
  var uploadId: js.UndefOr[Double] = js.undefined
  var viewMode: js.UndefOr[replayable | once | String] = js.undefined
}

object DirectThreadBroadcastStoryOptions {
  @scala.inline
  def apply(
    replyType: story | String = null,
    uploadId: Int | Double = null,
    viewMode: replayable | once | String = null
  ): DirectThreadBroadcastStoryOptions = {
    val __obj = js.Dynamic.literal()
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastStoryOptions]
  }
}

