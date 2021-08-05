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
  
  inline def apply(extend: js.Object => Menu, fn: Menu): TypeofMenu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMenu]
  }
  
  extension [Self <: TypeofMenu](x: Self) {
    
    inline def setExtend(value: js.Object => Menu): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Menu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
