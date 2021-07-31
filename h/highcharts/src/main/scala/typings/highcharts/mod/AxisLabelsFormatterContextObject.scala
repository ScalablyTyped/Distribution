package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelsFormatterContextObject[T] extends StObject {
  
  var axis: Axis
  
  var chart: Chart_
  
  var isFirst: Boolean
  
  var isLast: Boolean
  
  var pos: Double
  
  var value: T
}
object AxisLabelsFormatterContextObject {
  
  @scala.inline
  def apply[T](axis: Axis, chart: Chart_, isFirst: Boolean, isLast: Boolean, pos: Double, value: T): AxisLabelsFormatterContextObject[T] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelsFormatterContextObject[T]]
  }
  
  @scala.inline
  implicit class AxisLabelsFormatterContextObjectMutableBuilder[Self <: AxisLabelsFormatterContextObject[?], T] (val x: Self & AxisLabelsFormatterContextObject[T]) extends AnyVal {
    
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
