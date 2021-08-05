package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofForm extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Form
  
  /* static member */
  var fn: Form
}
object TypeofForm {
  
  inline def apply(extend: js.Object => Form, fn: Form): TypeofForm = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofForm]
  }
  
  extension [Self <: TypeofForm](x: Self) {
    
    inline def setExtend(value: js.Object => Form): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Form): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
