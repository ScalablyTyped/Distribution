package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  var alterManager: AlterManager = js.native
  var dataProvider: DataProvider = js.native
  var hot: Core = js.native
  var matrix: Matrix = js.native
  var parser: Parser = js.native
  var t: RecordTranslator = js.native
  def applyChanges(row: Double, column: Double, newValue: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def getCellAt(row: Double, column: Double): CellValue | Unit = js.native
  def getCellDependencies(row: Double, column: Double): js.Array[_] = js.native
  def getVariable(name: String): js.Any = js.native
  def parseExpression(cellValue: js.Object, formula: String): Unit = js.native
  def parseExpression(cellValue: CellValue, formula: String): Unit = js.native
  def recalculate(): Unit = js.native
  def recalculateFull(): Unit = js.native
  def recalculateOptimized(): Unit = js.native
  def setVariable(name: String, value: js.Any): Unit = js.native
}

