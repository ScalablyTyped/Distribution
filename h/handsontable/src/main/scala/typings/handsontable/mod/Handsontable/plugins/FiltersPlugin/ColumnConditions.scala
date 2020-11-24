package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnConditions extends js.Object {
  
  var column: Double = js.native
  
  var conditions: js.Array[ConditionId] = js.native
  
  var operation: OperationType = js.native
}
object ColumnConditions {
  
  @scala.inline
  def apply(column: Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConditions]
  }
  
  @scala.inline
  implicit class ColumnConditionsOps[Self <: ColumnConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: ConditionId*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[ConditionId]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: OperationType): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
}
