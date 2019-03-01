package typings
package highchartsLib.highstockMod.HighstockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorOptions extends js.Object {
  var allButtonsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var buttonSpacing: js.UndefOr[scala.Double] = js.undefined
  var buttonTheme: js.UndefOr[js.Any] = js.undefined
  var buttons: js.UndefOr[js.Array[RangeSelectorButton]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputBoxBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var inputBoxHeight: js.UndefOr[scala.Double] = js.undefined
  var inputBoxWidth: js.UndefOr[scala.Double] = js.undefined
  var inputDateFormat: js.UndefOr[java.lang.String] = js.undefined
  var inputDateParser: js.UndefOr[js.Function1[/* date */ java.lang.String, scala.Double]] = js.undefined
  var inputEditDateFormat: js.UndefOr[java.lang.String] = js.undefined
  var inputEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputPosition: js.UndefOr[highchartsLib.Anon_Align] = js.undefined
  var inputStyle: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.CSSObject] = js.undefined
  var labelStyle: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.CSSObject] = js.undefined
  var selected: js.UndefOr[scala.Double] = js.undefined
}

object RangeSelectorOptions {
  @scala.inline
  def apply(
    allButtonsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    buttonSpacing: scala.Int | scala.Double = null,
    buttonTheme: js.Any = null,
    buttons: js.Array[RangeSelectorButton] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputBoxBorderColor: java.lang.String = null,
    inputBoxHeight: scala.Int | scala.Double = null,
    inputBoxWidth: scala.Int | scala.Double = null,
    inputDateFormat: java.lang.String = null,
    inputDateParser: js.Function1[/* date */ java.lang.String, scala.Double] = null,
    inputEditDateFormat: java.lang.String = null,
    inputEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    inputPosition: highchartsLib.Anon_Align = null,
    inputStyle: highchartsLib.highchartsMod.HighchartsNs.CSSObject = null,
    labelStyle: highchartsLib.highchartsMod.HighchartsNs.CSSObject = null,
    selected: scala.Int | scala.Double = null
  ): RangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allButtonsEnabled)) __obj.updateDynamic("allButtonsEnabled")(allButtonsEnabled)
    if (buttonSpacing != null) __obj.updateDynamic("buttonSpacing")(buttonSpacing.asInstanceOf[js.Any])
    if (buttonTheme != null) __obj.updateDynamic("buttonTheme")(buttonTheme)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (inputBoxBorderColor != null) __obj.updateDynamic("inputBoxBorderColor")(inputBoxBorderColor)
    if (inputBoxHeight != null) __obj.updateDynamic("inputBoxHeight")(inputBoxHeight.asInstanceOf[js.Any])
    if (inputBoxWidth != null) __obj.updateDynamic("inputBoxWidth")(inputBoxWidth.asInstanceOf[js.Any])
    if (inputDateFormat != null) __obj.updateDynamic("inputDateFormat")(inputDateFormat)
    if (inputDateParser != null) __obj.updateDynamic("inputDateParser")(inputDateParser)
    if (inputEditDateFormat != null) __obj.updateDynamic("inputEditDateFormat")(inputEditDateFormat)
    if (!js.isUndefined(inputEnabled)) __obj.updateDynamic("inputEnabled")(inputEnabled)
    if (inputPosition != null) __obj.updateDynamic("inputPosition")(inputPosition)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorOptions]
  }
}

