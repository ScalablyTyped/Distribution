package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorPickerOptions extends js.Object {
  var buttons: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ ColorPickerChangeEvent, Unit]] = js.native
  var clearButton: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.native
  var columns: js.UndefOr[Double] = js.native
  var messages: js.UndefOr[ColorPickerMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[js.Function1[/* e */ ColorPickerEvent, Unit]] = js.native
  var palette: js.UndefOr[String | js.Any] = js.native
  var preview: js.UndefOr[Boolean] = js.native
  var select: js.UndefOr[js.Function1[/* e */ ColorPickerSelectEvent, Unit]] = js.native
  var tileSize: js.UndefOr[ColorPickerTileSize] = js.native
  var toolIcon: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object ColorPickerOptions {
  @scala.inline
  def apply(): ColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerOptions]
  }
  @scala.inline
  implicit class ColorPickerOptionsOps[Self <: ColorPickerOptions] (val x: Self) extends AnyVal {
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
    def setButtons(value: Boolean): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ColorPickerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    @scala.inline
    def setClose(value: /* e */ ColorPickerEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setMessages(value: ColorPickerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ ColorPickerEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPalette(value: String | js.Any): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ ColorPickerSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTileSize(value: ColorPickerTileSize): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setToolIcon(value: String): Self = this.set("toolIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolIcon: Self = this.set("toolIcon", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

