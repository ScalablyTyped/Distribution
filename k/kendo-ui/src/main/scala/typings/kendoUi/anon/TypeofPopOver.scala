package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.PopOver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPopOver extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PopOver
  
  /* static member */
  var fn: PopOver
}
object TypeofPopOver {
  
  @scala.inline
  def apply(extend: js.Object => PopOver, fn: PopOver): TypeofPopOver = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPopOver]
  }
  
  @scala.inline
  implicit class TypeofPopOverMutableBuilder[Self <: TypeofPopOver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => PopOver): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: PopOver): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
