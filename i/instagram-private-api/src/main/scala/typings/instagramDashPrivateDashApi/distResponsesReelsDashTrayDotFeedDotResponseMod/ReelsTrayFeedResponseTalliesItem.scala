package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseTalliesItem extends js.Object {
  var count: Double
  var font_size: js.UndefOr[Double] = js.undefined
  var text: String
}

object ReelsTrayFeedResponseTalliesItem {
  @scala.inline
  def apply(count: Double, text: String, font_size: Int | Double = null): ReelsTrayFeedResponseTalliesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (font_size != null) __obj.updateDynamic("font_size")(font_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseTalliesItem]
  }
}

