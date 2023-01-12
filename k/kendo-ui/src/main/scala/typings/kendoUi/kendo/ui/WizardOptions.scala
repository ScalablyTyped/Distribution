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
  
  inline def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
    inline def setActionBar(value: Boolean): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
    
    inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
    
    inline def setActivate(value: /* e */ WizardActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setContentLoad(value: /* e */ WizardContentLoadEvent => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
    
    inline def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
    
    inline def setContentPosition(value: String): Self = StObject.set(x, "contentPosition", value.asInstanceOf[js.Any])
    
    inline def setContentPositionUndefined: Self = StObject.set(x, "contentPosition", js.undefined)
    
    inline def setDone(value: /* e */ WizardDoneEvent => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: /* e */ WizardErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFormValidateFailed(value: /* e */ WizardFormValidateFailedEvent => Unit): Self = StObject.set(x, "formValidateFailed", js.Any.fromFunction1(value))
    
    inline def setFormValidateFailedUndefined: Self = StObject.set(x, "formValidateFailed", js.undefined)
    
    inline def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    inline def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    inline def setMessages(value: WizardMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setReloadOnSelect(value: Boolean): Self = StObject.set(x, "reloadOnSelect", value.asInstanceOf[js.Any])
    
    inline def setReloadOnSelectUndefined: Self = StObject.set(x, "reloadOnSelect", js.undefined)
    
    inline def setReset(value: /* e */ WizardResetEvent => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSelect(value: /* e */ WizardSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStepper(value: WizardStepper): Self = StObject.set(x, "stepper", value.asInstanceOf[js.Any])
    
    inline def setStepperUndefined: Self = StObject.set(x, "stepper", js.undefined)
    
    inline def setSteps(value: js.Array[WizardStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: WizardStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setValidateForms(value: Boolean): Self = StObject.set(x, "validateForms", value.asInstanceOf[js.Any])
    
    inline def setValidateFormsUndefined: Self = StObject.set(x, "validateForms", js.undefined)
  }
}
