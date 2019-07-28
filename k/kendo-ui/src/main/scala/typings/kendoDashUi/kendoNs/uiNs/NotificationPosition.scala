package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationPosition extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object NotificationPosition {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    left: Int | Double = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    right: Int | Double = null,
    top: Int | Double = null
  ): NotificationPosition = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPosition]
  }
}

