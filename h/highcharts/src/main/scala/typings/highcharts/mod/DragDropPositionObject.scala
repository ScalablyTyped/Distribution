package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropPositionObject extends StObject {
  
  /**
    * Chart x position
    */
  var chartX: Double
  
  /**
    * Chart y position
    */
  var chartY: Double
  
  /**
    * Drag and drop guide box.
    */
  var guideBox: js.UndefOr[BBoxObject] = js.undefined
  
  /**
    * Updated point data.
    */
  var points: Dictionary[Dictionary[Double]]
  
  /**
    * Delta of previous x position.
    */
  var prevdX: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta of previous y position.
    */
  var prevdY: js.UndefOr[Double] = js.undefined
}
object DragDropPositionObject {
  
  inline def apply(chartX: Double, chartY: Double, points: Dictionary[Dictionary[Double]]): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDropPositionObject] (val x: Self) extends AnyVal {
    
    inline def setChartX(value: Double): Self = StObject.set(x, "chartX", value.asInstanceOf[js.Any])
    
    inline def setChartY(value: Double): Self = StObject.set(x, "chartY", value.asInstanceOf[js.Any])
    
    inline def setGuideBox(value: BBoxObject): Self = StObject.set(x, "guideBox", value.asInstanceOf[js.Any])
    
    inline def setGuideBoxUndefined: Self = StObject.set(x, "guideBox", js.undefined)
    
    inline def setPoints(value: Dictionary[Dictionary[Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPrevdX(value: Double): Self = StObject.set(x, "prevdX", value.asInstanceOf[js.Any])
    
    inline def setPrevdXUndefined: Self = StObject.set(x, "prevdX", js.undefined)
    
    inline def setPrevdY(value: Double): Self = StObject.set(x, "prevdY", value.asInstanceOf[js.Any])
    
    inline def setPrevdYUndefined: Self = StObject.set(x, "prevdY", js.undefined)
  }
}
