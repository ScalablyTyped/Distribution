package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ActionBarComponent
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.CellLikeData
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ConditionCollection
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ConditionComponent
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ConditionUpdateObserver
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.OperationType
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ValueComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends Base {
  var actionBarComponent: ActionBarComponent | Unit = js.native
  var conditionCollection: ConditionCollection | Unit = js.native
  var conditionComponent: ConditionComponent | Unit = js.native
  var conditionUpdateObserver: ConditionUpdateObserver | Unit = js.native
  var dropdownMenuPlugin: DropdownMenu | Unit = js.native
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager = js.native
  var lastSelectedColumn: js.UndefOr[Double | Unit] = js.native
  var trimRowsPlugin: TrimRows | Unit = js.native
  var valueComponent: ValueComponent | Unit = js.native
  def addCondition(column: Double, name: String, args: js.Array[_], operationId: OperationType): Unit = js.native
  def clearColumnSelection(): Unit = js.native
  def clearConditions(): Unit = js.native
  def clearConditions(column: Double): Unit = js.native
  def clearConditions(column: Unit): Unit = js.native
  def filter(): Unit = js.native
  def getDataMapAtColumn(column: Double): js.Array[CellLikeData] = js.native
  def getSelectedColumn(): Double | Unit = js.native
  def removeConditions(column: Double): Unit = js.native
}

