package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.columnSorting.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSorting extends Base {
  
  def clearSort(): Unit = js.native
  
  def getSortConfig(): js.Array[Config] = js.native
  def getSortConfig(column: Double): Unit | Config = js.native
  
  def isSorted(): Boolean = js.native
  
  def setSortConfig(): Unit = js.native
  def setSortConfig(sortConfig: js.Array[Config]): Unit = js.native
  def setSortConfig(sortConfig: Config): Unit = js.native
  
  def sort(): Unit = js.native
  def sort(sortConfig: Config): Unit = js.native
}
