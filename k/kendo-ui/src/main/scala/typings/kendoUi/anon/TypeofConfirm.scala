package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Confirm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofConfirm extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Confirm = js.native
  
  /* static member */
  var fn: Confirm = js.native
}
object TypeofConfirm {
  
  @scala.inline
  def apply(extend: js.Object => Confirm, fn: Confirm): TypeofConfirm = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofConfirm]
  }
  
  @scala.inline
  implicit class TypeofConfirmMutableBuilder[Self <: TypeofConfirm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Confirm): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Confirm): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
