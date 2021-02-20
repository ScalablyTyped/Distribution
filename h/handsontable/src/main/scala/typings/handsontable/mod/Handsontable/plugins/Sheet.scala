package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends StObject {
  
  var alterManager: AlterManager = js.native
  
  def applyChanges(row: Double, column: Double, newValue: js.Any): Unit = js.native
  
  var dataProvider: DataProvider = js.native
  
  def destroy(): Unit = js.native
  
  def getCellAt(row: Double, column: Double): CellValue | Unit = js.native
  
  def getCellDependencies(row: Double, column: Double): js.Array[_] = js.native
  
  def getVariable(name: String): js.Any = js.native
  
  var hot: Core = js.native
  
  var matrix: Matrix = js.native
  
  def parseExpression(cellValue: js.Object, formula: String): Unit = js.native
  def parseExpression(cellValue: CellValue, formula: String): Unit = js.native
  
  var parser: Parser = js.native
  
  def recalculate(): Unit = js.native
  
  def recalculateFull(): Unit = js.native
  
  def recalculateOptimized(): Unit = js.native
  
  def setVariable(name: String, value: js.Any): Unit = js.native
}
