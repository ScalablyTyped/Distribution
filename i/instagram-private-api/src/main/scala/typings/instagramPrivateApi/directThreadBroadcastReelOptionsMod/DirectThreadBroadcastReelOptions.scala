package typings.instagramPrivateApi.directThreadBroadcastReelOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.photo_
import typings.instagramPrivateApi.instagramPrivateApiStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastReelOptions extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[photo_ | video_] = js.undefined
  var reelId: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object DirectThreadBroadcastReelOptions {
  @scala.inline
  def apply(mediaId: String, mediaType: photo_ | video_ = null, reelId: String = null, text: String = null): DirectThreadBroadcastReelOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (reelId != null) __obj.updateDynamic("reelId")(reelId.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastReelOptions]
  }
}

