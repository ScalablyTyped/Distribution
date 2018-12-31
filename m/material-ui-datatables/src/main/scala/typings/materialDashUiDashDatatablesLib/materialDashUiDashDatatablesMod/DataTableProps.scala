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

