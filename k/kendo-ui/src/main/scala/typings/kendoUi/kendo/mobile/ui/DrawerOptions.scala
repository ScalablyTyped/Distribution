package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerOptions extends js.Object {
  var afterHide: js.UndefOr[js.Function1[/* e */ DrawerAfterHideEvent, Unit]] = js.native
  var beforeShow: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.native
  var container: js.UndefOr[JQuery] = js.native
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.native
  var init: js.UndefOr[js.Function1[/* e */ DrawerInitEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var show: js.UndefOr[js.Function1[/* e */ DrawerShowEvent, Unit]] = js.native
  var swipeToOpen: js.UndefOr[Boolean] = js.native
  var swipeToOpenViews: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String] = js.native
  var views: js.UndefOr[js.Any] = js.native
}

object DrawerOptions {
  @scala.inline
  def apply(): DrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerOptions]
  }
  @scala.inline
  implicit class DrawerOptionsOps[Self <: DrawerOptions] (val x: Self) extends AnyVal {
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
    def setAfterHide(value: /* e */ DrawerAfterHideEvent => Unit): Self = this.set("afterHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterHide: Self = this.set("afterHide", js.undefined)
    @scala.inline
    def setBeforeShow(value: /* e */ DrawerEvent => Unit): Self = this.set("beforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setHide(value: /* e */ DrawerHideEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInit(value: /* e */ DrawerInitEvent => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShow(value: /* e */ DrawerShowEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSwipeToOpen(value: Boolean): Self = this.set("swipeToOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToOpen: Self = this.set("swipeToOpen", js.undefined)
    @scala.inline
    def setSwipeToOpenViews(value: js.Any): Self = this.set("swipeToOpenViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToOpenViews: Self = this.set("swipeToOpenViews", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setViews(value: js.Any): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

