package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.RadioGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadioGroup extends StObject {
  
  /* static member */
  def extend(proto: js.Object): RadioGroup
  
  /* static member */
  var fn: RadioGroup
}
object TypeofRadioGroup {
  
  inline def apply(extend: js.Object => RadioGroup, fn: RadioGroup): TypeofRadioGroup = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadioGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRadioGroup] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => RadioGroup): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: RadioGroup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
