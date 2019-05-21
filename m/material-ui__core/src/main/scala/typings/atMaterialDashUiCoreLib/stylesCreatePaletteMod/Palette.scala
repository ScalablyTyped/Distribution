package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Palette extends js.Object {
  var action: TypeAction
  var augmentColor: atMaterialDashUiCoreLib.Anon_Color
  var background: TypeBackground
  var common: atMaterialDashUiCoreLib.colorsCommonMod.CommonColors
  var contrastThreshold: scala.Double
  var divider: TypeDivider
  var error: PaletteColor
  var grey: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.Color
  var primary: PaletteColor
  var secondary: PaletteColor
  var text: TypeText
  var tonalOffset: scala.Double
  var `type`: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PaletteType
  def getContrastText(background: java.lang.String): java.lang.String
}

object Palette {
  @scala.inline
  def apply(
    action: TypeAction,
    augmentColor: atMaterialDashUiCoreLib.Anon_Color,
    background: TypeBackground,
    common: atMaterialDashUiCoreLib.colorsCommonMod.CommonColors,
    contrastThreshold: scala.Double,
    divider: TypeDivider,
    error: PaletteColor,
    getContrastText: java.lang.String => java.lang.String,
    grey: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.Color,
    primary: PaletteColor,
    secondary: PaletteColor,
    text: TypeText,
    tonalOffset: scala.Double,
    `type`: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PaletteType
  ): Palette = {
    val __obj = js.Dynamic.literal(action = action, augmentColor = augmentColor, background = background, common = common, contrastThreshold = contrastThreshold, divider = divider, error = error, getContrastText = js.Any.fromFunction1(getContrastText), grey = grey, primary = primary, secondary = secondary, text = text, tonalOffset = tonalOffset)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Palette]
  }
}

