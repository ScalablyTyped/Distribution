package typings.instagramPrivateApi.reelsMediaFeedResponseMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseReelMentionsItem]
  }
}

