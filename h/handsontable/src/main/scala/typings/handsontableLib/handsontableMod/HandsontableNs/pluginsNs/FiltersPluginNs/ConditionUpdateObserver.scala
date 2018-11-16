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

