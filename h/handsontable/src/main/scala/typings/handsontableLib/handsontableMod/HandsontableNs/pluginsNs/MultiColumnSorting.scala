package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnSorting extends Base {
  def clearSort(): scala.Unit = js.native
  def getSortConfig(): js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config] = js.native
  def getSortConfig(column: scala.Double): scala.Unit | handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config = js.native
  def isSorted(): scala.Boolean = js.native
  def setSortConfig(): scala.Unit = js.native
  def setSortConfig(sortConfig: handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config): scala.Unit = js.native
  def setSortConfig(sortConfig: js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config]): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def sort(sortConfig: handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config): scala.Unit = js.native
  def sort(sortConfig: js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config]): scala.Unit = js.native
}

