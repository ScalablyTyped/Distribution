package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptionsWithQ
  extends SharedSearchOptions
     with SearchOptions {
  var q: String
}

object SearchOptionsWithQ {
  @scala.inline
  def apply(
    q: String,
    from: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    until: String = null
  ): SearchOptionsWithQ = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsWithQ]
  }
}

