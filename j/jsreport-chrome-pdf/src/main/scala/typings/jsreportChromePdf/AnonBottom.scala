package typings.jsreportChromePdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: js.UndefOr[String | Double] = js.undefined
  var left: js.UndefOr[String | Double] = js.undefined
  var right: js.UndefOr[String | Double] = js.undefined
  var top: js.UndefOr[String | Double] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: String | Double = null,
    left: String | Double = null,
    right: String | Double = null,
    top: String | Double = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

