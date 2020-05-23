package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseTalliesItem extends js.Object {
  var count: Double
  var font_size: js.UndefOr[Double] = js.undefined
  var text: String
}

object ReelsMediaFeedResponseTalliesItem {
  @scala.inline
  def apply(count: Double, text: String, font_size: js.UndefOr[Double] = js.undefined): ReelsMediaFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(font_size)) __obj.updateDynamic("font_size")(font_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseTalliesItem]
  }
}

