package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  var cellReferences: js.Array[_] = js.native
  var data: js.Array[_] = js.native
  var t: RecordTranslator = js.native
  def add(cellValue: js.Object): Unit = js.native
  def add(cellValue: typings.handsontable.handsontableMod.Handsontable.plugins.CellValue): Unit = js.native
  def getCellAt(row: Double, column: Double): typings.handsontable.handsontableMod.Handsontable.plugins.CellValue | Unit = js.native
  def getDependencies(cellCoord: js.Object): Unit = js.native
  def getOutOfDateCells(): js.Array[_] = js.native
  def registerCellRef(cellReference: js.Object): Unit = js.native
  def registerCellRef(cellReference: CellReference): Unit = js.native
  def remove(cellValue: js.Array[_]): Unit = js.native
  def remove(cellValue: js.Object): Unit = js.native
  def remove(cellValue: typings.handsontable.handsontableMod.Handsontable.plugins.CellValue): Unit = js.native
  def removeCellRefsAtRange(start: js.Object, end: js.Object): js.Array[_] = js.native
  def reset(): Unit = js.native
}

