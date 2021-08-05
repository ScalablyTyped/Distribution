package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Editor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofEditor_ extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Editor_
  
  /* static member */
  var fn: Editor_
}
object TypeofEditor_ {
  
  inline def apply(extend: js.Object => Editor_, fn: Editor_): TypeofEditor_ = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofEditor_]
  }
  
  extension [Self <: TypeofEditor_](x: Self) {
    
    inline def setExtend(value: js.Object => Editor_): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Editor_): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
