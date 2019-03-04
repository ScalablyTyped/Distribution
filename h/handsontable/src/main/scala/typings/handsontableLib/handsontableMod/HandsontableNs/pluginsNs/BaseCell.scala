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

object BaseCell {
  @scala.inline
  def apply(
    columnAbsolute: scala.Boolean,
    columnOffset: scala.Double,
    isEqual: js.Function1[BaseCell, scala.Boolean],
    rowAbsolute: scala.Boolean,
    rowOffset: scala.Double,
    toString: js.Function0[java.lang.String],
    translateTo: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute, columnOffset = columnOffset, isEqual = isEqual, rowAbsolute = rowAbsolute, rowOffset = rowOffset, toString = toString, translateTo = translateTo)
  
    __obj.asInstanceOf[BaseCell]
  }
}

