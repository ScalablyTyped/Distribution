package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "HillshadeStyleLayer")
@js.native
open class HillshadeStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_HillshadeStyleLayer: Transitionable[HillshadePaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_HillshadeStyleLayer: Transitioning[HillshadePaintProps] = js.native
  
  @JSName("paint")
  var paint_HillshadeStyleLayer: PossiblyEvaluated[HillshadePaintProps, HillshadePaintPropsPossiblyEvaluated] = js.native
}
