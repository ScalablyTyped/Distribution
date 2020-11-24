package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardOptions extends js.Object {
  
  var actionBar: js.UndefOr[Boolean] = js.native
  
  var activate: js.UndefOr[js.Function1[/* e */ WizardActivateEvent, Unit]] = js.native
  
  var contentLoad: js.UndefOr[js.Function1[/* e */ WizardContentLoadEvent, Unit]] = js.native
  
  var contentPosition: js.UndefOr[String] = js.native
  
  var done: js.UndefOr[js.Function1[/* e */ WizardDoneEvent, Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ WizardErrorEvent, Unit]] = js.native
  
  var formValidateFailed: js.UndefOr[js.Function1[/* e */ WizardFormValidateFailedEvent, Unit]] = js.native
  
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[WizardMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pager: js.UndefOr[Boolean] = js.native
  
  var reloadOnSelect: js.UndefOr[Boolean] = js.native
  
  var reset: js.UndefOr[js.Function1[/* e */ WizardResetEvent, Unit]] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ WizardSelectEvent, Unit]] = js.native
  
  var stepper: js.UndefOr[WizardStepper] = js.native
  
  var steps: js.UndefOr[js.Array[WizardStep]] = js.native
  
  var validateForms: js.UndefOr[Boolean] = js.native
}
object WizardOptions {
  
  @scala.inline
  def apply(): WizardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardOptions]
  }
  
  @scala.inline
  implicit class WizardOptionsOps[Self <: WizardOptions] (val x: Self) extends AnyVal {
    
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
    def setActionBar(value: Boolean): Self = this.set("actionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionBar: Self = this.set("actionBar", js.undefined)
    
    @scala.inline
    def setActivate(value: /* e */ WizardActivateEvent => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setContentLoad(value: /* e */ WizardContentLoadEvent => Unit): Self = this.set("contentLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContentLoad: Self = this.set("contentLoad", js.undefined)
    
    @scala.inline
    def setContentPosition(value: String): Self = this.set("contentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentPosition: Self = this.set("contentPosition", js.undefined)
    
    @scala.inline
    def setDone(value: /* e */ WizardDoneEvent => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ WizardErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFormValidateFailed(value: /* e */ WizardFormValidateFailedEvent => Unit): Self = this.set("formValidateFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormValidateFailed: Self = this.set("formValidateFailed", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    
    @scala.inline
    def setMessages(value: WizardMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPager(value: Boolean): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setReloadOnSelect(value: Boolean): Self = this.set("reloadOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadOnSelect: Self = this.set("reloadOnSelect", js.undefined)
    
    @scala.inline
    def setReset(value: /* e */ WizardResetEvent => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ WizardSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setStepper(value: WizardStepper): Self = this.set("stepper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepper: Self = this.set("stepper", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: WizardStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[WizardStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setValidateForms(value: Boolean): Self = this.set("validateForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateForms: Self = this.set("validateForms", js.undefined)
  }
}
