package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceClickEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to slice object.
    */
  var slice: js.UndefOr[js.Any] = js.undefined
}
object SliceClickEventUIParam {
  
  inline def apply(): SliceClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceClickEventUIParam]
  }
  
  extension [Self <: SliceClickEventUIParam](x: Self) {
    
    inline def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setSlice(value: js.Any): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
