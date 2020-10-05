package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionUIParams extends js.Object {
  var newHeader: JQuery = js.native
  var newPanel: JQuery = js.native
  var oldHeader: JQuery = js.native
  var oldPanel: JQuery = js.native
}

object AccordionUIParams {
  @scala.inline
  def apply(newHeader: JQuery, newPanel: JQuery, oldHeader: JQuery, oldPanel: JQuery): AccordionUIParams = {
    val __obj = js.Dynamic.literal(newHeader = newHeader.asInstanceOf[js.Any], newPanel = newPanel.asInstanceOf[js.Any], oldHeader = oldHeader.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionUIParams]
  }
  @scala.inline
  implicit class AccordionUIParamsOps[Self <: AccordionUIParams] (val x: Self) extends AnyVal {
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
    def setNewHeader(value: JQuery): Self = this.set("newHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPanel(value: JQuery): Self = this.set("newPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldHeader(value: JQuery): Self = this.set("oldHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldPanel(value: JQuery): Self = this.set("oldPanel", value.asInstanceOf[js.Any])
  }
  
}

