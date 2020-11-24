package typings.kendoUi.kendo.wizard

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardStepOptions extends js.Object {
  
  var actionBar: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[js.Array[_]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentId: js.UndefOr[String] = js.native
  
  var contentUrl: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[js.Any] = js.native
  
  var formTag: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var markupContainer: js.UndefOr[JQuery] = js.native
  
  var messages: js.UndefOr[js.Any] = js.native
  
  var pager: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var totalSteps: Double = js.native
  
  var wizardId: js.UndefOr[String] = js.native
}
object WizardStepOptions {
  
  @scala.inline
  def apply(totalSteps: Double): WizardStepOptions = {
    val __obj = js.Dynamic.literal(totalSteps = totalSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardStepOptions]
  }
  
  @scala.inline
  implicit class WizardStepOptionsOps[Self <: WizardStepOptions] (val x: Self) extends AnyVal {
    
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
    def setTotalSteps(value: Double): Self = this.set("totalSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionBar(value: Boolean): Self = this.set("actionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionBar: Self = this.set("actionBar", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setForm(value: js.Any): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setFormTag(value: String): Self = this.set("formTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTag: Self = this.set("formTag", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMarkupContainer(value: JQuery): Self = this.set("markupContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkupContainer: Self = this.set("markupContainer", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setWizardId(value: String): Self = this.set("wizardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWizardId: Self = this.set("wizardId", js.undefined)
  }
}
