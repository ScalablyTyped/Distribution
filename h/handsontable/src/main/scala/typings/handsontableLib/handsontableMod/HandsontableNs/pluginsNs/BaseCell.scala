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
    isEqual: BaseCell => scala.Boolean,
    rowAbsolute: scala.Boolean,
    rowOffset: scala.Double,
    toString: () => java.lang.String,
    translateTo: (scala.Double, scala.Double) => scala.Unit
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute, columnOffset = columnOffset, isEqual = js.Any.fromFunction1(isEqual), rowAbsolute = rowAbsolute, rowOffset = rowOffset, toString = js.Any.fromFunction0(toString), translateTo = js.Any.fromFunction2(translateTo))
  
    __obj.asInstanceOf[BaseCell]
  }
}

