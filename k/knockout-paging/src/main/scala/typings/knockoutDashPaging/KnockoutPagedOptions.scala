package typings.knockoutDashPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPagedOptions extends js.Object {
  var pageGenerator: js.UndefOr[String] = js.undefined
  var pageNumber: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
}

object KnockoutPagedOptions {
  @scala.inline
  def apply(pageGenerator: String = null, pageNumber: Int | Double = null, pageSize: Int | Double = null): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    if (pageGenerator != null) __obj.updateDynamic("pageGenerator")(pageGenerator.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
}

