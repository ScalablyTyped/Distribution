package typings.griddleReact.mod

import typings.griddleReact.mod.utils.SortProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleEvents extends GriddleActions {
  var onFilter: js.UndefOr[js.Function1[/* filterText */ String, Unit]] = js.native
  var setSortProperties: js.UndefOr[js.Function1[/* sortProperties */ SortProperties, js.Function0[Unit]]] = js.native
}

object GriddleEvents {
  @scala.inline
  def apply(): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleEvents]
  }
  @scala.inline
  implicit class GriddleEventsOps[Self <: GriddleEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnFilter(value: /* filterText */ String => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setSetSortProperties(value: /* sortProperties */ SortProperties => js.Function0[Unit]): Self = this.set("setSortProperties", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSortProperties: Self = this.set("setSortProperties", js.undefined)
  }
  
}

