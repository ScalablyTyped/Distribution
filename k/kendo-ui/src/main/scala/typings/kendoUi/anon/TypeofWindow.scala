package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWindow extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Window
  
  /* static member */
  var fn: Window
}
object TypeofWindow {
  
  inline def apply(extend: js.Object => Window, fn: Window): TypeofWindow = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWindow]
  }
  
  extension [Self <: TypeofWindow](x: Self) {
    
    inline def setExtend(value: js.Object => Window): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Window): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
