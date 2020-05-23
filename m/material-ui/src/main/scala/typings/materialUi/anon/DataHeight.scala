package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataHeight extends js.Object {
  var dataHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var rightIconDesktopFill: js.UndefOr[String] = js.undefined
  var selectedTextColor: js.UndefOr[String] = js.undefined
}

object DataHeight {
  @scala.inline
  def apply(
    dataHeight: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hoverColor: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    rightIconDesktopFill: String = null,
    selectedTextColor: String = null
  ): DataHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataHeight)) __obj.updateDynamic("dataHeight")(dataHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (rightIconDesktopFill != null) __obj.updateDynamic("rightIconDesktopFill")(rightIconDesktopFill.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHeight]
  }
}

