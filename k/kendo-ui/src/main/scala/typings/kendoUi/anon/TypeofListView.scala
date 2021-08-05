package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ListView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ListView
  
  /* static member */
  var fn: ListView
}
object TypeofListView {
  
  inline def apply(extend: js.Object => ListView, fn: ListView): TypeofListView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListView]
  }
  
  extension [Self <: TypeofListView](x: Self) {
    
    inline def setExtend(value: js.Object => ListView): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ListView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
