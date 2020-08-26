package typings.masonryLayout.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Masonry extends js.Object {
  var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  // add and remove items
  var appended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var data: js.UndefOr[js.Function1[/* element */ Element, this.type]] = js.native
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  var getItemElements: js.UndefOr[js.Function0[js.Array[_]]] = js.native
  // layout
  var layout: js.UndefOr[js.Function0[Unit]] = js.native
  var layoutItems: js.UndefOr[js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean], Unit]] = js.native
  var masonry: js.UndefOr[js.Function0[Unit]] with (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]]) = js.native
  var off: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  // events
  var on: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  var once: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.native
  var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  // utilities
  var reloadItems: js.UndefOr[js.Function0[Unit]] = js.native
  var remove: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
  var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.native
}

object Masonry {
  @scala.inline
  def apply(
    masonry: js.UndefOr[js.Function0[Unit]] with (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]])
  ): Masonry = {
    val __obj = js.Dynamic.literal(masonry = masonry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Masonry]
  }
  @scala.inline
  implicit class MasonryOps[Self <: Masonry] (val x: Self) extends AnyVal {
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
    def setMasonry(
      value: js.UndefOr[js.Function0[Unit]] with (js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]])
    ): Self = this.set("masonry", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddItems(value: /* elements */ js.Array[_] => Unit): Self = this.set("addItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddItems: Self = this.set("addItems", js.undefined)
    @scala.inline
    def setAppended(value: /* elements */ js.Array[_] => Unit): Self = this.set("appended", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppended: Self = this.set("appended", js.undefined)
    @scala.inline
    def setData(value: /* element */ Element => Masonry): Self = this.set("data", js.Any.fromFunction1(value))
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetItemElements(value: () => js.Array[_]): Self = this.set("getItemElements", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemElements: Self = this.set("getItemElements", js.undefined)
    @scala.inline
    def setLayout(value: () => Unit): Self = this.set("layout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLayoutItems(value: (/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean]) => Unit): Self = this.set("layoutItems", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLayoutItems: Self = this.set("layoutItems", js.undefined)
    @scala.inline
    def setOff(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    @scala.inline
    def setOn(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnce(value: (/* eventName */ String, /* listener */ js.Any) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setPrepended(value: /* elements */ js.Array[_] => Unit): Self = this.set("prepended", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrepended: Self = this.set("prepended", js.undefined)
    @scala.inline
    def setReloadItems(value: () => Unit): Self = this.set("reloadItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReloadItems: Self = this.set("reloadItems", js.undefined)
    @scala.inline
    def setRemove(value: /* elements */ js.Array[_] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setStamp(value: /* elements */ js.Array[_] => Unit): Self = this.set("stamp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStamp: Self = this.set("stamp", js.undefined)
    @scala.inline
    def setUnstamp(value: /* elements */ js.Array[_] => Unit): Self = this.set("unstamp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnstamp: Self = this.set("unstamp", js.undefined)
  }
  
}

