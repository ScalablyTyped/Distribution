package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordTranslator extends js.Object {
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  def toPhysical(row: js.Object): js.Object | js.Array[_] = js.native
  def toPhysical(row: js.Object, column: scala.Double): js.Object | js.Array[_] = js.native
  def toPhysical(row: scala.Double): js.Object | js.Array[_] = js.native
  def toPhysical(row: scala.Double, column: scala.Double): js.Object | js.Array[_] = js.native
  def toPhysicalColumn(column: scala.Double): scala.Double = js.native
  def toPhysicalRow(row: scala.Double): scala.Double = js.native
  def toVisual(row: js.Object): js.Object | js.Array[_] = js.native
  def toVisual(row: js.Object, column: scala.Double): js.Object | js.Array[_] = js.native
  def toVisual(row: scala.Double): js.Object | js.Array[_] = js.native
  def toVisual(row: scala.Double, column: scala.Double): js.Object | js.Array[_] = js.native
  def toVisualColumn(column: scala.Double): scala.Double = js.native
  def toVisualRow(row: scala.Double): scala.Double = js.native
}

