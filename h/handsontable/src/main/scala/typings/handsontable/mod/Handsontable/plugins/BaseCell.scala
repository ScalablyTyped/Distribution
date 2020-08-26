package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCell extends js.Object {
  var columnAbsolute: Boolean = js.native
  var columnOffset: Double = js.native
  var rowAbsolute: Boolean = js.native
  var rowOffset: Double = js.native
  def isEqual(cell: BaseCell): Boolean = js.native
  def translateTo(rowOffset: Double, columnOffset: Double): Unit = js.native
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
  @scala.inline
  implicit class BaseCellOps[Self <: BaseCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnAbsolute(value: Boolean): Self = this.set("columnAbsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnOffset(value: Double): Self = this.set("columnOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEqual(value: BaseCell => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setRowAbsolute(value: Boolean): Self = this.set("rowAbsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowOffset(value: Double): Self = this.set("rowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslateTo(value: (Double, Double) => Unit): Self = this.set("translateTo", js.Any.fromFunction2(value))
  }
  
}

