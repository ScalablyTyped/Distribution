package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.CircularGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCircularGauge extends StObject {
  
  /* static member */
  def extend(proto: js.Object): CircularGauge
  
  /* static member */
  var fn: CircularGauge
}
object TypeofCircularGauge {
  
  inline def apply(extend: js.Object => CircularGauge, fn: CircularGauge): TypeofCircularGauge = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCircularGauge]
  }
  
  extension [Self <: TypeofCircularGauge](x: Self) {
    
    inline def setExtend(value: js.Object => CircularGauge): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: CircularGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
