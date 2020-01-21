package typings.instagramPrivateApi.userStoryFeedResponseMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserStoryFeedResponseStoryLocationsItem]
  }
}

