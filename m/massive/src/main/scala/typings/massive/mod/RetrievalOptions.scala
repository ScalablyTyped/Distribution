package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrievalOptions extends js.Object {
  var exprs: js.UndefOr[AnyObject[String]] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[js.Array[OrderingOptions]] = js.undefined
  var pageLength: js.UndefOr[Double] = js.undefined
}

object RetrievalOptions {
  @scala.inline
  def apply(
    exprs: AnyObject[String] = null,
    fields: js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    order: js.Array[OrderingOptions] = null,
    pageLength: js.UndefOr[Double] = js.undefined
  ): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    if (exprs != null) __obj.updateDynamic("exprs")(exprs.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLength)) __obj.updateDynamic("pageLength")(pageLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievalOptions]
  }
}

