package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSelectionAxisContextObject extends StObject {
  
  /**
    * The selected Axis.
    */
  var axis: Axis = js.native
  
  /**
    * The maximum axis value, either automatic or set manually.
    */
  var max: Double = js.native
  
  /**
    * The minimum axis value, either automatic or set manually.
    */
  var min: Double = js.native
}
object ChartSelectionAxisContextObject {
  
  @scala.inline
  def apply(axis: Axis, max: Double, min: Double): ChartSelectionAxisContextObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSelectionAxisContextObject]
  }
  
  @scala.inline
  implicit class ChartSelectionAxisContextObjectMutableBuilder[Self <: ChartSelectionAxisContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
