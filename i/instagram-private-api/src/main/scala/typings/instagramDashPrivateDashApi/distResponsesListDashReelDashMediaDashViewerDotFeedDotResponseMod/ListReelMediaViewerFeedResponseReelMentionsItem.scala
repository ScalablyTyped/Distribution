package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseReelMentionsItem extends js.Object {
  var display_type: String
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var user: ListReelMediaViewerFeedResponseUser
  var width: Double
  var x: Double
  var y: Double
  var z: Double
}

object ListReelMediaViewerFeedResponseReelMentionsItem {
  @scala.inline
  def apply(
    display_type: String,
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    user: ListReelMediaViewerFeedResponseUser,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ListReelMediaViewerFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(display_type = display_type, height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation, user = user, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseReelMentionsItem]
  }
}

