package typings.kendoUi.anon

import typings.kendoUi.kendo.dataviz.ui.StockChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofStockChart extends StObject {
  
  /* static member */
  def extend(proto: js.Object): StockChart
  
  /* static member */
  var fn: StockChart
}
object TypeofStockChart {
  
  inline def apply(extend: js.Object => StockChart, fn: StockChart): TypeofStockChart = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStockChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofStockChart] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => StockChart): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: StockChart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
