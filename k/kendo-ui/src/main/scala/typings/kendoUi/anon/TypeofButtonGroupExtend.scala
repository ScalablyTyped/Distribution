package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.ButtonGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofButtonGroupExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ButtonGroup
  
  /* static member */
  var fn: ButtonGroup
}
object TypeofButtonGroupExtend {
  
  inline def apply(extend: js.Object => ButtonGroup, fn: ButtonGroup): TypeofButtonGroupExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofButtonGroupExtend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofButtonGroupExtend] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ButtonGroup): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ButtonGroup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
