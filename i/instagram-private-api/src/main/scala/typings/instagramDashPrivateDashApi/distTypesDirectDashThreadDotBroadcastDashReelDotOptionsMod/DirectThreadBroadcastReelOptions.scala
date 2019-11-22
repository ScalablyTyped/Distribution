package typings.instagramDashPrivateDashApi.distTypesDirectDashThreadDotBroadcastDashReelDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.photo
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastReelOptions extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[photo | video] = js.undefined
  var reelId: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object DirectThreadBroadcastReelOptions {
  @scala.inline
  def apply(mediaId: String, mediaType: photo | video = null, reelId: String = null, text: String = null): DirectThreadBroadcastReelOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (reelId != null) __obj.updateDynamic("reelId")(reelId)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
  }
}

