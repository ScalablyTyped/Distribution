package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPaletteOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ ColorPaletteEvent, Unit]] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var palette: js.UndefOr[String | js.Any] = js.undefined
  var tileSize: js.UndefOr[ColorPaletteTileSize] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ColorPaletteOptions {
  @scala.inline
  def apply(
    change: /* e */ ColorPaletteEvent => Unit = null,
    columns: Int | Double = null,
    name: String = null,
    palette: String | js.Any = null,
    tileSize: ColorPaletteTileSize = null,
    value: String = null
  ): ColorPaletteOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteOptions]
  }
}

