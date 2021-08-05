package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DropDownList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropDownList extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DropDownList
  
  /* static member */
  var fn: DropDownList
}
object TypeofDropDownList {
  
  inline def apply(extend: js.Object => DropDownList, fn: DropDownList): TypeofDropDownList = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownList]
  }
  
  extension [Self <: TypeofDropDownList](x: Self) {
    
    inline def setExtend(value: js.Object => DropDownList): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: DropDownList): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
