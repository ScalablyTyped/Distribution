package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableEvents extends js.Object {
  var create: js.UndefOr[DraggableEvent] = js.undefined
  var drag: js.UndefOr[DraggableEvent] = js.undefined
  var start: js.UndefOr[DraggableEvent] = js.undefined
  var stop: js.UndefOr[DraggableEvent] = js.undefined
}

object DraggableEvents {
  @scala.inline
  def apply(
    create: DraggableEvent = null,
    drag: DraggableEvent = null,
    start: DraggableEvent = null,
    stop: DraggableEvent = null
  ): DraggableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[DraggableEvents]
  }
}

