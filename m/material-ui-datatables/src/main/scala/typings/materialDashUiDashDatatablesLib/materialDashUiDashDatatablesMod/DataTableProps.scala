package typings
package materialDashUiDashDatatablesLib.materialDashUiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableProps extends js.Object {
  /**
    * The column structure.
    * ```let columns: Column[] = [{
    *      key: 'bookName',
    *      label: 'Book Name & Author',
    *      render: (__value: any, book: any) => book.name + ' by ' book.author
    *  },```
    */
  var columns: js.Array[Column]
  var count: scala.Double
  /** The array of objects used as data for the table */
  var data: js.Array[_]
  /** If clicking away de-selects all */
  var deselectOnClickaway: scala.Boolean
  /** Adds a select all button */
  var enableSelectAll: scala.Boolean
  /** Filter hint text */
  var filterHintText: java.lang.String
   // BUG https://github.com/Microsoft/TypeScript/issues/11465
  /** The current filter value */
  var filterValue: java.lang.String
  /** If the footer should be fixed */
  var fixedFooter: scala.Boolean
  /** If the header should be fixed */
  var fixedHeader: scala.Boolean
  /** React Style object applied to footer toolbar */
  var footerToolbarStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
  var headerToolbarMode: materialDashUiDashDatatablesLib.materialDashUiDashDatatablesLibStrings.default | materialDashUiDashDatatablesLib.materialDashUiDashDatatablesLibStrings.filter | java.lang.String
  /** The hight of the table */
  var height: js.Any
  /** If multiple table rows are select-able */
  var multiSelectable: scala.Boolean
  var page: scala.Double
  var rowSize: scala.Double
  var rowSizeLabel: java.lang.String
  var rowSizeList: js.Array[scala.Double]
  /** If the table rows are select-able */
  var selectable: scala.Boolean
  /** Show check-boxes for selected rows */
  var showCheckboxes: scala.Boolean
  /** Shows a footer toolbar */
  var showFooterToolbar: scala.Boolean
  /** Shows a header toolbar */
  var showHeaderToolbar: scala.Boolean
  /** Show the icon to turn on the filtering feature */
  var showHeaderToolbarFilterIcon: scala.Boolean
  /** Display a hover in the row under the mouse */
  var showRowHover: scala.Boolean
  var showRowSizeControls: scala.Boolean
  /** To display striped rows in the table */
  var stripedRows: scala.Boolean
  /** React style object for the tbody tag */
  var tableBodyStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** React style object for the th/td tag */
  var tableHeaderColumnStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** React style object for the th tag */
  var tableHeaderStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** React style object for the tr/td tag */
  var tableRowColumnStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** React style object for the tr tag */
  var tableRowStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** React style object for the table tag */
  var tableStyle: reactLib.reactMod.ReactNs.CSSProperties
  var tableWrapperStyle: reactLib.reactMod.ReactNs.CSSProperties
  /** Table title */
  var title: java.lang.String
  /** React Style object for the title */
  var titleStyle: reactLib.reactMod.ReactNs.CSSProperties
  var toolbarIconRight: js.Any
  /** Callback when the cell is clicked. This callback is only active when selectable is false. */
  def onCellClick(rowIndex: scala.Double, columnIndex: scala.Double, row: js.Any, columnValue: js.Any, event: js.Any): scala.Unit
  /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
  def onCellDoubleClick(rowIndex: scala.Double, columnIndex: scala.Double, row: js.Any, columnValue: js.Any, event: js.Any): scala.Unit
  /** Notification if the filter value changes */
  def onFilterValueChange(value: java.lang.String): scala.Unit
  def onNextPageClick(event: js.Any): scala.Unit
  def onPreviousPageClick(event: js.Any): scala.Unit
  def onRowSelection(selectedRows: js.Any): scala.Unit
  def onRowSizeChange(index: scala.Double, value: js.Any): scala.Unit
  def onSortOrderChange(key: java.lang.String, order: java.lang.String): scala.Unit
  /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
  def summaryLabelTemplate(start: scala.Double, end: scala.Double, count: scala.Double): js.Any
}

object DataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    count: scala.Double,
    data: js.Array[_],
    deselectOnClickaway: scala.Boolean,
    enableSelectAll: scala.Boolean,
    filterHintText: java.lang.String,
    filterValue: java.lang.String,
    fixedFooter: scala.Boolean,
    fixedHeader: scala.Boolean,
    footerToolbarStyle: reactLib.reactMod.ReactNs.CSSProperties,
    headerToolbarMode: materialDashUiDashDatatablesLib.materialDashUiDashDatatablesLibStrings.default | materialDashUiDashDatatablesLib.materialDashUiDashDatatablesLibStrings.filter | java.lang.String,
    height: js.Any,
    multiSelectable: scala.Boolean,
    onCellClick: js.Function5[scala.Double, scala.Double, js.Any, js.Any, js.Any, scala.Unit],
    onCellDoubleClick: js.Function5[scala.Double, scala.Double, js.Any, js.Any, js.Any, scala.Unit],
    onFilterValueChange: js.Function1[java.lang.String, scala.Unit],
    onNextPageClick: js.Function1[js.Any, scala.Unit],
    onPreviousPageClick: js.Function1[js.Any, scala.Unit],
    onRowSelection: js.Function1[js.Any, scala.Unit],
    onRowSizeChange: js.Function2[scala.Double, js.Any, scala.Unit],
    onSortOrderChange: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    page: scala.Double,
    rowSize: scala.Double,
    rowSizeLabel: java.lang.String,
    rowSizeList: js.Array[scala.Double],
    selectable: scala.Boolean,
    showCheckboxes: scala.Boolean,
    showFooterToolbar: scala.Boolean,
    showHeaderToolbar: scala.Boolean,
    showHeaderToolbarFilterIcon: scala.Boolean,
    showRowHover: scala.Boolean,
    showRowSizeControls: scala.Boolean,
    stripedRows: scala.Boolean,
    summaryLabelTemplate: js.Function3[scala.Double, scala.Double, scala.Double, js.Any],
    tableBodyStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableHeaderColumnStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableHeaderStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableRowColumnStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableRowStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableStyle: reactLib.reactMod.ReactNs.CSSProperties,
    tableWrapperStyle: reactLib.reactMod.ReactNs.CSSProperties,
    title: java.lang.String,
    titleStyle: reactLib.reactMod.ReactNs.CSSProperties,
    toolbarIconRight: js.Any
  ): DataTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway)
    __obj.updateDynamic("enableSelectAll")(enableSelectAll)
    __obj.updateDynamic("filterHintText")(filterHintText)
    __obj.updateDynamic("filterValue")(filterValue)
    __obj.updateDynamic("fixedFooter")(fixedFooter)
    __obj.updateDynamic("fixedHeader")(fixedHeader)
    __obj.updateDynamic("footerToolbarStyle")(footerToolbarStyle)
    __obj.updateDynamic("headerToolbarMode")(headerToolbarMode.asInstanceOf[js.Any])
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("multiSelectable")(multiSelectable)
    __obj.updateDynamic("onCellClick")(onCellClick)
    __obj.updateDynamic("onCellDoubleClick")(onCellDoubleClick)
    __obj.updateDynamic("onFilterValueChange")(onFilterValueChange)
    __obj.updateDynamic("onNextPageClick")(onNextPageClick)
    __obj.updateDynamic("onPreviousPageClick")(onPreviousPageClick)
    __obj.updateDynamic("onRowSelection")(onRowSelection)
    __obj.updateDynamic("onRowSizeChange")(onRowSizeChange)
    __obj.updateDynamic("onSortOrderChange")(onSortOrderChange)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("rowSize")(rowSize)
    __obj.updateDynamic("rowSizeLabel")(rowSizeLabel)
    __obj.updateDynamic("rowSizeList")(rowSizeList)
    __obj.updateDynamic("selectable")(selectable)
    __obj.updateDynamic("showCheckboxes")(showCheckboxes)
    __obj.updateDynamic("showFooterToolbar")(showFooterToolbar)
    __obj.updateDynamic("showHeaderToolbar")(showHeaderToolbar)
    __obj.updateDynamic("showHeaderToolbarFilterIcon")(showHeaderToolbarFilterIcon)
    __obj.updateDynamic("showRowHover")(showRowHover)
    __obj.updateDynamic("showRowSizeControls")(showRowSizeControls)
    __obj.updateDynamic("stripedRows")(stripedRows)
    __obj.updateDynamic("summaryLabelTemplate")(summaryLabelTemplate)
    __obj.updateDynamic("tableBodyStyle")(tableBodyStyle)
    __obj.updateDynamic("tableHeaderColumnStyle")(tableHeaderColumnStyle)
    __obj.updateDynamic("tableHeaderStyle")(tableHeaderStyle)
    __obj.updateDynamic("tableRowColumnStyle")(tableRowColumnStyle)
    __obj.updateDynamic("tableRowStyle")(tableRowStyle)
    __obj.updateDynamic("tableStyle")(tableStyle)
    __obj.updateDynamic("tableWrapperStyle")(tableWrapperStyle)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.updateDynamic("toolbarIconRight")(toolbarIconRight)
    __obj.asInstanceOf[DataTableProps]
  }
}

