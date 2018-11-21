package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GriddleActions
  extends PropertyBag[js.UndefOr[reduxLib.reduxMod.ActionCreator[js.Any]]] {
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ scala.Double, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPrevious: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, scala.Unit]] = js.undefined
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, scala.Unit]] = js.undefined
}

