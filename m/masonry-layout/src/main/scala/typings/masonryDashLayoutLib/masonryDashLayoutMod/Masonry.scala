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
    addItems: /* elements */ js.Array[_] => scala.Unit = null,
    appended: /* elements */ js.Array[_] => scala.Unit = null,
    data: /* element */ stdLib.Element => Masonry = null,
    destroy: () => scala.Unit = null,
    getItemElements: () => js.Array[_] = null,
    layout: () => scala.Unit = null,
    layoutItems: (/* items */ js.Array[_], /* isStill */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    masonry: js.Function0[scala.Unit] with (js.Function2[/* eventName */ java.lang.String, /* listener */ js.Any, scala.Unit]) = null,
    off: (/* eventName */ java.lang.String, /* listener */ js.Any) => scala.Unit = null,
    on: (/* eventName */ java.lang.String, /* listener */ js.Any) => scala.Unit = null,
    once: (/* eventName */ java.lang.String, /* listener */ js.Any) => scala.Unit = null,
    prepended: /* elements */ js.Array[_] => scala.Unit = null,
    reloadItems: () => scala.Unit = null,
    remove: /* elements */ js.Array[_] => scala.Unit = null,
    stamp: /* elements */ js.Array[_] => scala.Unit = null,
    unstamp: /* elements */ js.Array[_] => scala.Unit = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (addItems != null) __obj.updateDynamic("addItems")(js.Any.fromFunction1(addItems))
    if (appended != null) __obj.updateDynamic("appended")(js.Any.fromFunction1(appended))
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1(data))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (getItemElements != null) __obj.updateDynamic("getItemElements")(js.Any.fromFunction0(getItemElements))
    if (layout != null) __obj.updateDynamic("layout")(js.Any.fromFunction0(layout))
    if (layoutItems != null) __obj.updateDynamic("layoutItems")(js.Any.fromFunction2(layoutItems))
    if (masonry != null) __obj.updateDynamic("masonry")(masonry)
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction2(off))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2(on))
    if (once != null) __obj.updateDynamic("once")(js.Any.fromFunction2(once))
    if (prepended != null) __obj.updateDynamic("prepended")(js.Any.fromFunction1(prepended))
    if (reloadItems != null) __obj.updateDynamic("reloadItems")(js.Any.fromFunction0(reloadItems))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (stamp != null) __obj.updateDynamic("stamp")(js.Any.fromFunction1(stamp))
    if (unstamp != null) __obj.updateDynamic("unstamp")(js.Any.fromFunction1(unstamp))
    __obj.asInstanceOf[Masonry]
  }
}

