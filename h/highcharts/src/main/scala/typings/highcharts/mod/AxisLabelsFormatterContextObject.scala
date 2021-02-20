package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLabelsFormatterContextObject[T] extends StObject {
  
  var axis: Axis = js.native
  
  var chart: Chart_ = js.native
  
  var isFirst: Boolean = js.native
  
  var isLast: Boolean = js.native
  
  var pos: Double = js.native
  
  var value: T = js.native
}
object AxisLabelsFormatterContextObject {
  
  @scala.inline
  def apply[T](axis: Axis, chart: Chart_, isFirst: Boolean, isLast: Boolean, pos: Double, value: T): AxisLabelsFormatterContextObject[T] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject[T]]
  }
  
  @scala.inline
  implicit class AxisLabelsFormatterContextObjectMutableBuilder[Self <: AxisLabelsFormatterContextObject[_], T] (val x: Self with AxisLabelsFormatterContextObject[T]) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
