package typings.atMaterialDashUiCore.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePaletteColorOptions extends PaletteColorOptions {
  var contrastText: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
  var main: String
}

object SimplePaletteColorOptions {
  @scala.inline
  def apply(main: String, contrastText: String = null, dark: String = null, light: String = null): SimplePaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    if (contrastText != null) __obj.updateDynamic("contrastText")(contrastText.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePaletteColorOptions]
  }
}

