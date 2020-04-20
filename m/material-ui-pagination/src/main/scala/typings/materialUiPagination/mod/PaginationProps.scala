package typings.materialUiPagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var current: Double
  var display: Double
  var total: Double
  def onChange(value: Double): Unit
}

object PaginationProps {
  @scala.inline
  def apply(current: Double, display: Double, onChange: Double => Unit, total: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

