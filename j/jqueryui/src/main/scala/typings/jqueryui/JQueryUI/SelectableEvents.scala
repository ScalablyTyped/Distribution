package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.anon.Selected
import typings.jqueryui.anon.Selecting
import typings.jqueryui.anon.Unselected
import typings.jqueryui.anon.Unselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selected, Unit]] = js.undefined
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selecting, Unit]] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.undefined
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselected, Unit]] = js.undefined
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselecting, Unit]] = js.undefined
}

object SelectableEvents {
  @scala.inline
  def apply(
    selected: (/* event */ JQueryEventObject, /* ui */ Selected) => Unit = null,
    selecting: (/* event */ JQueryEventObject, /* ui */ Selecting) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    unselected: (/* event */ JQueryEventObject, /* ui */ Unselected) => Unit = null,
    unselecting: (/* event */ JQueryEventObject, /* ui */ Unselecting) => Unit = null
  ): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(js.Any.fromFunction2(selected))
    if (selecting != null) __obj.updateDynamic("selecting")(js.Any.fromFunction2(selecting))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (unselected != null) __obj.updateDynamic("unselected")(js.Any.fromFunction2(unselected))
    if (unselecting != null) __obj.updateDynamic("unselecting")(js.Any.fromFunction2(unselecting))
    __obj.asInstanceOf[SelectableEvents]
  }
}

