package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPaletteOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ ColorPaletteEvent, scala.Unit]] = js.undefined
  var columns: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var palette: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var tileSize: js.UndefOr[ColorPaletteTileSize] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ColorPaletteOptions {
  @scala.inline
  def apply(
    change: /* e */ ColorPaletteEvent => scala.Unit = null,
    columns: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    palette: java.lang.String | js.Any = null,
    tileSize: ColorPaletteTileSize = null,
    value: java.lang.String = null
  ): ColorPaletteOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorPaletteOptions]
  }
}

