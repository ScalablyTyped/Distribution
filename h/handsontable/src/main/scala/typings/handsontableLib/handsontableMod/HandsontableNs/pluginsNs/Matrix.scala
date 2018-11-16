package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  var cellReferences: js.Array[_] = js.native
  var data: js.Array[_] = js.native
  var t: RecordTranslator = js.native
  def add(cellValue: CellValue): scala.Unit = js.native
  def add(cellValue: js.Object): scala.Unit = js.native
  def getCellAt(row: scala.Double, column: scala.Double): CellValue | scala.Unit = js.native
  def getDependencies(cellCoord: js.Object): scala.Unit = js.native
  def getOutOfDateCells(): js.Array[_] = js.native
  def registerCellRef(cellReference: CellReference): scala.Unit = js.native
  def registerCellRef(cellReference: js.Object): scala.Unit = js.native
  def remove(cellValue: CellValue): scala.Unit = js.native
  def remove(cellValue: js.Array[_]): scala.Unit = js.native
  def remove(cellValue: js.Object): scala.Unit = js.native
  def removeCellRefsAtRange(start: js.Object, end: js.Object): js.Array[_] = js.native
  def reset(): scala.Unit = js.native
}

