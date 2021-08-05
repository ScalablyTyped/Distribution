package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowOverlayOptions
  extends StObject
     with OverlayOptions {
  
  // 0.5
  var direction: js.UndefOr[Double] = js.undefined
  
  // 1
  var foldback: js.UndefOr[Double] = js.undefined
  
  // 20
  var length: js.UndefOr[Double] = js.undefined
  
  // 20
  var location: js.UndefOr[Double] = js.undefined
  
  // 0.623
  var paintStyle: js.UndefOr[PaintStyle] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ArrowOverlayOptions {
  
  inline def apply(): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
  
  extension [Self <: ArrowOverlayOptions](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFoldback(value: Double): Self = StObject.set(x, "foldback", value.asInstanceOf[js.Any])
    
    inline def setFoldbackUndefined: Self = StObject.set(x, "foldback", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPaintStyle(value: PaintStyle): Self = StObject.set(x, "paintStyle", value.asInstanceOf[js.Any])
    
    inline def setPaintStyleUndefined: Self = StObject.set(x, "paintStyle", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
