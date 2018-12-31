package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCell extends js.Object {
  var columnAbsolute: scala.Boolean
  var columnOffset: scala.Double
  var rowAbsolute: scala.Boolean
  var rowOffset: scala.Double
  def isEqual(cell: BaseCell): scala.Boolean
  def translateTo(rowOffset: scala.Double, columnOffset: scala.Double): scala.Unit
}

