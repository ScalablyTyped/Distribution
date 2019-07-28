package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePaletteColorOptions extends js.Object {
  var contrastText: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
  var main: String
}

object SimplePaletteColorOptions {
  @scala.inline
  def apply(main: String, contrastText: String = null, dark: String = null, light: String = null): SimplePaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main)
    if (contrastText != null) __obj.updateDynamic("contrastText")(contrastText)
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[SimplePaletteColorOptions]
  }
}

