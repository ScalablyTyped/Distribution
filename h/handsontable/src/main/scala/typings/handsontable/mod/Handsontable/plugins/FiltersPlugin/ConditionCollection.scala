package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionCollection extends js.Object {
  
  def addCondition(column: Double, conditionDefinition: ConditionId): Unit = js.native
  def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType): Unit = js.native
  
  def clean(): Unit = js.native
  
  def clearConditions(column: Double): Unit = js.native
  
  var conditions: js.Object = js.native
  
  def destroy(): Unit = js.native
  
  def exportAllConditions(): js.Array[ConditionId] = js.native
  
  def getConditions(column: Double): js.Array[Condition] = js.native
  
  def hasConditions(column: Double, name: String): Boolean = js.native
  
  def importAllConditions(conditions: js.Array[ConditionId]): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isMatch(value: CellLikeData, column: Double): Boolean = js.native
  
  def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData): Boolean = js.native
  def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData, operationType: OperationType): Boolean = js.native
  
  var orderStack: js.Array[_] = js.native
  
  def removeConditions(column: Double): Unit = js.native
}
