package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<maplibre-gl.maplibre-gl.StyleImageMetadata> */
trait PartialStyleImageMetadata extends StObject {
  
  var content: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var sdf: js.UndefOr[Boolean] = js.undefined
  
  var stretchX: js.UndefOr[js.Array[js.Tuple2[Double, Double]]] = js.undefined
  
  var stretchY: js.UndefOr[js.Array[js.Tuple2[Double, Double]]] = js.undefined
}
object PartialStyleImageMetadata {
  
  inline def apply(): PartialStyleImageMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleImageMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleImageMetadata] (val x: Self) extends AnyVal {
    
    inline def setContent(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSdf(value: Boolean): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
    
    inline def setSdfUndefined: Self = StObject.set(x, "sdf", js.undefined)
    
    inline def setStretchX(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "stretchX", value.asInstanceOf[js.Any])
    
    inline def setStretchXUndefined: Self = StObject.set(x, "stretchX", js.undefined)
    
    inline def setStretchXVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "stretchX", js.Array(value*))
    
    inline def setStretchY(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "stretchY", value.asInstanceOf[js.Any])
    
    inline def setStretchYUndefined: Self = StObject.set(x, "stretchY", js.undefined)
    
    inline def setStretchYVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "stretchY", js.Array(value*))
  }
}
