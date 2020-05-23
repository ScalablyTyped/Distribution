package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableOptions extends DroppableEvents {
  var accept: js.UndefOr[js.Any] = js.undefined
  var activeClass: js.UndefOr[String] = js.undefined
  var addClasses: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
}

object DroppableOptions {
  @scala.inline
  def apply(
    accept: js.Any = null,
    activate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    activeClass: String = null,
    addClasses: js.UndefOr[Boolean] = js.undefined,
    create: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    drop: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    greedy: js.UndefOr[Boolean] = js.undefined,
    hoverClass: String = null,
    out: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    over: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Unit = null,
    scope: String = null,
    tolerance: String = null
  ): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(addClasses)) __obj.updateDynamic("addClasses")(addClasses.get.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2(drop))
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy.get.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2(out))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2(over))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableOptions]
  }
}

