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
    onChange: js.Function1[scala.Double, scala.Unit],
    total: scala.Double
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("display")(display)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[PaginationProps]
  }
}

