package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.SplitButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSplitButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): SplitButton
  
  /* static member */
  var fn: SplitButton
}
object TypeofSplitButton {
  
  inline def apply(extend: js.Object => SplitButton, fn: SplitButton): TypeofSplitButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSplitButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSplitButton] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => SplitButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: SplitButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
