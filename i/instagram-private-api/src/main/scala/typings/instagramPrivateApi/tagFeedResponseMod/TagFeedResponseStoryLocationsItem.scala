package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseStoryLocationsItem extends js.Object {
  var height: String | Double
  var is_hidden: Double
  var is_pinned: Double
  var location: TagFeedResponseLocation
  var rotation: Double
  var width: Double | String
  var x: Double | String
  var y: Double | String
  var z: Double
}

object TagFeedResponseStoryLocationsItem {
  @scala.inline
  def apply(
    height: String | Double,
    is_hidden: Double,
    is_pinned: Double,
    location: TagFeedResponseLocation,
    rotation: Double,
    width: Double | String,
    x: Double | String,
    y: Double | String,
    z: Double
  ): TagFeedResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagFeedResponseStoryLocationsItem]
  }
}

