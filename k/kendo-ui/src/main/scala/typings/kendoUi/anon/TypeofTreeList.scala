package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeList extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TreeList
  
  /* static member */
  var fn: TreeList
}
object TypeofTreeList {
  
  inline def apply(extend: js.Object => TreeList, fn: TreeList): TypeofTreeList = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeList]
  }
  
  extension [Self <: TypeofTreeList](x: Self) {
    
    inline def setExtend(value: js.Object => TreeList): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TreeList): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
