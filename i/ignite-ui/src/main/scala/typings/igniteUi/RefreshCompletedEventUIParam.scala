package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshCompletedEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[Any] = js.undefined
}
object RefreshCompletedEventUIParam {
  
  inline def apply(): RefreshCompletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCompletedEventUIParam]
  }
  
  extension [Self <: RefreshCompletedEventUIParam](x: Self) {
    
    inline def setChart(value: Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
