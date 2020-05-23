package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait FusionTablesQuery extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[String] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object FusionTablesQuery {
  @scala.inline
  def apply(
    from: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    orderBy: String = null,
    select: String = null,
    where: String = null
  ): FusionTablesQuery = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesQuery]
  }
}

