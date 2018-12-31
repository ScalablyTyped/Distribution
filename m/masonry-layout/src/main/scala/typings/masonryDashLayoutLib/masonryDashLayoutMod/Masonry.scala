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

