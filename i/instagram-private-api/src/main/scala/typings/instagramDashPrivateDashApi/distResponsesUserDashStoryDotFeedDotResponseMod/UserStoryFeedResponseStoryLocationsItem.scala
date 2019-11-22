package typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStoryFeedResponseStoryLocationsItem extends js.Object {
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var location: UserStoryFeedResponseLocation
  var rotation: Double | String
  var width: String
  var x: String
  var y: String
  var z: Double
}

object UserStoryFeedResponseStoryLocationsItem {
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    location: UserStoryFeedResponseLocation,
    rotation: Double | String,
    width: String,
    x: String,
    y: String,
    z: Double
  ): UserStoryFeedResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, location = location, rotation = rotation.asInstanceOf[js.Any], width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[UserStoryFeedResponseStoryLocationsItem]
  }
}

