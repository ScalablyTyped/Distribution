package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedSearchOptions extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var until: js.UndefOr[java.lang.String] = js.undefined
}

object SharedSearchOptions {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    until: java.lang.String = null
  ): SharedSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[SharedSearchOptions]
  }
}

