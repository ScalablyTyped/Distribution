package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  var alterManager: AlterManager = js.native
  var dataProvider: DataProvider = js.native
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var matrix: Matrix = js.native
  var parser: Parser = js.native
  var t: RecordTranslator = js.native
  def applyChanges(row: scala.Double, column: scala.Double, newValue: js.Any): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getCellAt(row: scala.Double, column: scala.Double): CellValue | scala.Unit = js.native
  def getCellDependencies(row: scala.Double, column: scala.Double): js.Array[_] = js.native
  def getVariable(name: java.lang.String): js.Any = js.native
  def parseExpression(cellValue: CellValue, formula: java.lang.String): scala.Unit = js.native
  def parseExpression(cellValue: js.Object, formula: java.lang.String): scala.Unit = js.native
  def recalculate(): scala.Unit = js.native
  def recalculateFull(): scala.Unit = js.native
  def recalculateOptimized(): scala.Unit = js.native
  def setVariable(name: java.lang.String, value: js.Any): scala.Unit = js.native
}

