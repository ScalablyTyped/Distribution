package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ ToolBarClickEvent, Unit]] = js.native
  var close: js.UndefOr[js.Function1[/* e */ ToolBarCloseEvent, Unit]] = js.native
  var items: js.UndefOr[js.Array[ToolBarItem]] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ ToolBarOpenEvent, Unit]] = js.native
  var overflowClose: js.UndefOr[js.Function1[/* e */ ToolBarOverflowCloseEvent, Unit]] = js.native
  var overflowOpen: js.UndefOr[js.Function1[/* e */ ToolBarOverflowOpenEvent, Unit]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var toggle: js.UndefOr[js.Function1[/* e */ ToolBarToggleEvent, Unit]] = js.native
}

object ToolBarOptions {
  @scala.inline
  def apply(): ToolBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarOptions]
  }
  @scala.inline
  implicit class ToolBarOptionsOps[Self <: ToolBarOptions] (val x: Self) extends AnyVal {
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
    def setClick(value: /* e */ ToolBarClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setClose(value: /* e */ ToolBarCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setItemsVarargs(value: ToolBarItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ToolBarItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ ToolBarOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOverflowClose(value: /* e */ ToolBarOverflowCloseEvent => Unit): Self = this.set("overflowClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowClose: Self = this.set("overflowClose", js.undefined)
    @scala.inline
    def setOverflowOpen(value: /* e */ ToolBarOverflowOpenEvent => Unit): Self = this.set("overflowOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverflowOpen: Self = this.set("overflowOpen", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setToggle(value: /* e */ ToolBarToggleEvent => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

