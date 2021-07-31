package typings.jqrangeslider

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQRangeSliderDateRange extends StObject {
  
  var max: js.UndefOr[Date] = js.undefined
  
  var min: js.UndefOr[Date] = js.undefined
}
object JQRangeSliderDateRange {
  
  @scala.inline
  def apply(): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
  
  @scala.inline
  implicit class JQRangeSliderDateRangeMutableBuilder[Self <: JQRangeSliderDateRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
