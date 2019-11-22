package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseStoryPollsItem extends js.Object {
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var poll_sticker: ReelsTrayFeedResponsePoll_sticker
  var rotation: Double
  var width: Double
  var x: Double
  var y: String
  var z: Double
}

object ReelsTrayFeedResponseStoryPollsItem {
  @scala.inline
  def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    poll_sticker: ReelsTrayFeedResponsePoll_sticker,
    rotation: Double,
    width: Double,
    x: Double,
    y: String,
    z: Double
  ): ReelsTrayFeedResponseStoryPollsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, poll_sticker = poll_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseStoryPollsItem]
  }
}

