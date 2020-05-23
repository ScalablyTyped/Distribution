package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.loggly.mod.SearchOptionsWithQ
  - typings.loggly.mod.SearchOptionsWithQuery
*/
trait SearchOptions extends js.Object

object SearchOptions {
  @scala.inline
  def SearchOptionsWithQ(
    q: String,
    from: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    until: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  def SearchOptionsWithQuery(
    query: String,
    from: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    until: String = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

