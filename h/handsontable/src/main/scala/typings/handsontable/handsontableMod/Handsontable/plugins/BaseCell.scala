package typings.handsontable.handsontableMod.Handsontable.plugins

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
    translateTo: (Double, Double) => Unit
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], translateTo = js.Any.fromFunction2(translateTo))
  
    __obj.asInstanceOf[BaseCell]
  }
}

