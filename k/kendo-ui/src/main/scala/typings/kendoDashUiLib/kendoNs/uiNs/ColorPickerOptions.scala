package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerOptions extends js.Object {
  var buttons: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ ColorPickerChangeEvent, scala.Unit]] = js.undefined
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, scala.Unit]] = js.undefined
  var columns: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[ColorPickerMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, scala.Unit]] = js.undefined
  var palette: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ColorPickerSelectEvent, scala.Unit]] = js.undefined
  var tileSize: js.UndefOr[ColorPickerTileSize] = js.undefined
  var toolIcon: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ColorPickerOptions {
  @scala.inline
  def apply(
    buttons: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ ColorPickerChangeEvent, scala.Unit] = null,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    close: js.Function1[/* e */ ColorPickerEvent, scala.Unit] = null,
    columns: scala.Int | scala.Double = null,
    messages: ColorPickerMessages = null,
    name: java.lang.String = null,
    opacity: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.Function1[/* e */ ColorPickerEvent, scala.Unit] = null,
    palette: java.lang.String | js.Any = null,
    preview: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Function1[/* e */ ColorPickerSelectEvent, scala.Unit] = null,
    tileSize: ColorPickerTileSize = null,
    toolIcon: java.lang.String = null,
    value: java.lang.String = null
  ): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons)
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (close != null) __obj.updateDynamic("close")(close)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity)
    if (open != null) __obj.updateDynamic("open")(open)
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (select != null) __obj.updateDynamic("select")(select)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize)
    if (toolIcon != null) __obj.updateDynamic("toolIcon")(toolIcon)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorPickerOptions]
  }
}

