package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseInItem extends js.Object {
  var duration_in_video_in_sec: js.UndefOr[Null] = js.undefined
  var position: js.Array[Double | String]
  var product: js.UndefOr[SavedFeedResponseProduct] = js.undefined
  var start_time_in_video_in_sec: js.UndefOr[Null] = js.undefined
  var user: js.UndefOr[SavedFeedResponseUser] = js.undefined
}

object SavedFeedResponseInItem {
  @scala.inline
  def apply(
    position: js.Array[Double | String],
    duration_in_video_in_sec: Null = null,
    product: SavedFeedResponseProduct = null,
    start_time_in_video_in_sec: Null = null,
    user: SavedFeedResponseUser = null
  ): SavedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position)
    if (duration_in_video_in_sec != null) __obj.updateDynamic("duration_in_video_in_sec")(duration_in_video_in_sec)
    if (product != null) __obj.updateDynamic("product")(product)
    if (start_time_in_video_in_sec != null) __obj.updateDynamic("start_time_in_video_in_sec")(start_time_in_video_in_sec)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[SavedFeedResponseInItem]
  }
}

