package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePaletteColorOptions extends PaletteColorOptions {
  var contrastText: js.UndefOr[String] = js.native
  var dark: js.UndefOr[String] = js.native
  var light: js.UndefOr[String] = js.native
  var main: String = js.native
}

object SimplePaletteColorOptions {
  @scala.inline
  def apply(main: String): SimplePaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePaletteColorOptions]
  }
  @scala.inline
  implicit class SimplePaletteColorOptionsOps[Self <: SimplePaletteColorOptions] (val x: Self) extends AnyVal {
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
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrastText(value: String): Self = this.set("contrastText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrastText: Self = this.set("contrastText", js.undefined)
    @scala.inline
    def setDark(value: String): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
  }
  
}

