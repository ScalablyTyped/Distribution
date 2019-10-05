package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendo.spreadsheet.Sheet
import typings.std.Blob
import typings.std.Element
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Spreadsheet")
@js.native
class Spreadsheet protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SpreadsheetOptions) = this()
  @JSName("options")
  var options_Spreadsheet: SpreadsheetOptions = js.native
  var wrapper: JQuery = js.native
  def activeSheet(): Sheet = js.native
  def activeSheet(sheet: Sheet): Unit = js.native
  @JSName("activeSheet")
  def activeSheet_Unit(): Unit = js.native
  def cellContextMenu(): ContextMenu = js.native
  def colHeaderContextMenu(): ContextMenu = js.native
  def defineName(name: String, value: String, hidden: Boolean): Unit = js.native
  def fromFile(blob: Blob): JQueryPromise[_] = js.native
  def fromFile(blob: File): JQueryPromise[_] = js.native
  def fromJSON(data: js.Any): Unit = js.native
  def insertSheet(options: js.Any): Sheet = js.native
  def moveSheetToIndex(sheet: Sheet, index: Double): Unit = js.native
  def refresh(): Unit = js.native
  def removeSheet(sheet: Sheet): Unit = js.native
  def renameSheet(sheet: Sheet, newSheetName: String): Sheet = js.native
  def rowHeaderContextMenu(): ContextMenu = js.native
  def saveAsExcel(): Unit = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def sheetByIndex(index: Double): Sheet = js.native
  def sheetByName(name: String): Sheet = js.native
  def sheetIndex(sheet: Sheet): Double = js.native
  def sheets(): js.Any = js.native
  def toJSON(): js.Any = js.native
  def undefineName(name: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Spreadsheet")
@js.native
object Spreadsheet extends js.Object {
  var fn: Spreadsheet = js.native
  def extend(proto: js.Object): Spreadsheet = js.native
}

