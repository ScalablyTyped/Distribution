package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ContextMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofContextMenu extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ContextMenu
  
  /* static member */
  var fn: ContextMenu
}
object TypeofContextMenu {
  
  inline def apply(extend: js.Object => ContextMenu, fn: ContextMenu): TypeofContextMenu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofContextMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofContextMenu] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ContextMenu): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ContextMenu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
