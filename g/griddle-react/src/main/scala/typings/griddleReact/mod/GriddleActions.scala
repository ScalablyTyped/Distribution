package typings.griddleReact.mod

import typings.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GriddleActions
  extends PropertyBag[js.UndefOr[ActionCreator[js.Any]]] {
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.native
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.native
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, Unit]] = js.native
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.native
}

object GriddleActions {
  @scala.inline
  def apply(): GriddleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleActions]
  }
  @scala.inline
  implicit class GriddleActionsOps[Self <: GriddleActions] (val x: Self) extends AnyVal {
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
    def setOnGetPage(value: /* pageNumber */ Double => Unit): Self = this.set("onGetPage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetPage: Self = this.set("onGetPage", js.undefined)
    @scala.inline
    def setOnNext(value: () => Unit): Self = this.set("onNext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    @scala.inline
    def setOnPrevious(value: () => Unit): Self = this.set("onPrevious", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPrevious: Self = this.set("onPrevious", js.undefined)
    @scala.inline
    def setOnSort(value: /* sortProperties */ js.Any => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setSetFilter(value: /* filter */ GriddleFilter => Unit): Self = this.set("setFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilter: Self = this.set("setFilter", js.undefined)
  }
  
}

