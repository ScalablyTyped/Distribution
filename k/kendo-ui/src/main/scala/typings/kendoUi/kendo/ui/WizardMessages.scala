package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WizardMessages extends StObject {
  
  var done: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var of: js.UndefOr[String] = js.native
  
  var previous: js.UndefOr[String] = js.native
  
  var reset: js.UndefOr[String] = js.native
  
  var step: js.UndefOr[String] = js.native
}
object WizardMessages {
  
  @scala.inline
  def apply(): WizardMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardMessages]
  }
  
  @scala.inline
  implicit class WizardMessagesMutableBuilder[Self <: WizardMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setOf(value: String): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
