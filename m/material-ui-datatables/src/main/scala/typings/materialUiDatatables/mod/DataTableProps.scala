package typings.materialUiDatatables.mod

import typings.materialUiDatatables.materialUiDatatablesStrings.filter
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableProps extends js.Object {
  /**
    * The column structure.
    * ```let columns: Column[] = [{
    *      key: 'bookName',
    *      label: 'Book Name & Author',
    *      render: (__value: any, book: any) => book.name + ' by ' book.author
    *  },```
    */
  var columns: js.Array[Column] = js.native
  var count: Double = js.native
  /** The array of objects used as data for the table */
  var data: js.Array[_] = js.native
  /** If clicking away de-selects all */
  var deselectOnClickaway: Boolean = js.native
  /** Adds a select all button */
  var enableSelectAll: Boolean = js.native
  /** Filter hint text */
  var filterHintText: String = js.native
   // BUG https://github.com/Microsoft/TypeScript/issues/11465
  /** The current filter value */
  var filterValue: String = js.native
  /** If the footer should be fixed */
  var fixedFooter: Boolean = js.native
  /** If the header should be fixed */
  var fixedHeader: Boolean = js.native
  /** React Style object applied to footer toolbar */
  var footerToolbarStyle: CSSProperties = js.native
  /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
  var headerToolbarMode: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String = js.native
  /** The hight of the table */
  var height: js.Any = js.native
  /** If multiple table rows are select-able */
  var multiSelectable: Boolean = js.native
  var page: Double = js.native
  var rowSize: Double = js.native
  var rowSizeLabel: String = js.native
  var rowSizeList: js.Array[Double] = js.native
  /** If the table rows are select-able */
  var selectable: Boolean = js.native
  /** Show check-boxes for selected rows */
  var showCheckboxes: Boolean = js.native
  /** Shows a footer toolbar */
  var showFooterToolbar: Boolean = js.native
  /** Shows a header toolbar */
  var showHeaderToolbar: Boolean = js.native
  /** Show the icon to turn on the filtering feature */
  var showHeaderToolbarFilterIcon: Boolean = js.native
  /** Display a hover in the row under the mouse */
  var showRowHover: Boolean = js.native
  var showRowSizeControls: Boolean = js.native
  /** To display striped rows in the table */
  var stripedRows: Boolean = js.native
  /** React style object for the tbody tag */
  var tableBodyStyle: CSSProperties = js.native
  /** React style object for the th/td tag */
  var tableHeaderColumnStyle: CSSProperties = js.native
  /** React style object for the th tag */
  var tableHeaderStyle: CSSProperties = js.native
  /** React style object for the tr/td tag */
  var tableRowColumnStyle: CSSProperties = js.native
  /** React style object for the tr tag */
  var tableRowStyle: CSSProperties = js.native
  /** React style object for the table tag */
  var tableStyle: CSSProperties = js.native
  var tableWrapperStyle: CSSProperties = js.native
  /** Table title */
  var title: String = js.native
  /** React Style object for the title */
  var titleStyle: CSSProperties = js.native
  var toolbarIconRight: js.Any = js.native
  /** Callback when the cell is clicked. This callback is only active when selectable is false. */
  def onCellClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
  /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
  def onCellDoubleClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
  /** Notification if the filter value changes */
  def onFilterValueChange(value: String): Unit = js.native
  def onNextPageClick(event: js.Any): Unit = js.native
  def onPreviousPageClick(event: js.Any): Unit = js.native
  def onRowSelection(selectedRows: js.Any): Unit = js.native
  def onRowSizeChange(index: Double, value: js.Any): Unit = js.native
  def onSortOrderChange(key: String, order: String): Unit = js.native
  /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
  def summaryLabelTemplate(start: Double, end: Double, count: Double): js.Any = js.native
}

object DataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    count: Double,
    data: js.Array[_],
    deselectOnClickaway: Boolean,
    enableSelectAll: Boolean,
    filterHintText: String,
    filterValue: String,
    fixedFooter: Boolean,
    fixedHeader: Boolean,
    footerToolbarStyle: CSSProperties,
    headerToolbarMode: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String,
    height: js.Any,
    multiSelectable: Boolean,
    onCellClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
    onCellDoubleClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
    onFilterValueChange: String => Unit,
    onNextPageClick: js.Any => Unit,
    onPreviousPageClick: js.Any => Unit,
    onRowSelection: js.Any => Unit,
    onRowSizeChange: (Double, js.Any) => Unit,
    onSortOrderChange: (String, String) => Unit,
    page: Double,
    rowSize: Double,
    rowSizeLabel: String,
    rowSizeList: js.Array[Double],
    selectable: Boolean,
    showCheckboxes: Boolean,
    showFooterToolbar: Boolean,
    showHeaderToolbar: Boolean,
    showHeaderToolbarFilterIcon: Boolean,
    showRowHover: Boolean,
    showRowSizeControls: Boolean,
    stripedRows: Boolean,
    summaryLabelTemplate: (Double, Double, Double) => js.Any,
    tableBodyStyle: CSSProperties,
    tableHeaderColumnStyle: CSSProperties,
    tableHeaderStyle: CSSProperties,
    tableRowColumnStyle: CSSProperties,
    tableRowStyle: CSSProperties,
    tableStyle: CSSProperties,
    tableWrapperStyle: CSSProperties,
    title: String,
    titleStyle: CSSProperties,
    toolbarIconRight: js.Any
  ): DataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deselectOnClickaway = deselectOnClickaway.asInstanceOf[js.Any], enableSelectAll = enableSelectAll.asInstanceOf[js.Any], filterHintText = filterHintText.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], fixedFooter = fixedFooter.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], footerToolbarStyle = footerToolbarStyle.asInstanceOf[js.Any], headerToolbarMode = headerToolbarMode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multiSelectable = multiSelectable.asInstanceOf[js.Any], onCellClick = js.Any.fromFunction5(onCellClick), onCellDoubleClick = js.Any.fromFunction5(onCellDoubleClick), onFilterValueChange = js.Any.fromFunction1(onFilterValueChange), onNextPageClick = js.Any.fromFunction1(onNextPageClick), onPreviousPageClick = js.Any.fromFunction1(onPreviousPageClick), onRowSelection = js.Any.fromFunction1(onRowSelection), onRowSizeChange = js.Any.fromFunction2(onRowSizeChange), onSortOrderChange = js.Any.fromFunction2(onSortOrderChange), page = page.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], rowSizeLabel = rowSizeLabel.asInstanceOf[js.Any], rowSizeList = rowSizeList.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showCheckboxes = showCheckboxes.asInstanceOf[js.Any], showFooterToolbar = showFooterToolbar.asInstanceOf[js.Any], showHeaderToolbar = showHeaderToolbar.asInstanceOf[js.Any], showHeaderToolbarFilterIcon = showHeaderToolbarFilterIcon.asInstanceOf[js.Any], showRowHover = showRowHover.asInstanceOf[js.Any], showRowSizeControls = showRowSizeControls.asInstanceOf[js.Any], stripedRows = stripedRows.asInstanceOf[js.Any], summaryLabelTemplate = js.Any.fromFunction3(summaryLabelTemplate), tableBodyStyle = tableBodyStyle.asInstanceOf[js.Any], tableHeaderColumnStyle = tableHeaderColumnStyle.asInstanceOf[js.Any], tableHeaderStyle = tableHeaderStyle.asInstanceOf[js.Any], tableRowColumnStyle = tableRowColumnStyle.asInstanceOf[js.Any], tableRowStyle = tableRowStyle.asInstanceOf[js.Any], tableStyle = tableStyle.asInstanceOf[js.Any], tableWrapperStyle = tableWrapperStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], toolbarIconRight = toolbarIconRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeselectOnClickaway(value: Boolean): Self = this.set("deselectOnClickaway", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSelectAll(value: Boolean): Self = this.set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterHintText(value: String): Self = this.set("filterHintText", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedFooter(value: Boolean): Self = this.set("fixedFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterToolbarStyle(value: CSSProperties): Self = this.set("footerToolbarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderToolbarMode(value: typings.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): Self = this.set("headerToolbarMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCellClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = this.set("onCellClick", js.Any.fromFunction5(value))
    @scala.inline
    def setOnCellDoubleClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = this.set("onCellDoubleClick", js.Any.fromFunction5(value))
    @scala.inline
    def setOnFilterValueChange(value: String => Unit): Self = this.set("onFilterValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNextPageClick(value: js.Any => Unit): Self = this.set("onNextPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPreviousPageClick(value: js.Any => Unit): Self = this.set("onPreviousPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRowSelection(value: js.Any => Unit): Self = this.set("onRowSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRowSizeChange(value: (Double, js.Any) => Unit): Self = this.set("onRowSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSortOrderChange(value: (String, String) => Unit): Self = this.set("onSortOrderChange", js.Any.fromFunction2(value))
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSize(value: Double): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSizeLabel(value: String): Self = this.set("rowSizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSizeListVarargs(value: Double*): Self = this.set("rowSizeList", js.Array(value :_*))
    @scala.inline
    def setRowSizeList(value: js.Array[Double]): Self = this.set("rowSizeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowCheckboxes(value: Boolean): Self = this.set("showCheckboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFooterToolbar(value: Boolean): Self = this.set("showFooterToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHeaderToolbar(value: Boolean): Self = this.set("showHeaderToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHeaderToolbarFilterIcon(value: Boolean): Self = this.set("showHeaderToolbarFilterIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRowHover(value: Boolean): Self = this.set("showRowHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRowSizeControls(value: Boolean): Self = this.set("showRowSizeControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setStripedRows(value: Boolean): Self = this.set("stripedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummaryLabelTemplate(value: (Double, Double, Double) => js.Any): Self = this.set("summaryLabelTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setTableBodyStyle(value: CSSProperties): Self = this.set("tableBodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableHeaderColumnStyle(value: CSSProperties): Self = this.set("tableHeaderColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableHeaderStyle(value: CSSProperties): Self = this.set("tableHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableRowColumnStyle(value: CSSProperties): Self = this.set("tableRowColumnStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableRowStyle(value: CSSProperties): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableStyle(value: CSSProperties): Self = this.set("tableStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableWrapperStyle(value: CSSProperties): Self = this.set("tableWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleStyle(value: CSSProperties): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarIconRight(value: js.Any): Self = this.set("toolbarIconRight", value.asInstanceOf[js.Any])
  }
  
}

