package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ColorPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColorPicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ColorPicker
  
  /* static member */
  var fn: ColorPicker
}
object TypeofColorPicker {
  
  inline def apply(extend: js.Object => ColorPicker, fn: ColorPicker): TypeofColorPicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofColorPicker]
  }
  
  extension [Self <: TypeofColorPicker](x: Self) {
    
    inline def setExtend(value: js.Object => ColorPicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ColorPicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
