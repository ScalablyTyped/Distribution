package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBodyProps extends js.Object {
  
  /** @deprecated Instead, use property on Table */
  var allRowsSelected: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var deselectOnClickaway: js.UndefOr[Boolean] = js.native
  
  var displayRowCheckbox: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Instead, use property on Table */
  var multiSelectable: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  
  /** @deprecated Instead, use event handler on Table */
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | String, Unit]] = js.native
  
  var preScanRows: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Instead, use property on Table */
  var selectable: js.UndefOr[Boolean] = js.native
  
  var showRowHover: js.UndefOr[Boolean] = js.native
  
  var stripedRows: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TableBodyProps {
  
  @scala.inline
  def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  
  @scala.inline
  implicit class TableBodyPropsOps[Self <: TableBodyProps] (val x: Self) extends AnyVal {
    
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
    def setAllRowsSelected(value: Boolean): Self = this.set("allRowsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllRowsSelected: Self = this.set("allRowsSelected", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDeselectOnClickaway(value: Boolean): Self = this.set("deselectOnClickaway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeselectOnClickaway: Self = this.set("deselectOnClickaway", js.undefined)
    
    @scala.inline
    def setDisplayRowCheckbox(value: Boolean): Self = this.set("displayRowCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayRowCheckbox: Self = this.set("displayRowCheckbox", js.undefined)
    
    @scala.inline
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectable: Self = this.set("multiSelectable", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: (/* row */ Double, /* column */ Double) => Unit): Self = this.set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellHover(value: (/* row */ Double, /* column */ Double) => Unit): Self = this.set("onCellHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellHover: Self = this.set("onCellHover", js.undefined)
    
    @scala.inline
    def setOnCellHoverExit(value: (/* row */ Double, /* column */ Double) => Unit): Self = this.set("onCellHoverExit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCellHoverExit: Self = this.set("onCellHoverExit", js.undefined)
    
    @scala.inline
    def setOnRowHover(value: /* row */ Double => Unit): Self = this.set("onRowHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowHover: Self = this.set("onRowHover", js.undefined)
    
    @scala.inline
    def setOnRowHoverExit(value: /* row */ Double => Unit): Self = this.set("onRowHoverExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowHoverExit: Self = this.set("onRowHoverExit", js.undefined)
    
    @scala.inline
    def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | String => Unit): Self = this.set("onRowSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowSelection: Self = this.set("onRowSelection", js.undefined)
    
    @scala.inline
    def setPreScanRows(value: Boolean): Self = this.set("preScanRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreScanRows: Self = this.set("preScanRows", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShowRowHover(value: Boolean): Self = this.set("showRowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowHover: Self = this.set("showRowHover", js.undefined)
    
    @scala.inline
    def setStripedRows(value: Boolean): Self = this.set("stripedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripedRows: Self = this.set("stripedRows", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
