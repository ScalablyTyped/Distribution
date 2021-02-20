package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSlider extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Slider = js.native
  
  /* static member */
  var fn: Slider = js.native
}
object TypeofSlider {
  
  @scala.inline
  def apply(extend: js.Object => Slider, fn: Slider): TypeofSlider = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSlider]
  }
  
  @scala.inline
  implicit class TypeofSliderMutableBuilder[Self <: TypeofSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Slider): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Slider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
