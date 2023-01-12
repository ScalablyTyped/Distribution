package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.CheckBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCheckBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): CheckBox
  
  /* static member */
  var fn: CheckBox
}
object TypeofCheckBox {
  
  inline def apply(extend: js.Object => CheckBox, fn: CheckBox): TypeofCheckBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCheckBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCheckBox] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => CheckBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: CheckBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
