package typings
package jqueryuiLib.JQueryUINs

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
    create: ResizableEvent = null,
    resize: ResizableEvent = null,
    start: ResizableEvent = null,
    stop: ResizableEvent = null
  ): ResizableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[ResizableEvents]
  }
}

