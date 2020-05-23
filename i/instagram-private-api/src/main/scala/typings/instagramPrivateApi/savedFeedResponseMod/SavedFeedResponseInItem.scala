package typings.instagramPrivateApi.savedFeedResponseMod

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
    product: SavedFeedResponseProduct = null,
    user: SavedFeedResponseUser = null
  ): SavedFeedResponseInItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseInItem]
  }
}

