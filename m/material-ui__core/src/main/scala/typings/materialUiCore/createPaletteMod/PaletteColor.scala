package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteColor extends js.Object {
  var contrastText: String = js.native
  var dark: String = js.native
  var light: String = js.native
  var main: String = js.native
}

object PaletteColor {
  @scala.inline
  def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
    val __obj = js.Dynamic.literal(contrastText = contrastText.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaletteColor]
  }
}

