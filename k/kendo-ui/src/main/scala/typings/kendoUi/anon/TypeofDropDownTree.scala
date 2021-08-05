package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DropDownTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropDownTree extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DropDownTree
  
  /* static member */
  var fn: DropDownTree
}
object TypeofDropDownTree {
  
  inline def apply(extend: js.Object => DropDownTree, fn: DropDownTree): TypeofDropDownTree = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownTree]
  }
  
  extension [Self <: TypeofDropDownTree](x: Self) {
    
    inline def setExtend(value: js.Object => DropDownTree): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: DropDownTree): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
