package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiColumnSorting extends Base {
  def clearSort(): scala.Unit = js.native
  def getSortConfig(): scala.Unit | MultiColumnSortConfig | js.Array[MultiColumnSortConfig] = js.native
  def getSortConfig(column: scala.Double): scala.Unit | MultiColumnSortConfig | js.Array[MultiColumnSortConfig] = js.native
  def isSorted(): scala.Boolean = js.native
  def setSortConfigs(sortConfigs: js.Array[MultiColumnSortConfig]): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def sort(sortConfig: MultiColumnSortConfig): scala.Unit = js.native
  def sort(sortConfig: js.Array[MultiColumnSortConfig]): scala.Unit = js.native
}

