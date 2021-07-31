package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.kendo.spreadsheet.Sheet
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spreadsheet
  extends StObject
     with Widget {
  
  def activeSheet(): Sheet = js.native
  def activeSheet(sheet: Sheet): Unit = js.native
  @JSName("activeSheet")
  def activeSheet_Unit(): Unit = js.native
  
  def cellContextMenu(): ContextMenu = js.native
  
  def colHeaderContextMenu(): ContextMenu = js.native
  
  def defineName(name: String, value: String, hidden: Boolean): Unit = js.native
  
  def fromFile(blob: Blob): JQueryPromise[js.Any] = js.native
  def fromFile(blob: File): JQueryPromise[js.Any] = js.native
  
  def fromJSON(data: js.Any): Unit = js.native
  
  def insertSheet(options: js.Any): Sheet = js.native
  
  def moveSheetToIndex(sheet: Sheet, index: Double): Unit = js.native
  
  @JSName("options")
  var options_Spreadsheet: SpreadsheetOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeSheet(sheet: Sheet): Unit = js.native
  
  def renameSheet(sheet: Sheet, newSheetName: String): Sheet = js.native
  
  def rowHeaderContextMenu(): ContextMenu = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[js.Any] = js.native
  
  def sheetByIndex(index: Double): Sheet = js.native
  
  def sheetByName(name: String): Sheet = js.native
  
  def sheetIndex(sheet: Sheet): Double = js.native
  
  def sheets(): js.Any = js.native
  
  def toJSON(): js.Any = js.native
  
  def undefineName(name: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
