package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofButtonExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Button
  
  /* static member */
  var fn: Button
}
object TypeofButtonExtend {
  
  inline def apply(extend: js.Object => Button, fn: Button): TypeofButtonExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofButtonExtend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofButtonExtend] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Button): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Button): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
