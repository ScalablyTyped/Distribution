package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.RangeSlider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRangeSlider extends StObject {
  
  /* static member */
  def extend(proto: js.Object): RangeSlider = js.native
  
  /* static member */
  var fn: RangeSlider = js.native
}
object TypeofRangeSlider {
  
  @scala.inline
  def apply(extend: js.Object => RangeSlider, fn: RangeSlider): TypeofRangeSlider = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRangeSlider]
  }
  
  @scala.inline
  implicit class TypeofRangeSliderMutableBuilder[Self <: TypeofRangeSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => RangeSlider): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: RangeSlider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
