package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryPositionOptions extends js.Object {
  var at: js.UndefOr[java.lang.String] = js.undefined
  var collision: js.UndefOr[java.lang.String] = js.undefined
  var my: js.UndefOr[java.lang.String] = js.undefined
  var of: js.UndefOr[js.Any] = js.undefined
  var using: js.UndefOr[js.Function] = js.undefined
  var within: js.UndefOr[js.Any] = js.undefined
}

object JQueryPositionOptions {
  @scala.inline
  def apply(
    at: java.lang.String = null,
    collision: java.lang.String = null,
    my: java.lang.String = null,
    of: js.Any = null,
    using: js.Function = null,
    within: js.Any = null
  ): JQueryPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at)
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (my != null) __obj.updateDynamic("my")(my)
    if (of != null) __obj.updateDynamic("of")(of)
    if (using != null) __obj.updateDynamic("using")(using)
    if (within != null) __obj.updateDynamic("within")(within)
    __obj.asInstanceOf[JQueryPositionOptions]
  }
}

