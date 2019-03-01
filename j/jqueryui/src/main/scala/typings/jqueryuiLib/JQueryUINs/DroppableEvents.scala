package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableEvents extends js.Object {
  var activate: js.UndefOr[DroppableEvent] = js.undefined
  var create: js.UndefOr[DroppableEvent] = js.undefined
  var deactivate: js.UndefOr[DroppableEvent] = js.undefined
  var drop: js.UndefOr[DroppableEvent] = js.undefined
  var out: js.UndefOr[DroppableEvent] = js.undefined
  var over: js.UndefOr[DroppableEvent] = js.undefined
}

object DroppableEvents {
  @scala.inline
  def apply(
    activate: DroppableEvent = null,
    create: DroppableEvent = null,
    deactivate: DroppableEvent = null,
    drop: DroppableEvent = null,
    out: DroppableEvent = null,
    over: DroppableEvent = null
  ): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (create != null) __obj.updateDynamic("create")(create)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    __obj.asInstanceOf[DroppableEvents]
  }
}

