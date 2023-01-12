package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWidget extends StObject {
  
  /* static member */
  def extend(prototype: js.Object): Widget
  
  /* static member */
  var fn: Any
}
object TypeofWidget {
  
  inline def apply(extend: js.Object => Widget, fn: Any): TypeofWidget = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWidget] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Widget): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
