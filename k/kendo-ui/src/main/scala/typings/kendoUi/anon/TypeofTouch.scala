package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTouch extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Touch
  
  /* static member */
  var fn: Touch
}
object TypeofTouch {
  
  inline def apply(extend: js.Object => Touch, fn: Touch): TypeofTouch = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTouch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTouch] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Touch): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Touch): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
