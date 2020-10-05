package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Accordion //////////////////////////////////////////////////
@js.native
trait AccordionOptions extends AccordionEvents {
  var active: js.UndefOr[js.Any] = js.native
   // boolean or number
  var animate: js.UndefOr[js.Any] = js.native
   // boolean, number, string or object
  var collapsible: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var heightStyle: js.UndefOr[String] = js.native
  var icons: js.UndefOr[js.Any] = js.native
}

object AccordionOptions {
  @scala.inline
  def apply(): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionOptions]
  }
  @scala.inline
  implicit class AccordionOptionsOps[Self <: AccordionOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeightStyle(value: String): Self = this.set("heightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightStyle: Self = this.set("heightStyle", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
  }
  
}

