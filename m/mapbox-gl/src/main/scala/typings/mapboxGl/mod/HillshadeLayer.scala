package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.hillshade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HillshadeLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[HillshadeLayout] = js.undefined
  
  var paint: js.UndefOr[HillshadePaint] = js.undefined
  
  var `type`: hillshade
}
object HillshadeLayer {
  
  @scala.inline
  def apply(id: String): HillshadeLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hillshade")
    __obj.asInstanceOf[HillshadeLayer]
  }
  
  @scala.inline
  implicit class HillshadeLayerMutableBuilder[Self <: HillshadeLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: HillshadeLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: HillshadePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: hillshade): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
