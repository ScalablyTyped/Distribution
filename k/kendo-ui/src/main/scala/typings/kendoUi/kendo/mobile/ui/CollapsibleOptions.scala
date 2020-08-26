package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleOptions extends js.Object {
  var animation: js.UndefOr[Boolean] = js.native
  var collapse: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var expand: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, Unit]] = js.native
  var expandIcon: js.UndefOr[String] = js.native
  var iconPosition: js.UndefOr[String] = js.native
  var inset: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object CollapsibleOptions {
  @scala.inline
  def apply(): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleOptions]
  }
  @scala.inline
  implicit class CollapsibleOptionsOps[Self <: CollapsibleOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setCollapse(value: /* e */ CollapsibleEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setExpand(value: /* e */ CollapsibleEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setExpandIcon(value: String): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setIconPosition(value: String): Self = this.set("iconPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPosition: Self = this.set("iconPosition", js.undefined)
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

