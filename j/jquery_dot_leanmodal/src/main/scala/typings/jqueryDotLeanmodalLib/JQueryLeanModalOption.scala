package typings
package jqueryDotLeanmodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryLeanModalOption extends js.Object {
  var closeButton: js.UndefOr[java.lang.String] = js.undefined
  var overlay: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object JQueryLeanModalOption {
  @scala.inline
  def apply(
    closeButton: java.lang.String = null,
    overlay: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
}

