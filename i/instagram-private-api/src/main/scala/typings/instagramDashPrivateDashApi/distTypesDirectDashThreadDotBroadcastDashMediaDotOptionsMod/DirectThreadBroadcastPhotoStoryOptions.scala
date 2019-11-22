package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashMediaDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.once
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.replayable
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.story
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastPhotoStoryOptions extends DirectThreadBroadcastStoryOptions {
  var file: Buffer
}

object DirectThreadBroadcastPhotoStoryOptions {
  @scala.inline
  def apply(
    file: Buffer,
    replyType: story | String = null,
    uploadId: Int | Double = null,
    viewMode: replayable | once | String = null
  ): DirectThreadBroadcastPhotoStoryOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (replyType != null) __obj.updateDynamic("replyType")(replyType.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastPhotoStoryOptions]
  }
}

