package typings.jqueryui.JQueryUINs

import typings.jquery.JQueryEventObject
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
    activate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    beforeStop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    change: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    out: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    over: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    receive: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    remove: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    sort: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null,
    update: (/* event */ JQueryEventObject, /* ui */ SortableUIParams) => Unit = null
  ): SortableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (beforeStop != null) __obj.updateDynamic("beforeStop")(js.Any.fromFunction2(beforeStop))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2(out))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2(over))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction2(receive))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[SortableEvents]
  }
}

