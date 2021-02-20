package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDropPositionObject extends StObject {
  
  /**
    * Chart x position
    */
  var chartX: Double = js.native
  
  /**
    * Chart y position
    */
  var chartY: Double = js.native
  
  /**
    * Drag and drop guide box.
    */
  var guideBox: js.UndefOr[BBoxObject] = js.native
  
  /**
    * Updated point data.
    */
  var points: Dictionary[Dictionary[Double]] = js.native
  
  /**
    * Delta of previous x position.
    */
  var prevdX: js.UndefOr[Double] = js.native
  
  /**
    * Delta of previous y position.
    */
  var prevdY: js.UndefOr[Double] = js.native
}
object DragDropPositionObject {
  
  @scala.inline
  def apply(chartX: Double, chartY: Double, points: Dictionary[Dictionary[Double]]): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
  
  @scala.inline
  implicit class DragDropPositionObjectMutableBuilder[Self <: DragDropPositionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartX(value: Double): Self = StObject.set(x, "chartX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartY(value: Double): Self = StObject.set(x, "chartY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideBox(value: BBoxObject): Self = StObject.set(x, "guideBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideBoxUndefined: Self = StObject.set(x, "guideBox", js.undefined)
    
    @scala.inline
    def setPoints(value: Dictionary[Dictionary[Double]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevdX(value: Double): Self = StObject.set(x, "prevdX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevdXUndefined: Self = StObject.set(x, "prevdX", js.undefined)
    
    @scala.inline
    def setPrevdY(value: Double): Self = StObject.set(x, "prevdY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevdYUndefined: Self = StObject.set(x, "prevdY", js.undefined)
  }
}
