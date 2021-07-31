package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesPlotBoxObject extends StObject {
  
  var scaleX: Double
  
  var scaleY: Double
  
  var translateX: Double
  
  var translateY: Double
}
object SeriesPlotBoxObject {
  
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, translateX: Double, translateY: Double): SeriesPlotBoxObject = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPlotBoxObject]
  }
  
  @scala.inline
  implicit class SeriesPlotBoxObjectMutableBuilder[Self <: SeriesPlotBoxObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
