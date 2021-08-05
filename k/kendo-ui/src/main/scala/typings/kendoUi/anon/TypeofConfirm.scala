package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofConfirm extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Confirm
  
  /* static member */
  var fn: Confirm
}
object TypeofConfirm {
  
  inline def apply(extend: js.Object => Confirm, fn: Confirm): TypeofConfirm = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfirm]
  }
  
  extension [Self <: TypeofConfirm](x: Self) {
    
    inline def setExtend(value: js.Object => Confirm): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Confirm): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
