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
    onFilter: js.Function1[/* filterText */ java.lang.String, scala.Unit] = null,
    onGetPage: js.Function1[/* pageNumber */ scala.Double, scala.Unit] = null,
    onNext: js.Function0[scala.Unit] = null,
    onPrevious: js.Function0[scala.Unit] = null,
    onSort: js.Function1[/* sortProperties */ js.Any, scala.Unit] = null,
    setFilter: js.Function1[/* filter */ GriddleFilter, scala.Unit] = null,
    setSortProperties: js.Function1[
      /* sortProperties */ griddleDashReactLib.griddleDashReactMod.utilsNs.SortProperties, 
      js.Function0[scala.Unit]
    ] = null
  ): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    if (onFilter != null) __obj.updateDynamic("onFilter")(onFilter)
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(onGetPage)
    if (onNext != null) __obj.updateDynamic("onNext")(onNext)
    if (onPrevious != null) __obj.updateDynamic("onPrevious")(onPrevious)
    if (onSort != null) __obj.updateDynamic("onSort")(onSort)
    if (setFilter != null) __obj.updateDynamic("setFilter")(setFilter)
    if (setSortProperties != null) __obj.updateDynamic("setSortProperties")(setSortProperties)
    __obj.asInstanceOf[GriddleEvents]
  }
}

