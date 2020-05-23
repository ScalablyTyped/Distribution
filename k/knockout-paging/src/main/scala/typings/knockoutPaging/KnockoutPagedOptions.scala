package typings.knockoutPaging

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
  def apply(
    pageGenerator: String = null,
    pageNumber: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    if (pageGenerator != null) __obj.updateDynamic("pageGenerator")(pageGenerator.asInstanceOf[js.Any])
    if (!js.isUndefined(pageNumber)) __obj.updateDynamic("pageNumber")(pageNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
}

