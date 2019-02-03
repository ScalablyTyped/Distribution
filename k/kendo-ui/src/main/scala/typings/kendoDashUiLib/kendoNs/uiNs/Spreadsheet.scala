package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Spreadsheet")
@js.native
class Spreadsheet protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SpreadsheetOptions) = this()
  @JSName("options")
  var options_Spreadsheet: SpreadsheetOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def activeSheet(): kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = js.native
  def activeSheet(sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet): scala.Unit = js.native
  @JSName("activeSheet")
  def activeSheet_Unit(): scala.Unit = js.native
  def cellContextMenu(): ContextMenu = js.native
  def colHeaderContextMenu(): ContextMenu = js.native
  def defineName(name: java.lang.String, value: java.lang.String, hidden: scala.Boolean): scala.Unit = js.native
  def fromFile(blob: stdLib.Blob): kendoDashUiLib.JQueryPromise[_] = js.native
  def fromFile(blob: stdLib.File): kendoDashUiLib.JQueryPromise[_] = js.native
  def fromJSON(data: js.Any): scala.Unit = js.native
  def insertSheet(options: js.Any): kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = js.native
  def moveSheetToIndex(sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet, index: scala.Double): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeSheet(sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet): scala.Unit = js.native
  def renameSheet(sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet, newSheetName: java.lang.String): kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = js.native
  def rowHeaderContextMenu(): ContextMenu = js.native
  def saveAsExcel(): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def sheetByIndex(index: scala.Double): kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = js.native
  def sheetByName(name: java.lang.String): kendoDashUiLib.kendoNs.spreadsheetNs.Sheet = js.native
  def sheetIndex(sheet: kendoDashUiLib.kendoNs.spreadsheetNs.Sheet): scala.Double = js.native
  def sheets(): js.Any = js.native
  def toJSON(): js.Any = js.native
  def undefineName(name: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Spreadsheet")
@js.native
object Spreadsheet extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Spreadsheet = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Spreadsheet = js.native
}

