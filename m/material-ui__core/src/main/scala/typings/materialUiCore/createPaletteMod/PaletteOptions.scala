package typings.materialUiCore.createPaletteMod

import typings.materialUiCore.PartialCommonColors
import typings.materialUiCore.PartialTypeAction
import typings.materialUiCore.PartialTypeBackground
import typings.materialUiCore.PartialTypeText
import typings.materialUiCore.mod.PaletteType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteOptions extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.native
  var background: js.UndefOr[PartialTypeBackground] = js.native
  var common: js.UndefOr[PartialCommonColors] = js.native
  var contrastThreshold: js.UndefOr[Double] = js.native
  var divider: js.UndefOr[String] = js.native
  var error: js.UndefOr[PaletteColorOptions] = js.native
  var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.native
  var grey: js.UndefOr[ColorPartial] = js.native
  var primary: js.UndefOr[PaletteColorOptions] = js.native
  var secondary: js.UndefOr[PaletteColorOptions] = js.native
  var text: js.UndefOr[PartialTypeText] = js.native
  var tonalOffset: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[PaletteType] = js.native
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
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (contrastThreshold != null) __obj.updateDynamic("contrastThreshold")(contrastThreshold.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getContrastText != null) __obj.updateDynamic("getContrastText")(js.Any.fromFunction1(getContrastText))
    if (grey != null) __obj.updateDynamic("grey")(grey.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tonalOffset != null) __obj.updateDynamic("tonalOffset")(tonalOffset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteOptions]
  }
}

