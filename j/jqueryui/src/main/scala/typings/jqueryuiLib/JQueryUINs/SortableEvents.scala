package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableEvents extends js.Object {
  var activate: js.UndefOr[SortableEvent] = js.undefined
  var beforeStop: js.UndefOr[SortableEvent] = js.undefined
  var change: js.UndefOr[SortableEvent] = js.undefined
  var deactivate: js.UndefOr[SortableEvent] = js.undefined
  var out: js.UndefOr[SortableEvent] = js.undefined
  var over: js.UndefOr[SortableEvent] = js.undefined
  var receive: js.UndefOr[SortableEvent] = js.undefined
  var remove: js.UndefOr[SortableEvent] = js.undefined
  var sort: js.UndefOr[SortableEvent] = js.undefined
  var start: js.UndefOr[SortableEvent] = js.undefined
  var stop: js.UndefOr[SortableEvent] = js.undefined
  var update: js.UndefOr[SortableEvent] = js.undefined
}

object SortableEvents {
  @scala.inline
  def apply(
    activate: SortableEvent = null,
    beforeStop: SortableEvent = null,
    change: SortableEvent = null,
    deactivate: SortableEvent = null,
    out: SortableEvent = null,
    over: SortableEvent = null,
    receive: SortableEvent = null,
    remove: SortableEvent = null,
    sort: SortableEvent = null,
    start: SortableEvent = null,
    stop: SortableEvent = null,
    update: SortableEvent = null
  ): SortableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(beforeStop)
    if (change != null) __obj.updateDynamic("change")(change)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (receive != null) __obj.updateDynamic("receive")(receive)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[SortableEvents]
  }
}

