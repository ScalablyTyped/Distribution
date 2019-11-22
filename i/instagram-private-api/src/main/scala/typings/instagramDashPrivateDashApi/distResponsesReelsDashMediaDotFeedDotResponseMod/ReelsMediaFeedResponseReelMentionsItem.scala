package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseReelMentionsItem extends js.Object {
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var rotation: Double
  var user: ReelsMediaFeedResponseUser
  var width: String
  var x: String
  var y: String
  var z: Double
}

object ReelsMediaFeedResponseReelMentionsItem {
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    rotation: Double,
    user: ReelsMediaFeedResponseUser,
    width: String,
    x: String,
    y: String,
    z: Double
  ): ReelsMediaFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, rotation = rotation, user = user, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ReelsMediaFeedResponseReelMentionsItem]
  }
}

