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
    selected: js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selected, scala.Unit] = null,
    selecting: js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selecting, scala.Unit] = null,
    start: js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit] = null,
    stop: js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit] = null,
    unselected: js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselected, scala.Unit] = null,
    unselecting: js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselecting, scala.Unit] = null
  ): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (selecting != null) __obj.updateDynamic("selecting")(selecting)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (unselected != null) __obj.updateDynamic("unselected")(unselected)
    if (unselecting != null) __obj.updateDynamic("unselecting")(unselecting)
    __obj.asInstanceOf[SelectableEvents]
  }
}

