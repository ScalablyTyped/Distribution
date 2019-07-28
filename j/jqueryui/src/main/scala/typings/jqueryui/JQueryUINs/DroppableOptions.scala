package typings.jqueryui.JQueryUINs

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
    activate: DroppableEvent = null,
    activeClass: String = null,
    addClasses: js.UndefOr[Boolean] = js.undefined,
    create: DroppableEvent = null,
    deactivate: DroppableEvent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    drop: DroppableEvent = null,
    greedy: js.UndefOr[Boolean] = js.undefined,
    hoverClass: String = null,
    out: DroppableEvent = null,
    over: DroppableEvent = null,
    scope: String = null,
    tolerance: String = null
  ): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(addClasses)) __obj.updateDynamic("addClasses")(addClasses)
    if (create != null) __obj.updateDynamic("create")(create)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy)
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass)
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    __obj.asInstanceOf[DroppableOptions]
  }
}

