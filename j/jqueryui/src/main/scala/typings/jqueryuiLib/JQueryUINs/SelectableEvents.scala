package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selected, scala.Unit]
  ] = js.undefined
  var selecting: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selecting, scala.Unit]
  ] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit]] = js.undefined
  var unselected: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselected, scala.Unit]
  ] = js.undefined
  var unselecting: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselecting, scala.Unit]
  ] = js.undefined
}

object SelectableEvents {
  @scala.inline
  def apply(
    selected: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selected) => scala.Unit = null,
    selecting: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selecting) => scala.Unit = null,
    start: (/* event */ stdLib.Event, /* ui */ js.Any) => scala.Unit = null,
    stop: (/* event */ stdLib.Event, /* ui */ js.Any) => scala.Unit = null,
    unselected: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselected) => scala.Unit = null,
    unselecting: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselecting) => scala.Unit = null
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

