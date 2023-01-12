package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Drawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDrawerExtend extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Drawer
  
  /* static member */
  var fn: Drawer
}
object TypeofDrawerExtend {
  
  inline def apply(extend: js.Object => Drawer, fn: Drawer): TypeofDrawerExtend = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDrawerExtend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDrawerExtend] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Drawer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Drawer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
