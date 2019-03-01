package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrievalOptions extends js.Object {
  var exprs: js.UndefOr[AnyObject[java.lang.String]] = js.undefined
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[js.Array[OrderingOptions]] = js.undefined
  var pageLength: js.UndefOr[scala.Double] = js.undefined
}

object RetrievalOptions {
  @scala.inline
  def apply(
    exprs: AnyObject[java.lang.String] = null,
    fields: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    order: js.Array[OrderingOptions] = null,
    pageLength: scala.Int | scala.Double = null
  ): RetrievalOptions = {
    val __obj = js.Dynamic.literal()
    if (exprs != null) __obj.updateDynamic("exprs")(exprs)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (pageLength != null) __obj.updateDynamic("pageLength")(pageLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievalOptions]
  }
}

