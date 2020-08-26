package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayoutOptions extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var columnsWidth: js.UndefOr[String | Double] = js.native
  var containers: js.UndefOr[js.Array[TileLayoutContainer]] = js.native
  var gap: js.UndefOr[TileLayoutGap] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var name: js.UndefOr[String] = js.native
  var reorder: js.UndefOr[js.Function1[/* e */ TileLayoutReorderEvent, Unit]] = js.native
  var reorderable: js.UndefOr[Boolean] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ TileLayoutResizeEvent, Unit]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsHeight: js.UndefOr[String | Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object TileLayoutOptions {
  @scala.inline
  def apply(): TileLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayoutOptions]
  }
  @scala.inline
  implicit class TileLayoutOptionsOps[Self <: TileLayoutOptions] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsWidth(value: String | Double): Self = this.set("columnsWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsWidth: Self = this.set("columnsWidth", js.undefined)
    @scala.inline
    def setContainersVarargs(value: TileLayoutContainer*): Self = this.set("containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: js.Array[TileLayoutContainer]): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    @scala.inline
    def setGap(value: TileLayoutGap): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReorder(value: /* e */ TileLayoutReorderEvent => Unit): Self = this.set("reorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReorder: Self = this.set("reorder", js.undefined)
    @scala.inline
    def setReorderable(value: Boolean): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorderable: Self = this.set("reorderable", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResize(value: /* e */ TileLayoutResizeEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsHeight(value: String | Double): Self = this.set("rowsHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsHeight: Self = this.set("rowsHeight", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

