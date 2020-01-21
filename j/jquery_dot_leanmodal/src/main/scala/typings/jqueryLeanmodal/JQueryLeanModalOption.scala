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
  def apply(closeButton: String = null, overlay: Int | Double = null, top: Int | Double = null): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
}

