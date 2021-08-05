package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FlatColorPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFlatColorPicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FlatColorPicker
  
  /* static member */
  var fn: FlatColorPicker
}
object TypeofFlatColorPicker {
  
  inline def apply(extend: js.Object => FlatColorPicker, fn: FlatColorPicker): TypeofFlatColorPicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFlatColorPicker]
  }
  
  extension [Self <: TypeofFlatColorPicker](x: Self) {
    
    inline def setExtend(value: js.Object => FlatColorPicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: FlatColorPicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
