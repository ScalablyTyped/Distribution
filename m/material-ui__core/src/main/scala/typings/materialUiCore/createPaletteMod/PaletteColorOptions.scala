package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.materialUiCore.createPaletteMod.SimplePaletteColorOptions
  - typings.materialUiCore.createPaletteMod.ColorPartial
*/
trait PaletteColorOptions extends js.Object

object PaletteColorOptions {
  @scala.inline
  def SimplePaletteColorOptions(main: String, contrastText: String = null, dark: String = null, light: String = null): PaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    if (contrastText != null) __obj.updateDynamic("contrastText")(contrastText.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteColorOptions]
  }
  @scala.inline
  def ColorPartial(
    `100`: String = null,
    `200`: String = null,
    `300`: String = null,
    `400`: String = null,
    `50`: String = null,
    `500`: String = null,
    `600`: String = null,
    `700`: String = null,
    `800`: String = null,
    `900`: String = null,
    A100: String = null,
    A200: String = null,
    A400: String = null,
    A700: String = null
  ): PaletteColorOptions = {
    val __obj = js.Dynamic.literal()
    if (`100` != null) __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    if (`200` != null) __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    if (`300` != null) __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    if (`400` != null) __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    if (`50` != null) __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    if (`500` != null) __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    if (`600` != null) __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
    if (`700` != null) __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    if (`800` != null) __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
    if (`900` != null) __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
    if (A100 != null) __obj.updateDynamic("A100")(A100.asInstanceOf[js.Any])
    if (A200 != null) __obj.updateDynamic("A200")(A200.asInstanceOf[js.Any])
    if (A400 != null) __obj.updateDynamic("A400")(A400.asInstanceOf[js.Any])
    if (A700 != null) __obj.updateDynamic("A700")(A700.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteColorOptions]
  }
}

