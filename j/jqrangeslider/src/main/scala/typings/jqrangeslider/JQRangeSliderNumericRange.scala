package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQRangeSliderNumericRange extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object JQRangeSliderNumericRange {
  
  @scala.inline
  def apply(): JQRangeSliderNumericRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderNumericRange]
  }
  
  @scala.inline
  implicit class JQRangeSliderNumericRangeMutableBuilder[Self <: JQRangeSliderNumericRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
