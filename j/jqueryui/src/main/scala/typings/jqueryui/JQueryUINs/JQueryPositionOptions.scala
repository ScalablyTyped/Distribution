package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryPositionOptions extends js.Object {
  var at: js.UndefOr[String] = js.undefined
  var collision: js.UndefOr[String] = js.undefined
  var my: js.UndefOr[String] = js.undefined
  var of: js.UndefOr[js.Any] = js.undefined
  var using: js.UndefOr[js.Function] = js.undefined
  var within: js.UndefOr[js.Any] = js.undefined
}

object JQueryPositionOptions {
  @scala.inline
  def apply(
    at: String = null,
    collision: String = null,
    my: String = null,
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

