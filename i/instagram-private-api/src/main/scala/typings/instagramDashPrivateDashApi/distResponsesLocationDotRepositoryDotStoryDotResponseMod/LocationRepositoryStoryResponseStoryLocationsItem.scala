package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseStoryLocationsItem extends js.Object {
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var location: LocationRepositoryStoryResponseLocation
  var rotation: Double | String
  var width: String | Double
  var x: String | Double
  var y: String
  var z: Double
}

object LocationRepositoryStoryResponseStoryLocationsItem {
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    location: LocationRepositoryStoryResponseLocation,
    rotation: Double | String,
    width: String | Double,
    x: String | Double,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, location = location, rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y, z = z)
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseStoryLocationsItem]
  }
}

