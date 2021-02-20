package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQRangeSliderRangeLength extends StObject {
  
  var max: js.UndefOr[js.Any] = js.native
  
  var min: js.UndefOr[js.Any] = js.native
}
object JQRangeSliderRangeLength {
  
  @scala.inline
  def apply(): JQRangeSliderRangeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderRangeLength]
  }
  
  @scala.inline
  implicit class JQRangeSliderRangeLengthMutableBuilder[Self <: JQRangeSliderRangeLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
