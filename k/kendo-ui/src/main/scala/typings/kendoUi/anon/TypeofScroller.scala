package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScroller extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Scroller
  
  /* static member */
  var fn: Scroller
}
object TypeofScroller {
  
  inline def apply(extend: js.Object => Scroller, fn: Scroller): TypeofScroller = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScroller]
  }
  
  extension [Self <: TypeofScroller](x: Self) {
    
    inline def setExtend(value: js.Object => Scroller): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Scroller): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
