package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataHeight extends js.Object {
  var dataHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var rightIconDesktopFill: js.UndefOr[String] = js.undefined
  var selectedTextColor: js.UndefOr[String] = js.undefined
}

object AnonDataHeight {
  @scala.inline
  def apply(
    dataHeight: Int | Double = null,
    height: Int | Double = null,
    hoverColor: String = null,
    padding: Int | Double = null,
    rightIconDesktopFill: String = null,
    selectedTextColor: String = null
  ): AnonDataHeight = {
    val __obj = js.Dynamic.literal()
    if (dataHeight != null) __obj.updateDynamic("dataHeight")(dataHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rightIconDesktopFill != null) __obj.updateDynamic("rightIconDesktopFill")(rightIconDesktopFill.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataHeight]
  }
}

