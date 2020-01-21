package typings.masonryLayout.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masonry extends js.Object {
  var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  // add and remove items
  var appended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var data: js.UndefOr[js.Function1[/* element */ Element, this.type]] = js.undefined
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getItemElements: js.UndefOr[js.Function0[js.Array[_]]] = js.undefined
  // layout
  var layout: js.UndefOr[js.Function0[Unit]] = js.undefined
  var layoutItems: js.UndefOr[js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean], Unit]] = js.undefined
  var masonry: js.UndefOr[
    js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit])
  ] = js.undefined
  var off: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  // events
  var on: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  var once: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  // utilities
  var reloadItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
}

object Masonry {
  @scala.inline
  def apply(
    addItems: /* elements */ js.Array[_] => Unit = null,
    appended: /* elements */ js.Array[_] => Unit = null,
    data: /* element */ Element => Masonry = null,
    destroy: () => Unit = null,
    getItemElements: () => js.Array[_] = null,
    layout: () => Unit = null,
    layoutItems: (/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean]) => Unit = null,
    masonry: js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]) = null,
    off: (/* eventName */ String, /* listener */ js.Any) => Unit = null,
    on: (/* eventName */ String, /* listener */ js.Any) => Unit = null,
    once: (/* eventName */ String, /* listener */ js.Any) => Unit = null,
    prepended: /* elements */ js.Array[_] => Unit = null,
    reloadItems: () => Unit = null,
    remove: /* elements */ js.Array[_] => Unit = null,
    stamp: /* elements */ js.Array[_] => Unit = null,
    unstamp: /* elements */ js.Array[_] => Unit = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (addItems != null) __obj.updateDynamic("addItems")(js.Any.fromFunction1(addItems))
    if (appended != null) __obj.updateDynamic("appended")(js.Any.fromFunction1(appended))
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1(data))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (getItemElements != null) __obj.updateDynamic("getItemElements")(js.Any.fromFunction0(getItemElements))
    if (layout != null) __obj.updateDynamic("layout")(js.Any.fromFunction0(layout))
    if (layoutItems != null) __obj.updateDynamic("layoutItems")(js.Any.fromFunction2(layoutItems))
    if (masonry != null) __obj.updateDynamic("masonry")(masonry.asInstanceOf[js.Any])
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

