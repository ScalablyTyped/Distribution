package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.raster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[RasterLayout] = js.native
  
  var paint: js.UndefOr[RasterPaint] = js.native
  
  var `type`: raster = js.native
}
object RasterLayer {
  
  @scala.inline
  def apply(id: String, `type`: raster): RasterLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
