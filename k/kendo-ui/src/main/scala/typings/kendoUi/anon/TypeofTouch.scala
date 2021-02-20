package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTouch extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Touch = js.native
  
  /* static member */
  var fn: Touch = js.native
}
object TypeofTouch {
  
  @scala.inline
  def apply(extend: js.Object => Touch, fn: Touch): TypeofTouch = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTouch]
  }
  
  @scala.inline
  implicit class TypeofTouchMutableBuilder[Self <: TypeofTouch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Touch): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Touch): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
