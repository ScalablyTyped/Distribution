package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.line_string
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.point_
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.polygon_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LINE extends StObject {
  
  var LINE: line_string
  
  var POINT: point_
  
  var POLYGON: polygon_
}
object LINE {
  
  inline def apply(): LINE = {
    val __obj = js.Dynamic.literal(LINE = "line_string", POINT = "point", POLYGON = "polygon")
    __obj.asInstanceOf[LINE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LINE] (val x: Self) extends AnyVal {
    
    inline def setLINE(value: line_string): Self = StObject.set(x, "LINE", value.asInstanceOf[js.Any])
    
    inline def setPOINT(value: point_): Self = StObject.set(x, "POINT", value.asInstanceOf[js.Any])
    
    inline def setPOLYGON(value: polygon_): Self = StObject.set(x, "POLYGON", value.asInstanceOf[js.Any])
  }
}
