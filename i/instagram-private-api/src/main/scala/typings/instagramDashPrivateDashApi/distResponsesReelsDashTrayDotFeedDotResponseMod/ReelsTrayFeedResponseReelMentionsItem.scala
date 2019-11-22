package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseReelMentionsItem extends js.Object {
  var display_type: String
  var height: Double | String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: String | Double
  var user: ReelsTrayFeedResponseUser
  var width: Double
  var x: Double
  var y: String | Double
  var z: Double
}

object ReelsTrayFeedResponseReelMentionsItem {
  @scala.inline
  def apply(
    display_type: String,
    height: Double | String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: String | Double,
    user: ReelsTrayFeedResponseUser,
    width: Double,
    x: Double,
    y: String | Double,
    z: Double
  ): ReelsTrayFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(display_type = display_type, height = height.asInstanceOf[js.Any], is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation.asInstanceOf[js.Any], user = user, width = width, x = x, y = y.asInstanceOf[js.Any], z = z)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseReelMentionsItem]
  }
}

