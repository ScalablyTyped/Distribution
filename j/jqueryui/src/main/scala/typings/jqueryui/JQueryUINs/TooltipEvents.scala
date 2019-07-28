package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipEvents extends js.Object {
  var close: js.UndefOr[TooltipEvent] = js.undefined
  var open: js.UndefOr[TooltipEvent] = js.undefined
}

object TooltipEvents {
  @scala.inline
  def apply(close: TooltipEvent = null, open: TooltipEvent = null): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[TooltipEvents]
  }
}

