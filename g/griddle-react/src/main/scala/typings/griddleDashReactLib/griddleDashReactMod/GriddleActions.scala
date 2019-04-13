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
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.UndefOr[reduxLib.reduxMod.ActionCreator[js.Any]]] = null,
    onGetPage: /* pageNumber */ scala.Double => scala.Unit = null,
    onNext: () => scala.Unit = null,
    onPrevious: () => scala.Unit = null,
    onSort: /* sortProperties */ js.Any => scala.Unit = null,
    setFilter: /* filter */ GriddleFilter => scala.Unit = null
  ): GriddleActions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(js.Any.fromFunction1(onGetPage))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(js.Any.fromFunction0(onPrevious))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[GriddleActions]
  }
}

