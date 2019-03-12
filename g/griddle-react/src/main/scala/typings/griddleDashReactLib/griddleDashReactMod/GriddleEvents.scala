package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleEvents extends GriddleActions {
  var onFilter: js.UndefOr[js.Function1[/* filterText */ java.lang.String, scala.Unit]] = js.undefined
  var setSortProperties: js.UndefOr[
    js.Function1[
      /* sortProperties */ griddleDashReactLib.griddleDashReactMod.utilsNs.SortProperties, 
      js.Function0[scala.Unit]
    ]
  ] = js.undefined
}

object GriddleEvents {
  @scala.inline
  def apply(
    onFilter: /* filterText */ java.lang.String => scala.Unit = null,
    onGetPage: /* pageNumber */ scala.Double => scala.Unit = null,
    onNext: () => scala.Unit = null,
    onPrevious: () => scala.Unit = null,
    onSort: /* sortProperties */ js.Any => scala.Unit = null,
    setFilter: /* filter */ GriddleFilter => scala.Unit = null,
    setSortProperties: /* sortProperties */ griddleDashReactLib.griddleDashReactMod.utilsNs.SortProperties => js.Function0[scala.Unit] = null
  ): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(js.Any.fromFunction1(onGetPage))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(js.Any.fromFunction0(onPrevious))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1(setFilter))
    if (setSortProperties != null) __obj.updateDynamic("setSortProperties")(js.Any.fromFunction1(setSortProperties))
    __obj.asInstanceOf[GriddleEvents]
  }
}

