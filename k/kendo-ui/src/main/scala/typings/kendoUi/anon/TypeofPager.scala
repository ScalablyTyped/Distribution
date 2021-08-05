package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Pager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPager extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Pager
  
  /* static member */
  var fn: Pager
}
object TypeofPager {
  
  inline def apply(extend: js.Object => Pager, fn: Pager): TypeofPager = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPager]
  }
  
  extension [Self <: TypeofPager](x: Self) {
    
    inline def setExtend(value: js.Object => Pager): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Pager): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
