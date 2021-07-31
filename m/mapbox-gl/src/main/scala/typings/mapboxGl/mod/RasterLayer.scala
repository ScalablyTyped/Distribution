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
  
  @scala.inline
  def apply(id: String): RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raster")
    __obj.asInstanceOf[RasterLayer]
  }
  
  @scala.inline
  implicit class RasterLayerMutableBuilder[Self <: RasterLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: RasterLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: RasterPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: raster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
