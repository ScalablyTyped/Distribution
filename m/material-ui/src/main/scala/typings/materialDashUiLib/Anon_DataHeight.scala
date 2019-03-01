package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeight extends js.Object {
  var dataHeight: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var rightIconDesktopFill: js.UndefOr[java.lang.String] = js.undefined
  var selectedTextColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DataHeight {
  @scala.inline
  def apply(
    dataHeight: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    hoverColor: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    rightIconDesktopFill: java.lang.String = null,
    selectedTextColor: java.lang.String = null
  ): Anon_DataHeight = {
    val __obj = js.Dynamic.literal()
    if (dataHeight != null) __obj.updateDynamic("dataHeight")(dataHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rightIconDesktopFill != null) __obj.updateDynamic("rightIconDesktopFill")(rightIconDesktopFill)
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor)
    __obj.asInstanceOf[Anon_DataHeight]
  }
}

