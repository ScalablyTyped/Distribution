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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location_id = location_id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryLocation]
  }
}

