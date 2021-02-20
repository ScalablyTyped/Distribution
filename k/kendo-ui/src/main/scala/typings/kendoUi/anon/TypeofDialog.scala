package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDialog extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Dialog = js.native
  
  /* static member */
  var fn: Dialog = js.native
}
object TypeofDialog {
  
  @scala.inline
  def apply(extend: js.Object => Dialog, fn: Dialog): TypeofDialog = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDialog]
  }
  
  @scala.inline
  implicit class TypeofDialogMutableBuilder[Self <: TypeofDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Dialog): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Dialog): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
