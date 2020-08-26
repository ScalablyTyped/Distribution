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
  @scala.inline
  implicit class PaletteColorOps[Self <: PaletteColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContrastText(value: String): Self = this.set("contrastText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark(value: String): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
  }
  
}

