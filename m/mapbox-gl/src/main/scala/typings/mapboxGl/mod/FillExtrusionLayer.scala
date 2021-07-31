package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`fill-extrusion`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillExtrusionLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[FillExtrusionLayout] = js.undefined
  
  var paint: js.UndefOr[FillExtrusionPaint] = js.undefined
  
  var `type`: `fill-extrusion`
}
object FillExtrusionLayer {
  
  @scala.inline
  def apply(id: String): FillExtrusionLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill-extrusion")
    __obj.asInstanceOf[FillExtrusionLayer]
  }
  
  @scala.inline
  implicit class FillExtrusionLayerMutableBuilder[Self <: FillExtrusionLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: FillExtrusionLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: FillExtrusionPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: `fill-extrusion`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
