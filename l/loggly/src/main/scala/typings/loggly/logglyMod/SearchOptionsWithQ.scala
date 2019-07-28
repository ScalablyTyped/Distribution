package typings.loggly.logglyMod

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
    rows: Int | Double = null,
    size: Int | Double = null,
    until: String = null
  ): SearchOptionsWithQ = {
    val __obj = js.Dynamic.literal(q = q)
    if (from != null) __obj.updateDynamic("from")(from)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[SearchOptionsWithQ]
  }
}

