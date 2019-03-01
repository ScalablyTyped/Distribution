package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPagingDefaultOptions extends js.Object {
  var pageNumber: scala.Double
  var pageSize: scala.Double
}

object KnockoutPagingDefaultOptions {
  @scala.inline
  def apply(pageNumber: scala.Double, pageSize: scala.Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pageNumber")(pageNumber)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
}

