package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConditions extends js.Object {
  var column: Double
  var conditions: js.Array[ConditionId]
  var operation: OperationType
}

object ColumnConditions {
  @scala.inline
  def apply(column: Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnConditions]
  }
}

