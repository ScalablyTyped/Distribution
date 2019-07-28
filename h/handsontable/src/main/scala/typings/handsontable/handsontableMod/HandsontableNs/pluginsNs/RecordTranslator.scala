package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import typings.handsontable.handsontableMod.underscoreHandsontableNs.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordTranslator extends js.Object {
  var hot: Core = js.native
  def toPhysical(row: js.Object): js.Object | js.Array[_] = js.native
  def toPhysical(row: js.Object, column: Double): js.Object | js.Array[_] = js.native
  def toPhysical(row: Double): js.Object | js.Array[_] = js.native
  def toPhysical(row: Double, column: Double): js.Object | js.Array[_] = js.native
  def toPhysicalColumn(column: Double): Double = js.native
  def toPhysicalRow(row: Double): Double = js.native
  def toVisual(row: js.Object): js.Object | js.Array[_] = js.native
  def toVisual(row: js.Object, column: Double): js.Object | js.Array[_] = js.native
  def toVisual(row: Double): js.Object | js.Array[_] = js.native
  def toVisual(row: Double, column: Double): js.Object | js.Array[_] = js.native
  def toVisualColumn(column: Double): Double = js.native
  def toVisualRow(row: Double): Double = js.native
}

