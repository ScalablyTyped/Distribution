package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplePaletteColorOptions extends js.Object {
  var contrastText: js.UndefOr[java.lang.String] = js.undefined
  var dark: js.UndefOr[java.lang.String] = js.undefined
  var light: js.UndefOr[java.lang.String] = js.undefined
  var main: java.lang.String
}

object SimplePaletteColorOptions {
  @scala.inline
  def apply(
    main: java.lang.String,
    contrastText: java.lang.String = null,
    dark: java.lang.String = null,
    light: java.lang.String = null
  ): SimplePaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main)
    if (contrastText != null) __obj.updateDynamic("contrastText")(contrastText)
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (light != null) __obj.updateDynamic("light")(light)
    __obj.asInstanceOf[SimplePaletteColorOptions]
  }
}

