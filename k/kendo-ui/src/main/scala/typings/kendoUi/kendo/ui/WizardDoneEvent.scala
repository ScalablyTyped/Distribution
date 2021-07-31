package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardDoneEvent
  extends StObject
     with WizardEvent {
  
  var button: js.UndefOr[Button] = js.undefined
  
  var forms: js.UndefOr[js.Any] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}
object WizardDoneEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Wizard): WizardDoneEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardDoneEvent]
  }
  
  @scala.inline
  implicit class WizardDoneEventMutableBuilder[Self <: WizardDoneEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Button): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setForms(value: js.Any): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
