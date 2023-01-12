package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCommand extends StObject {
  
  /* static member */
  def extend(prototype: js.Object): Any
  
  /* static member */
  var fn: Any
}
object TypeofCommand {
  
  inline def apply(extend: js.Object => Any, fn: Any): TypeofCommand = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCommand] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Any): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
