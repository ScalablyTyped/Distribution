package typings.jqueryLeanmodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryLeanModalOption extends js.Object {
  var closeButton: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object JQueryLeanModalOption {
  @scala.inline
  def apply(
    closeButton: String = null,
    overlay: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
}

