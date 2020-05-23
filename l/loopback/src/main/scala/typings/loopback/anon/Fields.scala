package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
  var include: js.UndefOr[String | js.Any | js.Array[_]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var where: js.UndefOr[js.Any] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    fields: String | js.Any | js.Array[_] = null,
    include: String | js.Any | js.Array[_] = null,
    limit: js.UndefOr[Double] = js.undefined,
    order: String = null,
    skip: js.UndefOr[Double] = js.undefined,
    where: js.Any = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

