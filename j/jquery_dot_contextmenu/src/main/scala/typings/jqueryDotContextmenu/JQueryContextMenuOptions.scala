package typings.jqueryDotContextmenu

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[Anon_Duration] = js.undefined
  var appendTo: js.UndefOr[String] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ Event, _]] = js.undefined
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  var events: js.UndefOr[Anon_Hide] = js.undefined
  var itemClickEvent: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[js.Function3[/* opt */ JQuery, /* x */ Double, /* y */ Double, Unit]] = js.undefined
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, Unit]] = js.undefined
  var reposition: js.UndefOr[Boolean] = js.undefined
  var selector: String
  var trigger: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object JQueryContextMenuOptions {
  @scala.inline
  def apply(
    selector: String,
    animation: Anon_Duration = null,
    appendTo: String = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    build: (/* triggerElement */ JQuery, /* e */ Event) => _ = null,
    callback: (/* key */ js.Any, /* options */ js.Any) => _ = null,
    className: String = null,
    delay: Int | Double = null,
    determinePosition: /* menu */ JQuery => Unit = null,
    events: Anon_Hide = null,
    itemClickEvent: String = null,
    items: js.Any = null,
    position: (/* opt */ JQuery, /* x */ Double, /* y */ Double) => Unit = null,
    positionSubmenu: /* menu */ JQuery => Unit = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    trigger: String = null,
    zIndex: Int | Double = null
  ): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2(build))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (determinePosition != null) __obj.updateDynamic("determinePosition")(js.Any.fromFunction1(determinePosition))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (itemClickEvent != null) __obj.updateDynamic("itemClickEvent")(itemClickEvent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction3(position))
    if (positionSubmenu != null) __obj.updateDynamic("positionSubmenu")(js.Any.fromFunction1(positionSubmenu))
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
}

