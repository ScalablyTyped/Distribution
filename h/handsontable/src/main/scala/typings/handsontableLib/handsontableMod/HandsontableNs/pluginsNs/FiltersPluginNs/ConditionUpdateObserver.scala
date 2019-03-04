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
    columnDataFactory: js.Function1[scala.Double, js.Array[js.Object]],
    conditionCollection: ConditionCollection,
    destroy: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    groupChanges: js.Function0[scala.Unit],
    grouping: scala.Boolean,
    latestEditedColumnPosition: scala.Double,
    latestOrderStack: js.Array[scala.Double],
    updateStatesAtColumn: js.Function2[scala.Double, js.Object, scala.Unit]
  ): ConditionUpdateObserver = {
    val __obj = js.Dynamic.literal(changes = changes, columnDataFactory = columnDataFactory, conditionCollection = conditionCollection, destroy = destroy, flush = flush, groupChanges = groupChanges, grouping = grouping, latestEditedColumnPosition = latestEditedColumnPosition, latestOrderStack = latestOrderStack, updateStatesAtColumn = updateStatesAtColumn)
  
    __obj.asInstanceOf[ConditionUpdateObserver]
  }
}

