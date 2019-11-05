package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipEvents extends js.Object {
  var close: js.UndefOr[TooltipEvent] = js.undefined
  var open: js.UndefOr[TooltipEvent] = js.undefined
}

object TooltipEvents {
  @scala.inline
  def apply(
    close: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit = null,
    open: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit = null
  ): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2(close))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2(open))
    __obj.asInstanceOf[TooltipEvents]
  }
}

