package typings
package highchartsLib.highstockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarOptions extends js.Object {
  var barBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var barBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var barBorderRadius: js.UndefOr[scala.Double] = js.undefined
  var barBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var buttonArrowColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonBorderRadius: js.UndefOr[scala.Double] = js.undefined
  var buttonBorderWidth: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var liveRedraw: js.UndefOr[scala.Boolean] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var rifleColor: js.UndefOr[java.lang.String] = js.undefined
  var trackBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var trackBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var trackBorderRadius: js.UndefOr[scala.Double] = js.undefined
  var trackBorderWidth: js.UndefOr[scala.Double] = js.undefined
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    barBackgroundColor: java.lang.String = null,
    barBorderColor: java.lang.String = null,
    barBorderRadius: scala.Int | scala.Double = null,
    barBorderWidth: scala.Int | scala.Double = null,
    buttonArrowColor: java.lang.String = null,
    buttonBackgroundColor: java.lang.String = null,
    buttonBorderColor: java.lang.String = null,
    buttonBorderRadius: scala.Int | scala.Double = null,
    buttonBorderWidth: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    liveRedraw: js.UndefOr[scala.Boolean] = js.undefined,
    minWidth: scala.Int | scala.Double = null,
    rifleColor: java.lang.String = null,
    trackBackgroundColor: java.lang.String = null,
    trackBorderColor: java.lang.String = null,
    trackBorderRadius: scala.Int | scala.Double = null,
    trackBorderWidth: scala.Int | scala.Double = null
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (barBackgroundColor != null) __obj.updateDynamic("barBackgroundColor")(barBackgroundColor)
    if (barBorderColor != null) __obj.updateDynamic("barBorderColor")(barBorderColor)
    if (barBorderRadius != null) __obj.updateDynamic("barBorderRadius")(barBorderRadius.asInstanceOf[js.Any])
    if (barBorderWidth != null) __obj.updateDynamic("barBorderWidth")(barBorderWidth.asInstanceOf[js.Any])
    if (buttonArrowColor != null) __obj.updateDynamic("buttonArrowColor")(buttonArrowColor)
    if (buttonBackgroundColor != null) __obj.updateDynamic("buttonBackgroundColor")(buttonBackgroundColor)
    if (buttonBorderColor != null) __obj.updateDynamic("buttonBorderColor")(buttonBorderColor)
    if (buttonBorderRadius != null) __obj.updateDynamic("buttonBorderRadius")(buttonBorderRadius.asInstanceOf[js.Any])
    if (buttonBorderWidth != null) __obj.updateDynamic("buttonBorderWidth")(buttonBorderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(liveRedraw)) __obj.updateDynamic("liveRedraw")(liveRedraw)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (rifleColor != null) __obj.updateDynamic("rifleColor")(rifleColor)
    if (trackBackgroundColor != null) __obj.updateDynamic("trackBackgroundColor")(trackBackgroundColor)
    if (trackBorderColor != null) __obj.updateDynamic("trackBorderColor")(trackBorderColor)
    if (trackBorderRadius != null) __obj.updateDynamic("trackBorderRadius")(trackBorderRadius.asInstanceOf[js.Any])
    if (trackBorderWidth != null) __obj.updateDynamic("trackBorderWidth")(trackBorderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
}

