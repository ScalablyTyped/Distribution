package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var iconButtonSize: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var textTransform: js.UndefOr[String] = js.undefined
}

object AnonHeight {
  @scala.inline
  def apply(
    height: Int | Double = null,
    iconButtonSize: Int | Double = null,
    minWidth: Int | Double = null,
    textTransform: String = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconButtonSize != null) __obj.updateDynamic("iconButtonSize")(iconButtonSize.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

