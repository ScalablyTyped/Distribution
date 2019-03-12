package typings
package jqueryDotContextmenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[Anon_Duration] = js.undefined
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ stdLib.Event, _]] = js.undefined
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, scala.Unit]] = js.undefined
  var events: js.UndefOr[Anon_Hide] = js.undefined
  var itemClickEvent: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[
    js.Function3[/* opt */ JQuery, /* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  ] = js.undefined
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, scala.Unit]] = js.undefined
  var reposition: js.UndefOr[scala.Boolean] = js.undefined
  var selector: java.lang.String
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object JQueryContextMenuOptions {
  @scala.inline
  def apply(
    selector: java.lang.String,
    animation: Anon_Duration = null,
    appendTo: java.lang.String = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    build: (/* triggerElement */ JQuery, /* e */ stdLib.Event) => _ = null,
    callback: (/* key */ js.Any, /* options */ js.Any) => _ = null,
    className: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    determinePosition: /* menu */ JQuery => scala.Unit = null,
    events: Anon_Hide = null,
    itemClickEvent: java.lang.String = null,
    items: js.Any = null,
    position: (/* opt */ JQuery, /* x */ scala.Double, /* y */ scala.Double) => scala.Unit = null,
    positionSubmenu: /* menu */ JQuery => scala.Unit = null,
    reposition: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): JQueryContextMenuOptions = {
    val __obj = js.Dynamic.literal(selector = selector)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2(build))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (className != null) __obj.updateDynamic("className")(className)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (determinePosition != null) __obj.updateDynamic("determinePosition")(js.Any.fromFunction1(determinePosition))
    if (events != null) __obj.updateDynamic("events")(events)
    if (itemClickEvent != null) __obj.updateDynamic("itemClickEvent")(itemClickEvent)
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction3(position))
    if (positionSubmenu != null) __obj.updateDynamic("positionSubmenu")(js.Any.fromFunction1(positionSubmenu))
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryContextMenuOptions]
  }
}

