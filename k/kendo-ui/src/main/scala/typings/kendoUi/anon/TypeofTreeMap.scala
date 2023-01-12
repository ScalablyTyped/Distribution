package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.TreeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeMap extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TreeMap
  
  /* static member */
  var fn: TreeMap
}
object TypeofTreeMap {
  
  inline def apply(extend: js.Object => TreeMap, fn: TreeMap): TypeofTreeMap = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTreeMap] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TreeMap): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TreeMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
