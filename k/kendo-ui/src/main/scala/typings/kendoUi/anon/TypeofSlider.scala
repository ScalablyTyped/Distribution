package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSlider extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Slider
  
  /* static member */
  var fn: Slider
}
object TypeofSlider {
  
  inline def apply(extend: js.Object => Slider, fn: Slider): TypeofSlider = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSlider]
  }
  
  extension [Self <: TypeofSlider](x: Self) {
    
    inline def setExtend(value: js.Object => Slider): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Slider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
