package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardStep extends StObject {
  
  var buttons: js.UndefOr[js.Array[WizardStepButton]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var contentId: js.UndefOr[String] = js.undefined
  
  var contentUrl: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[js.Any] = js.undefined
  
  var pager: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object WizardStep {
  
  @scala.inline
  def apply(): WizardStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardStep]
  }
  
  @scala.inline
  implicit class WizardStepMutableBuilder[Self <: WizardStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[WizardStepButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: WizardStepButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setForm(value: js.Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
