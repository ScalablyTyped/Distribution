package typings
package materialDashUiDashPaginationLib.materialDashUiDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var current: scala.Double
  var display: scala.Double
  var total: scala.Double
  def onChange(value: scala.Double): scala.Unit
}

object PaginationProps {
  @scala.inline
  def apply(
    current: scala.Double,
    display: scala.Double,
    onChange: scala.Double => scala.Unit,
    total: scala.Double
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(current = current, display = display, onChange = js.Any.fromFunction1(onChange), total = total)
  
    __obj.asInstanceOf[PaginationProps]
  }
}

