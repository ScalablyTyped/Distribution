package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMap extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Map
  
  /* static member */
  var fn: Map
}
object TypeofMap {
  
  inline def apply(extend: js.Object => Map, fn: Map): TypeofMap = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMap] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Map): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Map): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
