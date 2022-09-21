package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlyphMetrics extends StObject {
  
  var advance: Double
  
  var height: Double
  
  var left: Double
  
  var top: Double
  
  var width: Double
}
object GlyphMetrics {
  
  inline def apply(advance: Double, height: Double, left: Double, top: Double, width: Double): GlyphMetrics = {
    val __obj = js.Dynamic.literal(advance = advance.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphMetrics]
  }
  
  extension [Self <: GlyphMetrics](x: Self) {
    
    inline def setAdvance(value: Double): Self = StObject.set(x, "advance", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
