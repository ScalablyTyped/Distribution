package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionUpdateObserver extends js.Object {
  var changes: js.Array[Double]
  var conditionCollection: ConditionCollection
  var grouping: Boolean
  var latestEditedColumnPosition: Double
  var latestOrderStack: js.Array[Double]
  def columnDataFactory(column: Double): js.Array[js.Object]
  def destroy(): Unit
  def flush(): Unit
  def groupChanges(): Unit
  def updateStatesAtColumn(column: Double, conditionArgsChange: js.Object): Unit
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
}

