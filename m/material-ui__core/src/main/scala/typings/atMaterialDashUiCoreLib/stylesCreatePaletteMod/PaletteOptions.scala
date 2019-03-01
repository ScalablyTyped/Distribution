package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaletteOptions extends js.Object {
  var action: js.UndefOr[stdLib.Partial[TypeAction]] = js.undefined
  var background: js.UndefOr[stdLib.Partial[TypeBackground]] = js.undefined
  var common: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.colorsCommonMod.CommonColors]] = js.undefined
  var contrastThreshold: js.UndefOr[scala.Double] = js.undefined
  var divider: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[PaletteColorOptions] = js.undefined
  var getContrastText: js.UndefOr[js.Function1[/* background */ java.lang.String, java.lang.String]] = js.undefined
  var grey: js.UndefOr[ColorPartial] = js.undefined
  var primary: js.UndefOr[PaletteColorOptions] = js.undefined
  var secondary: js.UndefOr[PaletteColorOptions] = js.undefined
  var text: js.UndefOr[stdLib.Partial[TypeText]] = js.undefined
  var tonalOffset: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PaletteType] = js.undefined
}

object PaletteOptions {
  @scala.inline
  def apply(
    action: stdLib.Partial[TypeAction] = null,
    background: stdLib.Partial[TypeBackground] = null,
    common: stdLib.Partial[atMaterialDashUiCoreLib.colorsCommonMod.CommonColors] = null,
    contrastThreshold: scala.Int | scala.Double = null,
    divider: java.lang.String = null,
    error: PaletteColorOptions = null,
    getContrastText: js.Function1[/* background */ java.lang.String, java.lang.String] = null,
    grey: ColorPartial = null,
    primary: PaletteColorOptions = null,
    secondary: PaletteColorOptions = null,
    text: stdLib.Partial[TypeText] = null,
    tonalOffset: scala.Int | scala.Double = null,
    `type`: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PaletteType = null
  ): PaletteOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (background != null) __obj.updateDynamic("background")(background)
    if (common != null) __obj.updateDynamic("common")(common)
    if (contrastThreshold != null) __obj.updateDynamic("contrastThreshold")(contrastThreshold.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getContrastText != null) __obj.updateDynamic("getContrastText")(getContrastText)
    if (grey != null) __obj.updateDynamic("grey")(grey)
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (tonalOffset != null) __obj.updateDynamic("tonalOffset")(tonalOffset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaletteOptions]
  }
}

