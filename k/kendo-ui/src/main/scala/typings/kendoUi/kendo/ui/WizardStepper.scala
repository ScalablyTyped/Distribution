package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizardStepper extends StObject {
  
  var indicator: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[Boolean] = js.undefined
  
  var linear: js.UndefOr[Boolean] = js.undefined
}
object WizardStepper {
  
  @scala.inline
  def apply(): WizardStepper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardStepper]
  }
  
  @scala.inline
  implicit class WizardStepperMutableBuilder[Self <: WizardStepper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
  }
}
