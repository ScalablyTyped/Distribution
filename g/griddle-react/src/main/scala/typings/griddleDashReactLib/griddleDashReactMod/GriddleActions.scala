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

object GriddleActions {
  @scala.inline
  def apply(
    onGetPage: js.Function1[/* pageNumber */ scala.Double, scala.Unit] = null,
    onNext: js.Function0[scala.Unit] = null,
    onPrevious: js.Function0[scala.Unit] = null,
    onSort: js.Function1[/* sortProperties */ js.Any, scala.Unit] = null,
    setFilter: js.Function1[/* filter */ GriddleFilter, scala.Unit] = null
  ): GriddleActions = {
    val __obj = js.Dynamic.literal()
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(onGetPage)
    if (onNext != null) __obj.updateDynamic("onNext")(onNext)
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(onPrevious)
    if (onSort != null) __obj.updateDynamic("onSort")(onSort)
    if (setFilter != null) __obj.updateDynamic("setFilter")(setFilter)
    __obj.asInstanceOf[GriddleActions]
  }
}

