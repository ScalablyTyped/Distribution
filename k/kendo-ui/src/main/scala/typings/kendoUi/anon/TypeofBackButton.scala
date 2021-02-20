package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.BackButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBackButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): BackButton = js.native
  
  /* static member */
  var fn: BackButton = js.native
}
object TypeofBackButton {
  
  @scala.inline
  def apply(extend: js.Object => BackButton, fn: BackButton): TypeofBackButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBackButton]
  }
  
  @scala.inline
  implicit class TypeofBackButtonMutableBuilder[Self <: TypeofBackButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => BackButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: BackButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
