package typings.griddleReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleActions
  extends PropertyBag[js.UndefOr[ActionCreator[js.Any]]] {
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, Unit]] = js.undefined
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
}

object GriddleActions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.UndefOr[ActionCreator[js.Any]]] = null,
    onGetPage: /* pageNumber */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrevious: () => Unit = null,
    onSort: /* sortProperties */ js.Any => Unit = null,
    setFilter: /* filter */ GriddleFilter => Unit = null
  ): GriddleActions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(js.Any.fromFunction1(onGetPage))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(js.Any.fromFunction0(onPrevious))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[GriddleActions]
  }
}

