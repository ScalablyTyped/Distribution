package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TextArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTextArea extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TextArea
  
  /* static member */
  var fn: TextArea
}
object TypeofTextArea {
  
  inline def apply(extend: js.Object => TextArea, fn: TextArea): TypeofTextArea = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTextArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTextArea] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TextArea): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TextArea): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
