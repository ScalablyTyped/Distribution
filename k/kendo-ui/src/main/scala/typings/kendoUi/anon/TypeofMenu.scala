package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMenu extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Menu
  
  /* static member */
  var fn: Menu
}
object TypeofMenu {
  
  @scala.inline
  def apply(extend: js.Object => Menu, fn: Menu): TypeofMenu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMenu]
  }
  
  @scala.inline
  implicit class TypeofMenuMutableBuilder[Self <: TypeofMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Menu): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Menu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
