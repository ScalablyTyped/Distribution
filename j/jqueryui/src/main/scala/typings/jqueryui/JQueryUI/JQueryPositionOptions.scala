package typings.jqueryui.JQueryUI

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
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    if (within != null) __obj.updateDynamic("within")(within.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryPositionOptions]
  }
}

