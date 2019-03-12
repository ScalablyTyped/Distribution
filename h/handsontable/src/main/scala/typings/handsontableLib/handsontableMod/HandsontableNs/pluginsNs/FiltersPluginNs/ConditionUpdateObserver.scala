package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionUpdateObserver extends js.Object {
  var changes: js.Array[scala.Double]
  var conditionCollection: ConditionCollection
  var grouping: scala.Boolean
  var latestEditedColumnPosition: scala.Double
  var latestOrderStack: js.Array[scala.Double]
  def columnDataFactory(column: scala.Double): js.Array[js.Object]
  def destroy(): scala.Unit
  def flush(): scala.Unit
  def groupChanges(): scala.Unit
  def updateStatesAtColumn(column: scala.Double, conditionArgsChange: js.Object): scala.Unit
}

object ConditionUpdateObserver {
  @scala.inline
  def apply(
    changes: js.Array[scala.Double],
    columnDataFactory: scala.Double => js.Array[js.Object],
    conditionCollection: ConditionCollection,
    destroy: () => scala.Unit,
    flush: () => scala.Unit,
    groupChanges: () => scala.Unit,
    grouping: scala.Boolean,
    latestEditedColumnPosition: scala.Double,
    latestOrderStack: js.Array[scala.Double],
    updateStatesAtColumn: (scala.Double, js.Object) => scala.Unit
  ): ConditionUpdateObserver = {
    val __obj = js.Dynamic.literal(changes = changes, columnDataFactory = js.Any.fromFunction1(columnDataFactory), conditionCollection = conditionCollection, destroy = js.Any.fromFunction0(destroy), flush = js.Any.fromFunction0(flush), groupChanges = js.Any.fromFunction0(groupChanges), grouping = grouping, latestEditedColumnPosition = latestEditedColumnPosition, latestOrderStack = latestOrderStack, updateStatesAtColumn = js.Any.fromFunction2(updateStatesAtColumn))
  
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
}

