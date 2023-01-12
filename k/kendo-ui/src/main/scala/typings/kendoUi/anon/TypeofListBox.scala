package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ListBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ListBox
  
  /* static member */
  var fn: ListBox
}
object TypeofListBox {
  
  inline def apply(extend: js.Object => ListBox, fn: ListBox): TypeofListBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofListBox] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ListBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ListBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
