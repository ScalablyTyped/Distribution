package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix extends StObject {
  
  def add(cellValue: js.Object): Unit = js.native
  def add(cellValue: CellValue): Unit = js.native
  
  var cellReferences: js.Array[_] = js.native
  
  var data: js.Array[_] = js.native
  
  def getCellAt(row: Double, column: Double): CellValue | Unit = js.native
  
  def getDependencies(cellCoord: js.Object): Unit = js.native
  
  def getOutOfDateCells(): js.Array[_] = js.native
  
  def registerCellRef(cellReference: js.Object): Unit = js.native
  def registerCellRef(cellReference: CellReference): Unit = js.native
  
  def remove(cellValue: js.Array[_]): Unit = js.native
  def remove(cellValue: js.Object): Unit = js.native
  def remove(cellValue: CellValue): Unit = js.native
  
  def removeCellRefsAtRange(start: js.Object, end: js.Object): js.Array[_] = js.native
  
  def reset(): Unit = js.native
}
