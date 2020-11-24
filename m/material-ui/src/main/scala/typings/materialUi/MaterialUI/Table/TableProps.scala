package typings.materialUi.MaterialUI.Table

import typings.materialUi.materialUiStrings.all
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends js.Object {
  
  var allRowsSelected: js.UndefOr[Boolean] = js.native
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var fixedFooter: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var footerStyle: js.UndefOr[CSSProperties] = js.native
  
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var multiSelectable: js.UndefOr[Boolean] = js.native
  
  var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  
  var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | all, Unit]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}
object TableProps {
  
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    
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
    def setBodyStyle(value: CSSProperties): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFixedFooter(value: Boolean): Self = this.set("fixedFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedFooter: Self = this.set("fixedFooter", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFooterStyle(value: CSSProperties): Self = this.set("footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterStyle: Self = this.set("footerStyle", js.undefined)
    
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
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
    def setOnRowSelection(value: /* selectedRows */ js.Array[Double] | all => Unit): Self = this.set("onRowSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowSelection: Self = this.set("onRowSelection", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: CSSProperties): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
