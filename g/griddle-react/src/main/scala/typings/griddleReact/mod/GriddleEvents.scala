package typings.griddleReact.mod

import typings.griddleReact.mod.utils.SortProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleEvents extends GriddleActions {
  var onFilter: js.UndefOr[js.Function1[/* filterText */ String, Unit]] = js.undefined
  var setSortProperties: js.UndefOr[js.Function1[/* sortProperties */ SortProperties, js.Function0[Unit]]] = js.undefined
}

object GriddleEvents {
  @scala.inline
  def apply(
    onFilter: /* filterText */ String => Unit = null,
    onGetPage: /* pageNumber */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrevious: () => Unit = null,
    onSort: /* sortProperties */ js.Any => Unit = null,
    setFilter: /* filter */ GriddleFilter => Unit = null,
    setSortProperties: /* sortProperties */ SortProperties => js.Function0[Unit] = null
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

