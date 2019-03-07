package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConditions extends js.Object {
  var column: scala.Double
  var conditions: js.Array[ConditionId]
  var operation: OperationType
}

object ColumnConditions {
  @scala.inline
  def apply(column: scala.Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
    val __obj = js.Dynamic.literal(column = column, conditions = conditions, operation = operation)
  
    __obj.asInstanceOf[ColumnConditions]
  }
}

