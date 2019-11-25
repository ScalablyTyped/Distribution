package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseReelMentionsItem extends js.Object {
  var height: Double | String
  var is_hidden: Double
  var is_pinned: Double
  var rotation: Double
  var user: TagFeedResponseUser
  var width: Double | String
  var x: Double | String
  var y: Double | String
  var z: Double
}

object TagFeedResponseReelMentionsItem {
  @scala.inline
  def apply(
    height: Double | String,
    is_hidden: Double,
    is_pinned: Double,
    rotation: Double,
    user: TagFeedResponseUser,
    width: Double | String,
    x: Double | String,
    y: Double | String,
    z: Double
  ): TagFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagFeedResponseReelMentionsItem]
  }
}

