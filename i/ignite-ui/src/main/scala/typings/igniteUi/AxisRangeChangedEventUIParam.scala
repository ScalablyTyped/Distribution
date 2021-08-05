package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisRangeChangedEventUIParam extends StObject {
  
  /**
    * Used to get reference to current chart axis object.
    */
  var axis: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get new maximum value.
    */
  var newMaximumValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get new minimum value.
    */
  var newMinimumValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get old maximum value.
    */
  var oldMaximumValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get old minimum value.
    */
  var oldMinimumValue: js.UndefOr[js.Any] = js.undefined
}
object AxisRangeChangedEventUIParam {
  
  inline def apply(): AxisRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisRangeChangedEventUIParam]
  }
  
  extension [Self <: AxisRangeChangedEventUIParam](x: Self) {
    
    inline def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setNewMaximumValue(value: js.Any): Self = StObject.set(x, "newMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setNewMaximumValueUndefined: Self = StObject.set(x, "newMaximumValue", js.undefined)
    
    inline def setNewMinimumValue(value: js.Any): Self = StObject.set(x, "newMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setNewMinimumValueUndefined: Self = StObject.set(x, "newMinimumValue", js.undefined)
    
    inline def setOldMaximumValue(value: js.Any): Self = StObject.set(x, "oldMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setOldMaximumValueUndefined: Self = StObject.set(x, "oldMaximumValue", js.undefined)
    
    inline def setOldMinimumValue(value: js.Any): Self = StObject.set(x, "oldMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setOldMinimumValueUndefined: Self = StObject.set(x, "oldMinimumValue", js.undefined)
  }
}
