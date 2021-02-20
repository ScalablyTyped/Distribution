package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TextArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTextArea extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TextArea = js.native
  
  /* static member */
  var fn: TextArea = js.native
}
object TypeofTextArea {
  
  @scala.inline
  def apply(extend: js.Object => TextArea, fn: TextArea): TypeofTextArea = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTextArea]
  }
  
  @scala.inline
  implicit class TypeofTextAreaMutableBuilder[Self <: TypeofTextArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TextArea): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TextArea): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
