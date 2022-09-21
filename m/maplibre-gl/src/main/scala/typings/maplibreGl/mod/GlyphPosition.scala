package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlyphPosition extends StObject {
  
  var metrics: GlyphMetrics
  
  var rect: Rect
}
object GlyphPosition {
  
  inline def apply(metrics: GlyphMetrics, rect: Rect): GlyphPosition = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphPosition]
  }
  
  extension [Self <: GlyphPosition](x: Self) {
    
    inline def setMetrics(value: GlyphMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
