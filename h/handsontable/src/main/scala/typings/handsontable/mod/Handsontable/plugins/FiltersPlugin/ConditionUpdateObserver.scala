package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionUpdateObserver extends js.Object {
  
  var changes: js.Array[Double] = js.native
  
  def columnDataFactory(column: Double): js.Array[js.Object] = js.native
  
  var conditionCollection: ConditionCollection = js.native
  
  def destroy(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def groupChanges(): Unit = js.native
  
  var grouping: Boolean = js.native
  
  var latestEditedColumnPosition: Double = js.native
  
  var latestOrderStack: js.Array[Double] = js.native
  
  def updateStatesAtColumn(column: Double, conditionArgsChange: js.Object): Unit = js.native
}
object ConditionUpdateObserver {
  
  @scala.inline
  def apply(
    changes: js.Array[Double],
    columnDataFactory: Double => js.Array[js.Object],
    conditionCollection: ConditionCollection,
    destroy: () => Unit,
    flush: () => Unit,
    groupChanges: () => Unit,
    grouping: Boolean,
    latestEditedColumnPosition: Double,
    latestOrderStack: js.Array[Double],
    updateStatesAtColumn: (Double, js.Object) => Unit
  ): ConditionUpdateObserver = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], columnDataFactory = js.Any.fromFunction1(columnDataFactory), conditionCollection = conditionCollection.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), grouping = grouping.asInstanceOf[js.Any], latestEditedColumnPosition = latestEditedColumnPosition.asInstanceOf[js.Any], latestOrderStack = latestOrderStack.asInstanceOf[js.Any], updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
  
  @scala.inline
  implicit class ConditionUpdateObserverOps[Self <: ConditionUpdateObserver] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: Double*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[Double]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDataFactory(value: Double => js.Array[js.Object]): Self = this.set("columnDataFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionCollection(value: ConditionCollection): Self = this.set("conditionCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupChanges(value: () => Unit): Self = this.set("groupChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGrouping(value: Boolean): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestEditedColumnPosition(value: Double): Self = this.set("latestEditedColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestOrderStackVarargs(value: Double*): Self = this.set("latestOrderStack", js.Array(value :_*))
    
    @scala.inline
    def setLatestOrderStack(value: js.Array[Double]): Self = this.set("latestOrderStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatesAtColumn(value: (Double, js.Object) => Unit): Self = this.set("updateStatesAtColumn", js.Any.fromFunction2(value))
  }
}
