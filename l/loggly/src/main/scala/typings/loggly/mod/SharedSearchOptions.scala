package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSearchOptions extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var until: js.UndefOr[String] = js.undefined
}

object SharedSearchOptions {
  @scala.inline
  def apply(
    from: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    until: String = null
  ): SharedSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedSearchOptions]
  }
}

