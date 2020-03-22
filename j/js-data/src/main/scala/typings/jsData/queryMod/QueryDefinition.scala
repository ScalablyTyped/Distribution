package typings.jsData.queryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDefinition
  extends /* attr */ StringDictionary[js.Any] {
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[js.Any] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Any] = js.undefined
  var where: js.UndefOr[js.Any] = js.undefined
}

object QueryDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* attr */ StringDictionary[js.Any] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    orderBy: js.Any = null,
    skip: Int | Double = null,
    sort: js.Any = null,
    where: js.Any = null
  ): QueryDefinition = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinition]
  }
}

