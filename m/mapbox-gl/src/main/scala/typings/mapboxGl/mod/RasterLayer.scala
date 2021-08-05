package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.raster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[RasterLayout] = js.undefined
  
  var paint: js.UndefOr[RasterPaint] = js.undefined
  
  var `type`: raster
}
object RasterLayer {
  
  inline def apply(id: String): RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[RasterLayer]
  }
  
  extension [Self <: RasterLayer](x: Self) {
    
    inline def setLayout(value: RasterLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPaint(value: RasterPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    inline def setType(value: raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
