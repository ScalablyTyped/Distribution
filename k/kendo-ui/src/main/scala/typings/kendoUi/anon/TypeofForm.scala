package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofForm extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Form = js.native
  
  /* static member */
  var fn: Form = js.native
}
object TypeofForm {
  
  @scala.inline
  def apply(extend: js.Object => Form, fn: Form): TypeofForm = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofForm]
  }
  
  @scala.inline
  implicit class TypeofFormMutableBuilder[Self <: TypeofForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Form): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Form): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
