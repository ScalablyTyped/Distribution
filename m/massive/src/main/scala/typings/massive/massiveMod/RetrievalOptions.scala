package typings.massive.massiveMod

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
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[OrderingOptions] = null,
    pageLength: Int | Double = null
  ): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    if (exprs != null) __obj.updateDynamic("exprs")(exprs.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageLength != null) __obj.updateDynamic("pageLength")(pageLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievalOptions]
  }
}

