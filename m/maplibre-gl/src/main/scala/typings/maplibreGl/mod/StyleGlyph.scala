package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleGlyph extends StObject {
  
  var bitmap: AlphaImage
  
  var id: Double
  
  var metrics: GlyphMetrics
}
object StyleGlyph {
  
  inline def apply(bitmap: AlphaImage, id: Double, metrics: GlyphMetrics): StyleGlyph = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleGlyph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleGlyph] (val x: Self) extends AnyVal {
    
    inline def setBitmap(value: AlphaImage): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: GlyphMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
  }
}
