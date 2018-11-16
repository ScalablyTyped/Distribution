package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionCollection extends js.Object {
  var conditions: js.Object = js.native
  var orderStack: js.Array[_] = js.native
  def addCondition(column: scala.Double, conditionDefinition: ConditionId): scala.Unit = js.native
  def addCondition(column: scala.Double, conditionDefinition: ConditionId, operation: OperationType): scala.Unit = js.native
  def clean(): scala.Unit = js.native
  def clearConditions(column: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def exportAllConditions(): js.Array[ConditionId] = js.native
  def getConditions(column: scala.Double): js.Array[Condition] = js.native
  def hasConditions(column: scala.Double, name: java.lang.String): scala.Boolean = js.native
  def importAllConditions(conditions: js.Array[ConditionId]): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
  def isMatch(value: CellLikeData, column: scala.Double): scala.Boolean = js.native
  def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData): scala.Boolean = js.native
  def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData, operationType: OperationType): scala.Boolean = js.native
  def removeConditions(column: scala.Double): scala.Unit = js.native
}

