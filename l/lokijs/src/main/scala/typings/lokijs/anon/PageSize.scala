package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSize extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var paging: js.UndefOr[Boolean] = js.undefined
}

object PageSize {
  @scala.inline
  def apply(
    delimiter: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    paging: js.UndefOr[Boolean] = js.undefined
  ): PageSize = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
}

