package typings.mapboxMapboxGlDraw.mod

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.direct_select
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.draw_line_string
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.draw_point
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.draw_polygon
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.simple_select
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawModes extends StObject {
  
  var DIRECT_SELECT: direct_select
  
  var DRAW_LINE_STRING: draw_line_string
  
  var DRAW_POINT: draw_point
  
  var DRAW_POLYGON: draw_polygon
  
  var SIMPLE_SELECT: simple_select
  
  var STATIC: static
}
object DrawModes {
  
  inline def apply(): DrawModes = {
    val __obj = js.Dynamic.literal(DIRECT_SELECT = "direct_select", DRAW_LINE_STRING = "draw_line_string", DRAW_POINT = "draw_point", DRAW_POLYGON = "draw_polygon", SIMPLE_SELECT = "simple_select", STATIC = "static")
    __obj.asInstanceOf[DrawModes]
  }
  
  extension [Self <: DrawModes](x: Self) {
    
    inline def setDIRECT_SELECT(value: direct_select): Self = StObject.set(x, "DIRECT_SELECT", value.asInstanceOf[js.Any])
    
    inline def setDRAW_LINE_STRING(value: draw_line_string): Self = StObject.set(x, "DRAW_LINE_STRING", value.asInstanceOf[js.Any])
    
    inline def setDRAW_POINT(value: draw_point): Self = StObject.set(x, "DRAW_POINT", value.asInstanceOf[js.Any])
    
    inline def setDRAW_POLYGON(value: draw_polygon): Self = StObject.set(x, "DRAW_POLYGON", value.asInstanceOf[js.Any])
    
    inline def setSIMPLE_SELECT(value: simple_select): Self = StObject.set(x, "SIMPLE_SELECT", value.asInstanceOf[js.Any])
    
    inline def setSTATIC(value: static): Self = StObject.set(x, "STATIC", value.asInstanceOf[js.Any])
  }
}
