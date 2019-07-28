package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCell extends js.Object {
  var columnAbsolute: Boolean
  var columnOffset: Double
  var rowAbsolute: Boolean
  var rowOffset: Double
  def isEqual(cell: BaseCell): Boolean
  def translateTo(rowOffset: Double, columnOffset: Double): Unit
}

object BaseCell {
  @scala.inline
  def apply(
    columnAbsolute: Boolean,
    columnOffset: Double,
    isEqual: BaseCell => Boolean,
    rowAbsolute: Boolean,
    rowOffset: Double,
    toString: () => String,
    translateTo: (Double, Double) => Unit
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute, columnOffset = columnOffset, isEqual = js.Any.fromFunction1(isEqual), rowAbsolute = rowAbsolute, rowOffset = rowOffset, toString = js.Any.fromFunction0(toString), translateTo = js.Any.fromFunction2(translateTo))
  
    __obj.asInstanceOf[BaseCell]
  }
}

