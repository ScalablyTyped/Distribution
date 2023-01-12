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
  
  inline def apply(): WizardStepper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardStepper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WizardStepper] (val x: Self) extends AnyVal {
    
    inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
  }
}
