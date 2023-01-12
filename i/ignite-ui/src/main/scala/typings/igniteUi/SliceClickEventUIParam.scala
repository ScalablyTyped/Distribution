package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceClickEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to slice object.
    */
  var slice: js.UndefOr[Any] = js.undefined
}
object SliceClickEventUIParam {
  
  inline def apply(): SliceClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceClickEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliceClickEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setSlice(value: Any): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
  }
}
