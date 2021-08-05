package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.stepper.StepOptions
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepperOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ StepperActivateEvent, Unit]] = js.undefined
  
  var indicator: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[Boolean] = js.undefined
  
  var linear: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String | horizontal | vertical] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ StepperSelectEvent, Unit]] = js.undefined
  
  var selectOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var steps: js.Array[StepOptions | String]
}
object StepperOptions {
  
  inline def apply(steps: js.Array[StepOptions | String]): StepperOptions = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOptions]
  }
  
  extension [Self <: StepperOptions](x: Self) {
    
    inline def setActivate(value: /* e */ StepperActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setIndicator(value: Boolean): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setLabel(value: Boolean): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "linear", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: String | horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelect(value: /* e */ StepperSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSteps(value: js.Array[StepOptions | String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: (StepOptions | String)*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
