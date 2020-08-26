package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabs //////////////////////////////////////////////////
@js.native
trait TabsOptions extends TabsEvents {
  var active: js.UndefOr[js.Any] = js.native
   // boolean or number
  var classes: js.UndefOr[TabClasses] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[js.Any] = js.native
   // boolean or []
  var event: js.UndefOr[String] = js.native
  var heightStyle: js.UndefOr[String] = js.native
  var hide: js.UndefOr[js.Any] = js.native
   // boolean, number, string or object
  var show: js.UndefOr[js.Any] = js.native
}

object TabsOptions {
  @scala.inline
  def apply(): TabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsOptions]
  }
  @scala.inline
  implicit class TabsOptionsOps[Self <: TabsOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: js.Any): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setClasses(value: TabClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setDisabled(value: js.Any): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHeightStyle(value: String): Self = this.set("heightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightStyle: Self = this.set("heightStyle", js.undefined)
    @scala.inline
    def setHide(value: js.Any): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setShow(value: js.Any): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

