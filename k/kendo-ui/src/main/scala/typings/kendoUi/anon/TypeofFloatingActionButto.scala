package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.FloatingActionButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFloatingActionButto extends StObject {
  
  /* static member */
  def extend(proto: js.Object): FloatingActionButton
  
  /* static member */
  var fn: FloatingActionButton
}
object TypeofFloatingActionButto {
  
  inline def apply(extend: js.Object => FloatingActionButton, fn: FloatingActionButton): TypeofFloatingActionButto = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFloatingActionButto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFloatingActionButto] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => FloatingActionButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: FloatingActionButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
