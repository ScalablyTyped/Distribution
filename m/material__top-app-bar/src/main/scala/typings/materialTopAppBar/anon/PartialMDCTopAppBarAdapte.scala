package typings.materialTopAppBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/top-app-bar.@material/top-app-bar/adapter.MDCTopAppBarAdapter> */
@js.native
trait PartialMDCTopAppBarAdapte extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var getTopAppBarHeight: js.UndefOr[js.Function0[Double]] = js.native
  var getTotalActionItems: js.UndefOr[js.Function0[Double]] = js.native
  var getViewportScrollY: js.UndefOr[js.Function0[Double]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var notifyNavigationIconClicked: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setStyle: js.UndefOr[js.Function2[/* property */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCTopAppBarAdapte {
  @scala.inline
  def apply(): PartialMDCTopAppBarAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTopAppBarAdapte]
  }
  @scala.inline
  implicit class PartialMDCTopAppBarAdapteOps[Self <: PartialMDCTopAppBarAdapte] (val x: Self) extends AnyVal {
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setGetTopAppBarHeight(value: () => Double): Self = this.set("getTopAppBarHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTopAppBarHeight: Self = this.set("getTopAppBarHeight", js.undefined)
    @scala.inline
    def setGetTotalActionItems(value: () => Double): Self = this.set("getTotalActionItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTotalActionItems: Self = this.set("getTotalActionItems", js.undefined)
    @scala.inline
    def setGetViewportScrollY(value: () => Double): Self = this.set("getViewportScrollY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetViewportScrollY: Self = this.set("getViewportScrollY", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setNotifyNavigationIconClicked(value: () => Unit): Self = this.set("notifyNavigationIconClicked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotifyNavigationIconClicked: Self = this.set("notifyNavigationIconClicked", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetStyle(value: (/* property */ String, /* value */ String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
  }
  
}

