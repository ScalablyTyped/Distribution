package typings.mapboxMapboxGlDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modes_ extends StObject {
  
  var direct_select: DrawCustomMode[Any, Any]
  
  var draw_line_string: DrawCustomMode[Any, Any]
  
  var draw_point: DrawCustomMode[Any, Any]
  
  var draw_polygon: DrawCustomMode[Any, Any]
  
  var simple_select: DrawCustomMode[Any, Any]
}
object Modes_ {
  
  inline def apply(
    direct_select: DrawCustomMode[Any, Any],
    draw_line_string: DrawCustomMode[Any, Any],
    draw_point: DrawCustomMode[Any, Any],
    draw_polygon: DrawCustomMode[Any, Any],
    simple_select: DrawCustomMode[Any, Any]
  ): Modes_ = {
    val __obj = js.Dynamic.literal(direct_select = direct_select.asInstanceOf[js.Any], draw_line_string = draw_line_string.asInstanceOf[js.Any], draw_point = draw_point.asInstanceOf[js.Any], draw_polygon = draw_polygon.asInstanceOf[js.Any], simple_select = simple_select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modes_]
  }
  
  extension [Self <: Modes_](x: Self) {
    
    inline def setDirect_select(value: DrawCustomMode[Any, Any]): Self = StObject.set(x, "direct_select", value.asInstanceOf[js.Any])
    
    inline def setDraw_line_string(value: DrawCustomMode[Any, Any]): Self = StObject.set(x, "draw_line_string", value.asInstanceOf[js.Any])
    
    inline def setDraw_point(value: DrawCustomMode[Any, Any]): Self = StObject.set(x, "draw_point", value.asInstanceOf[js.Any])
    
    inline def setDraw_polygon(value: DrawCustomMode[Any, Any]): Self = StObject.set(x, "draw_polygon", value.asInstanceOf[js.Any])
    
    inline def setSimple_select(value: DrawCustomMode[Any, Any]): Self = StObject.set(x, "simple_select", value.asInstanceOf[js.Any])
  }
}
