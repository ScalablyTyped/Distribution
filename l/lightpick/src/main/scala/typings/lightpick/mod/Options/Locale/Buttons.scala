package typings.lightpick.mod.Options.Locale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var reset: js.UndefOr[String] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(
    apply: String = null,
    close: String = null,
    next: String = null,
    prev: String = null,
    reset: String = null
  ): Buttons = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

