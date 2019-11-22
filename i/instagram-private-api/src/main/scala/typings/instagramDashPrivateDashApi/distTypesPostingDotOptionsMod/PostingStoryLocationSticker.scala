package typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod

import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod.StoryLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingStoryLocationSticker extends js.Object {
  var latitude: String
  var longitude: String
  var sticker: StoryLocation
}

object PostingStoryLocationSticker {
  @scala.inline
  def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude, sticker = sticker)
  
    __obj.asInstanceOf[PostingStoryLocationSticker]
  }
}

