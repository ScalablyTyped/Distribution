package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.ModalView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofModalView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ModalView
  
  /* static member */
  var fn: ModalView
}
object TypeofModalView {
  
  inline def apply(extend: js.Object => ModalView, fn: ModalView): TypeofModalView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofModalView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofModalView] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ModalView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ModalView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
