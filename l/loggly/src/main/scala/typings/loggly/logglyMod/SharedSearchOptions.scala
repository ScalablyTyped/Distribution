package typings.loggly.logglyMod

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
  def apply(from: String = null, rows: Int | Double = null, size: Int | Double = null, until: String = null): SharedSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[SharedSearchOptions]
  }
}

