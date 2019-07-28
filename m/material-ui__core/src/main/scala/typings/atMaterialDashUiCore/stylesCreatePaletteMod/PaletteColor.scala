package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaletteColor extends js.Object {
  var contrastText: String
  var dark: String
  var light: String
  var main: String
}

object PaletteColor {
  @scala.inline
  def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
    val __obj = js.Dynamic.literal(contrastText = contrastText, dark = dark, light = light, main = main)
  
    __obj.asInstanceOf[PaletteColor]
  }
}

