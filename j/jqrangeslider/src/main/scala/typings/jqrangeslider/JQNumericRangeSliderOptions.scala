package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQNumericRangeSliderOptions
  extends StObject
     with JQRangeSliderOptions {
  
  var bounds: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
  
  // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
  
  // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* int */ Double, String]] = js.undefined
  
  // customize displayed label text
  var step: js.UndefOr[Double] = js.undefined
}
object JQNumericRangeSliderOptions {
  
  inline def apply(): JQNumericRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQNumericRangeSliderOptions]
  }
  
  extension [Self <: JQNumericRangeSliderOptions](x: Self) {
    
    inline def setBounds(value: JQRangeSliderNumericRange): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDefaultValues(value: JQRangeSliderNumericRange): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
    
    inline def setFormatter(value: /* int */ Double => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
