package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDialog extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Dialog
  
  /* static member */
  var fn: Dialog
}
object TypeofDialog {
  
  inline def apply(extend: js.Object => Dialog, fn: Dialog): TypeofDialog = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDialog] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Dialog): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Dialog): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
