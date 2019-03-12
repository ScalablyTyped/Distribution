package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Selectable //////////////////////////////////////////////////
trait SelectableOptions extends SelectableEvents {
  var autoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var tolerance: js.UndefOr[java.lang.String] = js.undefined
}

object SelectableOptions {
  @scala.inline
  def apply(
    autoRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    filter: java.lang.String = null,
    selected: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selected) => scala.Unit = null,
    selecting: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selecting) => scala.Unit = null,
    start: (/* event */ stdLib.Event, /* ui */ js.Any) => scala.Unit = null,
    stop: (/* event */ stdLib.Event, /* ui */ js.Any) => scala.Unit = null,
    tolerance: java.lang.String = null,
    unselected: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselected) => scala.Unit = null,
    unselecting: (/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselecting) => scala.Unit = null
  ): SelectableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (selected != null) __obj.updateDynamic("selected")(js.Any.fromFunction2(selected))
    if (selecting != null) __obj.updateDynamic("selecting")(js.Any.fromFunction2(selecting))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    if (unselected != null) __obj.updateDynamic("unselected")(js.Any.fromFunction2(unselected))
    if (unselecting != null) __obj.updateDynamic("unselecting")(js.Any.fromFunction2(unselecting))
    __obj.asInstanceOf[SelectableOptions]
  }
}

