package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryFundraisersItem extends js.Object {
  var fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiserSticker
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var width: Double
  var x: Double
  var y: String
  var z: Double
}

object ListReelMediaViewerFeedResponseStoryFundraisersItem {
  @scala.inline
  def apply(
    fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiserSticker,
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: Double,
    x: Double,
    y: String,
    z: Double
  ): ListReelMediaViewerFeedResponseStoryFundraisersItem = {
    val __obj = js.Dynamic.literal(fundraiser_sticker = fundraiser_sticker.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraisersItem]
  }
}

