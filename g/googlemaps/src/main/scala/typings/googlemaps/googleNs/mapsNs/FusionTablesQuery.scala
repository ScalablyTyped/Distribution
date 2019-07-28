package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    limit: Int | Double = null,
    offset: Int | Double = null,
    orderBy: String = null,
    select: String = null,
    where: String = null
  ): FusionTablesQuery = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (select != null) __obj.updateDynamic("select")(select)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[FusionTablesQuery]
  }
}

