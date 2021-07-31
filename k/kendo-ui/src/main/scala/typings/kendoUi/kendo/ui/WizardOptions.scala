package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardOptions extends StObject {
  
  var actionBar: js.UndefOr[Boolean] = js.undefined
  
  var activate: js.UndefOr[js.Function1[/* e */ WizardActivateEvent, Unit]] = js.undefined
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ WizardContentLoadEvent, Unit]] = js.undefined
  
  var contentPosition: js.UndefOr[String] = js.undefined
  
  var done: js.UndefOr[js.Function1[/* e */ WizardDoneEvent, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ WizardErrorEvent, Unit]] = js.undefined
  
  var formValidateFailed: js.UndefOr[js.Function1[/* e */ WizardFormValidateFailedEvent, Unit]] = js.undefined
  
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[WizardMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pager: js.UndefOr[Boolean] = js.undefined
  
  var reloadOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var reset: js.UndefOr[js.Function1[/* e */ WizardResetEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ WizardSelectEvent, Unit]] = js.undefined
  
  var stepper: js.UndefOr[WizardStepper] = js.undefined
  
  var steps: js.UndefOr[js.Array[WizardStep]] = js.undefined
  
  var validateForms: js.UndefOr[Boolean] = js.undefined
}
object WizardOptions {
  
  @scala.inline
  def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit class WizardOptionsMutableBuilder[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionBar(value: Boolean): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
    
    @scala.inline
    def setActivate(value: /* e */ WizardActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ WizardContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    @scala.inline
    def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
    
    @scala.inline
    def setDone(value: /* e */ WizardDoneEvent => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ WizardErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFormValidateFailed(value: /* e */ WizardFormValidateFailedEvent => Unit): Self = StObject.set(x, "formValidateFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormValidateFailedUndefined: Self = StObject.set(x, "formValidateFailed", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    @scala.inline
    def setMessages(value: WizardMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setReloadOnSelect(value: Boolean): Self = StObject.set(x, "reloadOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadOnSelectUndefined: Self = StObject.set(x, "reloadOnSelect", js.undefined)
    
    @scala.inline
    def setReset(value: /* e */ WizardResetEvent => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ WizardSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setStepper(value: WizardStepper): Self = StObject.set(x, "stepper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepperUndefined: Self = StObject.set(x, "stepper", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[WizardStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: WizardStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setValidateForms(value: Boolean): Self = StObject.set(x, "validateForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateFormsUndefined: Self = StObject.set(x, "validateForms", js.undefined)
  }
}
