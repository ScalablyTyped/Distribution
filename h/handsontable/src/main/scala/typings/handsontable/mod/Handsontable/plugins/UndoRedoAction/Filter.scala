package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.filter
import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  var actionType: filter = js.native
  
  var conditionsStack: js.Array[ColumnConditions] = js.native
}
object Filter {
  
  @scala.inline
  def apply(actionType: filter, conditionsStack: js.Array[ColumnConditions]): Filter = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], conditionsStack = conditionsStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setActionType(value: filter): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsStackVarargs(value: ColumnConditions*): Self = this.set("conditionsStack", js.Array(value :_*))
    
    @scala.inline
    def setConditionsStack(value: js.Array[ColumnConditions]): Self = this.set("conditionsStack", value.asInstanceOf[js.Any])
  }
}
