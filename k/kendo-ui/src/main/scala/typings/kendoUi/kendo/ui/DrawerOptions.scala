package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerOptions extends js.Object {
  var hide: js.UndefOr[js.Function1[/* e */ DrawerHideEvent, Unit]] = js.native
  var itemClick: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var mini: js.UndefOr[Boolean | DrawerMini] = js.native
  var mode: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var show: js.UndefOr[js.Function1[/* e */ DrawerEvent, Unit]] = js.native
  var swipeToOpen: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
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
    def setHide(value: /* e */ DrawerHideEvent => Unit): Self = this.set("hide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setItemClick(value: /* e */ DrawerEvent => Unit): Self = this.set("itemClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemClick: Self = this.set("itemClick", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMini(value: Boolean | DrawerMini): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShow(value: /* e */ DrawerEvent => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSwipeToOpen(value: Boolean): Self = this.set("swipeToOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToOpen: Self = this.set("swipeToOpen", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

