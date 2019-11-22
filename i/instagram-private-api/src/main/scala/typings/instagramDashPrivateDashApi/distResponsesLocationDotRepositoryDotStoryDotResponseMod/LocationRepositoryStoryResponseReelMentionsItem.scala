package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseReelMentionsItem extends js.Object {
  var display_type: String
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var user: LocationRepositoryStoryResponseUser
  var width: String
  var x: String
  var y: String
  var z: Double
}

object LocationRepositoryStoryResponseReelMentionsItem {
  @scala.inline
  def apply(
    display_type: String,
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    user: LocationRepositoryStoryResponseUser,
    width: String,
    x: String,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(display_type = display_type, height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation, user = user, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseReelMentionsItem]
  }
}

