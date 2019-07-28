package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

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
    val __obj = js.Dynamic.literal(changes = changes, columnDataFactory = js.Any.fromFunction1(columnDataFactory), conditionCollection = conditionCollection, destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), grouping = grouping, latestEditedColumnPosition = latestEditedColumnPosition, latestOrderStack = latestOrderStack, updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
  
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
}

