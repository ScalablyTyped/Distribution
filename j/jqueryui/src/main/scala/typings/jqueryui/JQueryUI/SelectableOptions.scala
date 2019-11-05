package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.Anon_Selected
import typings.jqueryui.Anon_Selecting
import typings.jqueryui.Anon_Unselected
import typings.jqueryui.Anon_Unselecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Selectable //////////////////////////////////////////////////
trait SelectableOptions extends SelectableEvents {
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
}

object SelectableOptions {
  @scala.inline
  def apply(
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    cancel: String = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    filter: String = null,
    selected: (/* event */ JQueryEventObject, /* ui */ Anon_Selected) => Unit = null,
    selecting: (/* event */ JQueryEventObject, /* ui */ Anon_Selecting) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    tolerance: String = null,
    unselected: (/* event */ JQueryEventObject, /* ui */ Anon_Unselected) => Unit = null,
    unselecting: (/* event */ JQueryEventObject, /* ui */ Anon_Unselecting) => Unit = null
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

