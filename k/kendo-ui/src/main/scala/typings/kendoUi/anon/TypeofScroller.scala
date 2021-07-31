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
  
  @scala.inline
  def apply(extend: js.Object => Scroller, fn: Scroller): TypeofScroller = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScroller]
  }
  
  @scala.inline
  implicit class TypeofScrollerMutableBuilder[Self <: TypeofScroller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Scroller): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Scroller): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
