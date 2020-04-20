package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseRootObject extends js.Object {
  var broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem]
  var face_filter_nux_version: Double
  var has_new_nux_story: Boolean
  var status: String
  var sticker_version: Double
  var stories_viewer_gestures_nux_eligible: Boolean
  var story_ranking_token: String
  var tray: js.Array[ReelsTrayFeedResponseTrayItem]
}

object ReelsTrayFeedResponseRootObject {
  @scala.inline
  def apply(
    broadcasts: js.Array[ReelsTrayFeedResponseBroadcastsItem],
    face_filter_nux_version: Double,
    has_new_nux_story: Boolean,
    status: String,
    sticker_version: Double,
    stories_viewer_gestures_nux_eligible: Boolean,
    story_ranking_token: String,
    tray: js.Array[ReelsTrayFeedResponseTrayItem]
  ): ReelsTrayFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], face_filter_nux_version = face_filter_nux_version.asInstanceOf[js.Any], has_new_nux_story = has_new_nux_story.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sticker_version = sticker_version.asInstanceOf[js.Any], stories_viewer_gestures_nux_eligible = stories_viewer_gestures_nux_eligible.asInstanceOf[js.Any], story_ranking_token = story_ranking_token.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseRootObject]
  }
}

