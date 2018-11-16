package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends Base {
  var actionBarComponent: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ActionBarComponent | scala.Unit = js.native
  var conditionCollection: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ConditionCollection | scala.Unit = js.native
  var conditionComponent: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ConditionComponent | scala.Unit = js.native
  var conditionUpdateObserver: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ConditionUpdateObserver | scala.Unit = js.native
  var dropdownMenuPlugin: DropdownMenu | scala.Unit = js.native
  var eventManager: EventManager = js.native
  var lastSelectedColumn: js.UndefOr[scala.Double | scala.Unit] = js.native
  var trimRowsPlugin: TrimRows | scala.Unit = js.native
  var valueComponent: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ValueComponent | scala.Unit = js.native
  def addCondition(
    column: scala.Double,
    name: java.lang.String,
    args: js.Array[_],
    operationId: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.OperationType
  ): scala.Unit = js.native
  def clearColumnSelection(): scala.Unit = js.native
  def clearConditions(): scala.Unit = js.native
  def clearConditions(column: scala.Double): scala.Unit = js.native
  def clearConditions(column: scala.Unit): scala.Unit = js.native
  def filter(): scala.Unit = js.native
  def getDataMapAtColumn(column: scala.Double): js.Array[
    handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.CellLikeData
  ] = js.native
  def getSelectedColumn(): scala.Double | scala.Unit = js.native
  def removeConditions(column: scala.Double): scala.Unit = js.native
}

