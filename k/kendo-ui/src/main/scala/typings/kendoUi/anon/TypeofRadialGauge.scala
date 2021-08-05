package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.RadialGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadialGauge extends StObject {
  
  /* static member */
  def extend(proto: js.Object): RadialGauge
  
  /* static member */
  var fn: RadialGauge
}
object TypeofRadialGauge {
  
  inline def apply(extend: js.Object => RadialGauge, fn: RadialGauge): TypeofRadialGauge = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadialGauge]
  }
  
  extension [Self <: TypeofRadialGauge](x: Self) {
    
    inline def setExtend(value: js.Object => RadialGauge): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: RadialGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
