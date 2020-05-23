package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.anon.Selected
import typings.jqueryui.anon.Selecting
import typings.jqueryui.anon.Unselected
import typings.jqueryui.anon.Unselecting
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
    delay: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    filter: String = null,
    selected: (/* event */ JQueryEventObject, /* ui */ Selected) => Unit = null,
    selecting: (/* event */ JQueryEventObject, /* ui */ Selecting) => Unit = null,
    start: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    stop: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit = null,
    tolerance: String = null,
    unselected: (/* event */ JQueryEventObject, /* ui */ Unselected) => Unit = null,
    unselecting: (/* event */ JQueryEventObject, /* ui */ Unselecting) => Unit = null
  ): SelectableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.get.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(js.Any.fromFunction2(selected))
    if (selecting != null) __obj.updateDynamic("selecting")(js.Any.fromFunction2(selecting))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (unselected != null) __obj.updateDynamic("unselected")(js.Any.fromFunction2(unselected))
    if (unselecting != null) __obj.updateDynamic("unselecting")(js.Any.fromFunction2(unselecting))
    __obj.asInstanceOf[SelectableOptions]
  }
}

