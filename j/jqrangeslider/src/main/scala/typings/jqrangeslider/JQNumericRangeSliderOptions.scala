package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQNumericRangeSliderOptions extends JQRangeSliderOptions {
  
  var bounds: js.UndefOr[JQRangeSliderNumericRange] = js.native
  
  // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderNumericRange] = js.native
  
  // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* int */ Double, String]] = js.native
  
  // customize displayed label text
  var step: js.UndefOr[Double] = js.native
}
object JQNumericRangeSliderOptions {
  
  @scala.inline
  def apply(): JQNumericRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQNumericRangeSliderOptions]
  }
  
  @scala.inline
  implicit class JQNumericRangeSliderOptionsMutableBuilder[Self <: JQNumericRangeSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: JQRangeSliderNumericRange): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setDefaultValues(value: JQRangeSliderNumericRange): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* int */ Double => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
