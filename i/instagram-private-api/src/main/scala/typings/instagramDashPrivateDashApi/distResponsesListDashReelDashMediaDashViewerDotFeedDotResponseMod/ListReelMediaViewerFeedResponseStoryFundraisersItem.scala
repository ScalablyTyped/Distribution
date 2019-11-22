package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryFundraisersItem extends js.Object {
  var fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiser_sticker
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
    fundraiser_sticker: ListReelMediaViewerFeedResponseFundraiser_sticker,
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
    val __obj = js.Dynamic.literal(fundraiser_sticker = fundraiser_sticker, height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryFundraisersItem]
  }
}

