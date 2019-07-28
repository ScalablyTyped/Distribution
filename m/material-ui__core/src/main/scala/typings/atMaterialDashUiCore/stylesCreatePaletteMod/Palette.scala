package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import typings.atMaterialDashUiCore.Fn_Color
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.Color
import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PaletteType
import typings.atMaterialDashUiCore.colorsCommonMod.CommonColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Palette extends js.Object {
  var action: TypeAction
  var augmentColor: Fn_Color
  var background: TypeBackground
  var common: CommonColors
  var contrastThreshold: Double
  var divider: TypeDivider
  var error: PaletteColor
  var grey: Color
  var primary: PaletteColor
  var secondary: PaletteColor
  var text: TypeText
  var tonalOffset: Double
  var `type`: PaletteType
  def getContrastText(background: String): String
}

object Palette {
  @scala.inline
  def apply(
    action: TypeAction,
    augmentColor: Fn_Color,
    background: TypeBackground,
    common: CommonColors,
    contrastThreshold: Double,
    divider: TypeDivider,
    error: PaletteColor,
    getContrastText: String => String,
    grey: Color,
    primary: PaletteColor,
    secondary: PaletteColor,
    text: TypeText,
    tonalOffset: Double,
    `type`: PaletteType
  ): Palette = {
    val __obj = js.Dynamic.literal(action = action, augmentColor = augmentColor, background = background, common = common, contrastThreshold = contrastThreshold, divider = divider, error = error, getContrastText = js.Any.fromFunction1(getContrastText), grey = grey, primary = primary, secondary = secondary, text = text, tonalOffset = tonalOffset)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Palette]
  }
}

