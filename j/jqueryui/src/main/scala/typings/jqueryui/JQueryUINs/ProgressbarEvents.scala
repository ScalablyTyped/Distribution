package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressbarEvents extends js.Object {
  var change: js.UndefOr[ProgressbarEvent] = js.undefined
  var complete: js.UndefOr[ProgressbarEvent] = js.undefined
  var create: js.UndefOr[ProgressbarEvent] = js.undefined
}

object ProgressbarEvents {
  @scala.inline
  def apply(
    change: ProgressbarEvent = null,
    complete: ProgressbarEvent = null,
    create: ProgressbarEvent = null
  ): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (create != null) __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[ProgressbarEvents]
  }
}

