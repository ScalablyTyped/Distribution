package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartClickEventAxisObject extends StObject {
  
  /**
    * Axis at the clicked spot.
    */
  var axis: Axis
  
  /**
    * Axis value at the clicked spot.
    */
  var value: Double
}
object ChartClickEventAxisObject {
  
  @scala.inline
  def apply(axis: Axis, value: Double): ChartClickEventAxisObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartClickEventAxisObject]
  }
  
  @scala.inline
  implicit class ChartClickEventAxisObjectMutableBuilder[Self <: ChartClickEventAxisObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
