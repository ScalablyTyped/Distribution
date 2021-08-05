package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofChart extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Chart
  
  /* static member */
  var fn: Chart
}
object TypeofChart {
  
  inline def apply(extend: js.Object => Chart, fn: Chart): TypeofChart = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChart]
  }
  
  extension [Self <: TypeofChart](x: Self) {
    
    inline def setExtend(value: js.Object => Chart): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Chart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
