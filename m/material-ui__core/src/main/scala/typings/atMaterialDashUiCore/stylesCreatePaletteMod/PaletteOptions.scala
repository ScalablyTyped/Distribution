package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import typings.atMaterialDashUiCore.PartialCommonColors
import typings.atMaterialDashUiCore.PartialTypeAction
import typings.atMaterialDashUiCore.PartialTypeBackground
import typings.atMaterialDashUiCore.PartialTypeText
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PaletteType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaletteOptions extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.undefined
  var background: js.UndefOr[PartialTypeBackground] = js.undefined
  var common: js.UndefOr[PartialCommonColors] = js.undefined
  var contrastThreshold: js.UndefOr[Double] = js.undefined
  var divider: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[PaletteColorOptions] = js.undefined
  var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.undefined
  var grey: js.UndefOr[ColorPartial] = js.undefined
  var primary: js.UndefOr[PaletteColorOptions] = js.undefined
  var secondary: js.UndefOr[PaletteColorOptions] = js.undefined
  var text: js.UndefOr[PartialTypeText] = js.undefined
  var tonalOffset: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[PaletteType] = js.undefined
}

object PaletteOptions {
  @scala.inline
  def apply(
    action: PartialTypeAction = null,
    background: PartialTypeBackground = null,
    common: PartialCommonColors = null,
    contrastThreshold: Int | Double = null,
    divider: String = null,
    error: PaletteColorOptions = null,
    getContrastText: /* background */ String => String = null,
    grey: ColorPartial = null,
    primary: PaletteColorOptions = null,
    secondary: PaletteColorOptions = null,
    text: PartialTypeText = null,
    tonalOffset: Int | Double = null,
    `type`: PaletteType = null
  ): PaletteOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (background != null) __obj.updateDynamic("background")(background)
    if (common != null) __obj.updateDynamic("common")(common)
    if (contrastThreshold != null) __obj.updateDynamic("contrastThreshold")(contrastThreshold.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (error != null) __obj.updateDynamic("error")(error)
    if (getContrastText != null) __obj.updateDynamic("getContrastText")(js.Any.fromFunction1(getContrastText))
    if (grey != null) __obj.updateDynamic("grey")(grey)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tonalOffset != null) __obj.updateDynamic("tonalOffset")(tonalOffset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaletteOptions]
  }
}

