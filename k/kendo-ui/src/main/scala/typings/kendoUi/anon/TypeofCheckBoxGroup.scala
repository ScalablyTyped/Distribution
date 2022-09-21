package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.CheckBoxGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCheckBoxGroup extends StObject {
  
  /* static member */
  def extend(proto: js.Object): CheckBoxGroup
  
  /* static member */
  var fn: CheckBoxGroup
}
object TypeofCheckBoxGroup {
  
  inline def apply(extend: js.Object => CheckBoxGroup, fn: CheckBoxGroup): TypeofCheckBoxGroup = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCheckBoxGroup]
  }
  
  extension [Self <: TypeofCheckBoxGroup](x: Self) {
    
    inline def setExtend(value: js.Object => CheckBoxGroup): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: CheckBoxGroup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
