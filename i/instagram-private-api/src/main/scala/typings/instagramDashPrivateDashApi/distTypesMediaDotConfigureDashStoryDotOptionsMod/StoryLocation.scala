package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryLocation extends StorySticker {
  var is_sticker: Boolean
  var location_id: String
}

object StoryLocation {
  @scala.inline
  def apply(
    height: Double,
    is_sticker: Boolean,
    location_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryLocation = {
    val __obj = js.Dynamic.literal(height = height, is_sticker = is_sticker, location_id = location_id, rotation = rotation, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryLocation]
  }
}

