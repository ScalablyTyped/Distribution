package typings.jqueryui.JQueryUI

import typings.jquery.JQuery.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableEvents extends js.Object {
  var create: js.UndefOr[ResizableEvent] = js.undefined
  var resize: js.UndefOr[ResizableEvent] = js.undefined
  var start: js.UndefOr[ResizableEvent] = js.undefined
  var stop: js.UndefOr[ResizableEvent] = js.undefined
}

object ResizableEvents {
  @scala.inline
  def apply(
    create: (/* event */ Event, /* ui */ ResizableUIParams) => Unit = null,
    resize: (/* event */ Event, /* ui */ ResizableUIParams) => Unit = null,
    start: (/* event */ Event, /* ui */ ResizableUIParams) => Unit = null,
    stop: (/* event */ Event, /* ui */ ResizableUIParams) => Unit = null
  ): ResizableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2(resize))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[ResizableEvents]
  }
}

