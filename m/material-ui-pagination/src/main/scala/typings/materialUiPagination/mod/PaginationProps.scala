package typings.materialUiPagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var current: Double = js.native
  var display: Double = js.native
  var total: Double = js.native
  def onChange(value: Double): Unit = js.native
}

object PaginationProps {
  @scala.inline
  def apply(current: Double, display: Double, onChange: Double => Unit, total: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: Double): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

