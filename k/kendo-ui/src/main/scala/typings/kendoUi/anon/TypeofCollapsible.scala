package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Collapsible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCollapsible extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Collapsible
  
  /* static member */
  var fn: Collapsible
}
object TypeofCollapsible {
  
  inline def apply(extend: js.Object => Collapsible, fn: Collapsible): TypeofCollapsible = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCollapsible]
  }
  
  extension [Self <: TypeofCollapsible](x: Self) {
    
    inline def setExtend(value: js.Object => Collapsible): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Collapsible): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
