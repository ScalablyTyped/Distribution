package typings.materialUiDatatables.anon

import typings.materialUiDatatables.materialUiDatatablesStrings.default
import typings.materialUiDatatables.materialUiDatatablesStrings.filter
import typings.materialUiDatatables.mod.Column
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<material-ui-datatables.material-ui-datatables.DataTableProps> */
@js.native
trait PartialDataTableProps extends js.Object {
  
  var columns: js.UndefOr[js.Array[Column]] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var deselectOnClickaway: js.UndefOr[Boolean] = js.native
  
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  
  var filterHintText: js.UndefOr[String] = js.native
  
  var filterValue: js.UndefOr[String] = js.native
  
  var fixedFooter: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var footerToolbarStyle: js.UndefOr[CSSProperties] = js.native
  
  var headerToolbarMode: js.UndefOr[default | filter | String] = js.native
  
  var height: js.UndefOr[js.Any] = js.native
  
  var multiSelectable: js.UndefOr[Boolean] = js.native
  
  var onCellClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onCellDoubleClick: js.UndefOr[
    js.Function5[
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      /* row */ js.Any, 
      /* columnValue */ js.Any, 
      /* event */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var onFilterValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var onNextPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onPreviousPageClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Any, Unit]] = js.native
  
  var onRowSizeChange: js.UndefOr[js.Function2[/* index */ Double, /* value */ js.Any, Unit]] = js.native
  
  var onSortOrderChange: js.UndefOr[js.Function2[/* key */ String, /* order */ String, Unit]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var rowSize: js.UndefOr[Double] = js.native
  
  var rowSizeLabel: js.UndefOr[String] = js.native
  
  var rowSizeList: js.UndefOr[js.Array[Double]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var showCheckboxes: js.UndefOr[Boolean] = js.native
  
  var showFooterToolbar: js.UndefOr[Boolean] = js.native
  
  var showHeaderToolbar: js.UndefOr[Boolean] = js.native
  
  var showHeaderToolbarFilterIcon: js.UndefOr[Boolean] = js.native
  
  var showRowHover: js.UndefOr[Boolean] = js.native
  
  var showRowSizeControls: js.UndefOr[Boolean] = js.native
  
  var stripedRows: js.UndefOr[Boolean] = js.native
  
  var summaryLabelTemplate: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* count */ Double, _]] = js.native
  
  var tableBodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableHeaderColumnStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableHeaderStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableRowColumnStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableRowStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableStyle: js.UndefOr[CSSProperties] = js.native
  
  var tableWrapperStyle: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleStyle: js.UndefOr[CSSProperties] = js.native
  
  var toolbarIconRight: js.UndefOr[js.Any] = js.native
}
object PartialDataTableProps {
  
  @scala.inline
  def apply(): PartialDataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataTableProps]
  }
  
  @scala.inline
  implicit class PartialDataTablePropsOps[Self <: PartialDataTableProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDeselectOnClickaway(value: Boolean): Self = this.set("deselectOnClickaway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeselectOnClickaway: Self = this.set("deselectOnClickaway", js.undefined)
    
    @scala.inline
    def setEnableSelectAll(value: Boolean): Self = this.set("enableSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSelectAll: Self = this.set("enableSelectAll", js.undefined)
    
    @scala.inline
    def setFilterHintText(value: String): Self = this.set("filterHintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterHintText: Self = this.set("filterHintText", js.undefined)
    
    @scala.inline
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    
    @scala.inline
    def setFixedFooter(value: Boolean): Self = this.set("fixedFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedFooter: Self = this.set("fixedFooter", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFooterToolbarStyle(value: CSSProperties): Self = this.set("footerToolbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterToolbarStyle: Self = this.set("footerToolbarStyle", js.undefined)
    
    @scala.inline
    def setHeaderToolbarMode(value: default | filter | String): Self = this.set("headerToolbarMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderToolbarMode: Self = this.set("headerToolbarMode", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelectable: Self = this.set("multiSelectable", js.undefined)
    
    @scala.inline
    def setOnCellClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): Self = this.set("onCellClick", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    
    @scala.inline
    def setOnCellDoubleClick(
      value: (/* rowIndex */ Double, /* columnIndex */ Double, /* row */ js.Any, /* columnValue */ js.Any, /* event */ js.Any) => Unit
    ): Self = this.set("onCellDoubleClick", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnCellDoubleClick: Self = this.set("onCellDoubleClick", js.undefined)
    
    @scala.inline
    def setOnFilterValueChange(value: /* value */ String => Unit): Self = this.set("onFilterValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterValueChange: Self = this.set("onFilterValueChange", js.undefined)
    
    @scala.inline
    def setOnNextPageClick(value: /* event */ js.Any => Unit): Self = this.set("onNextPageClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNextPageClick: Self = this.set("onNextPageClick", js.undefined)
    
    @scala.inline
    def setOnPreviousPageClick(value: /* event */ js.Any => Unit): Self = this.set("onPreviousPageClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPreviousPageClick: Self = this.set("onPreviousPageClick", js.undefined)
    
    @scala.inline
    def setOnRowSelection(value: /* selectedRows */ js.Any => Unit): Self = this.set("onRowSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowSelection: Self = this.set("onRowSelection", js.undefined)
    
    @scala.inline
    def setOnRowSizeChange(value: (/* index */ Double, /* value */ js.Any) => Unit): Self = this.set("onRowSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowSizeChange: Self = this.set("onRowSizeChange", js.undefined)
    
    @scala.inline
    def setOnSortOrderChange(value: (/* key */ String, /* order */ String) => Unit): Self = this.set("onSortOrderChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSortOrderChange: Self = this.set("onSortOrderChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setRowSize(value: Double): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSize: Self = this.set("rowSize", js.undefined)
    
    @scala.inline
    def setRowSizeLabel(value: String): Self = this.set("rowSizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSizeLabel: Self = this.set("rowSizeLabel", js.undefined)
    
    @scala.inline
    def setRowSizeListVarargs(value: Double*): Self = this.set("rowSizeList", js.Array(value :_*))
    
    @scala.inline
    def setRowSizeList(value: js.Array[Double]): Self = this.set("rowSizeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSizeList: Self = this.set("rowSizeList", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShowCheckboxes(value: Boolean): Self = this.set("showCheckboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckboxes: Self = this.set("showCheckboxes", js.undefined)
    
    @scala.inline
    def setShowFooterToolbar(value: Boolean): Self = this.set("showFooterToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooterToolbar: Self = this.set("showFooterToolbar", js.undefined)
    
    @scala.inline
    def setShowHeaderToolbar(value: Boolean): Self = this.set("showHeaderToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeaderToolbar: Self = this.set("showHeaderToolbar", js.undefined)
    
    @scala.inline
    def setShowHeaderToolbarFilterIcon(value: Boolean): Self = this.set("showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeaderToolbarFilterIcon: Self = this.set("showHeaderToolbarFilterIcon", js.undefined)
    
    @scala.inline
    def setShowRowHover(value: Boolean): Self = this.set("showRowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowHover: Self = this.set("showRowHover", js.undefined)
    
    @scala.inline
    def setShowRowSizeControls(value: Boolean): Self = this.set("showRowSizeControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowSizeControls: Self = this.set("showRowSizeControls", js.undefined)
    
    @scala.inline
    def setStripedRows(value: Boolean): Self = this.set("stripedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripedRows: Self = this.set("stripedRows", js.undefined)
    
    @scala.inline
    def setSummaryLabelTemplate(value: (/* start */ Double, /* end */ Double, /* count */ Double) => _): Self = this.set("summaryLabelTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSummaryLabelTemplate: Self = this.set("summaryLabelTemplate", js.undefined)
    
    @scala.inline
    def setTableBodyStyle(value: CSSProperties): Self = this.set("tableBodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyStyle: Self = this.set("tableBodyStyle", js.undefined)
    
    @scala.inline
    def setTableHeaderColumnStyle(value: CSSProperties): Self = this.set("tableHeaderColumnStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderColumnStyle: Self = this.set("tableHeaderColumnStyle", js.undefined)
    
    @scala.inline
    def setTableHeaderStyle(value: CSSProperties): Self = this.set("tableHeaderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeaderStyle: Self = this.set("tableHeaderStyle", js.undefined)
    
    @scala.inline
    def setTableRowColumnStyle(value: CSSProperties): Self = this.set("tableRowColumnStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowColumnStyle: Self = this.set("tableRowColumnStyle", js.undefined)
    
    @scala.inline
    def setTableRowStyle(value: CSSProperties): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
    
    @scala.inline
    def setTableStyle(value: CSSProperties): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableStyle: Self = this.set("tableStyle", js.undefined)
    
    @scala.inline
    def setTableWrapperStyle(value: CSSProperties): Self = this.set("tableWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableWrapperStyle: Self = this.set("tableWrapperStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setToolbarIconRight(value: js.Any): Self = this.set("toolbarIconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarIconRight: Self = this.set("toolbarIconRight", js.undefined)
  }
}
