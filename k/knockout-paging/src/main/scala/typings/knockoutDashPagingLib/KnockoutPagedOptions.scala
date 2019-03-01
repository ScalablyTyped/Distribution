package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPagedOptions extends js.Object {
  var pageGenerator: js.UndefOr[java.lang.String] = js.undefined
  var pageNumber: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
}

object KnockoutPagedOptions {
  @scala.inline
  def apply(
    pageGenerator: java.lang.String = null,
    pageNumber: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null
  ): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    if (pageGenerator != null) __obj.updateDynamic("pageGenerator")(pageGenerator)
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
}

