package typings
package masonryDashLayoutLib.masonryDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masonry extends js.Object {
  var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
  // add and remove items
  var appended: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Function1[/* element */ stdLib.Element, this.type]] = js.undefined
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getItemElements: js.UndefOr[js.Function0[js.Array[_]]] = js.undefined
  // layout
  var layout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var layoutItems: js.UndefOr[
    js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  var masonry: js.UndefOr[
    js.Function0[scala.Unit] with (js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit])
  ] = js.undefined
  var off: js.UndefOr[
    js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit]
  ] = js.undefined
  // events
  var on: js.UndefOr[
    js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit]
  ] = js.undefined
  var once: js.UndefOr[
    js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit]
  ] = js.undefined
  var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
  // utilities
  var reloadItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
  var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
  var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], scala.Unit]] = js.undefined
}

object Masonry {
  @scala.inline
  def apply(
    addItems: js.Function1[/* elements */ js.Array[_], scala.Unit] = null,
    appended: js.Function1[/* elements */ js.Array[_], scala.Unit] = null,
    data: js.Function1[/* element */ stdLib.Element, Masonry] = null,
    destroy: js.Function0[scala.Unit] = null,
    getItemElements: js.Function0[js.Array[_]] = null,
    layout: js.Function0[scala.Unit] = null,
    layoutItems: js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    masonry: js.Function0[scala.Unit] with (js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit]) = null,
    off: js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit] = null,
    on: js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit] = null,
    once: js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit] = null,
    prepended: js.Function1[/* elements */ js.Array[_], scala.Unit] = null,
    reloadItems: js.Function0[scala.Unit] = null,
    remove: js.Function1[/* elements */ js.Array[_], scala.Unit] = null,
    stamp: js.Function1[/* elements */ js.Array[_], scala.Unit] = null,
    unstamp: js.Function1[/* elements */ js.Array[_], scala.Unit] = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (addItems != null) __obj.updateDynamic("addItems")(addItems)
    if (appended != null) __obj.updateDynamic("appended")(appended)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getItemElements != null) __obj.updateDynamic("getItemElements")(getItemElements)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (layoutItems != null) __obj.updateDynamic("layoutItems")(layoutItems)
    if (masonry != null) __obj.updateDynamic("masonry")(masonry)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (once != null) __obj.updateDynamic("once")(once)
    if (prepended != null) __obj.updateDynamic("prepended")(prepended)
    if (reloadItems != null) __obj.updateDynamic("reloadItems")(reloadItems)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (stamp != null) __obj.updateDynamic("stamp")(stamp)
    if (unstamp != null) __obj.updateDynamic("unstamp")(unstamp)
    __obj.asInstanceOf[Masonry]
  }
}

