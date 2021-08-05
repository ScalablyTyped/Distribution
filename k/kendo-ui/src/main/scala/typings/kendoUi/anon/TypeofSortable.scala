package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Sortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSortable extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Sortable
  
  /* static member */
  var fn: Sortable
}
object TypeofSortable {
  
  inline def apply(extend: js.Object => Sortable, fn: Sortable): TypeofSortable = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSortable]
  }
  
  extension [Self <: TypeofSortable](x: Self) {
    
    inline def setExtend(value: js.Object => Sortable): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Sortable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
