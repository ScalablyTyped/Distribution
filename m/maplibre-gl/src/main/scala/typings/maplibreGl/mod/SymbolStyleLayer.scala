package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SymbolStyleLayer")
@js.native
open class SymbolStyleLayer protected ()
  extends StyleLayer
     with TypedStyleLayer {
  def this(layer: LayerSpecification) = this()
  
  def _setPaintOverrides(): scala.Unit = js.native
  
  @JSName("_transitionablePaint")
  var _transitionablePaint_SymbolStyleLayer: Transitionable[SymbolPaintProps] = js.native
  
  @JSName("_transitioningPaint")
  var _transitioningPaint_SymbolStyleLayer: Transitioning[SymbolPaintProps] = js.native
  
  @JSName("_unevaluatedLayout")
  var _unevaluatedLayout_SymbolStyleLayer: Layout[SymbolLayoutProps] = js.native
  
  def createBucket(parameters: BucketParameters[Any]): SymbolBucket = js.native
  
  def getValueAndResolveTokens(name: Any, feature: Feature, canonical: CanonicalTileID, availableImages: js.Array[String]): Any = js.native
  
  @JSName("layout")
  var layout_SymbolStyleLayer: PossiblyEvaluated[SymbolLayoutProps, SymbolLayoutPropsPossiblyEvaluated] = js.native
  
  @JSName("paint")
  var paint_SymbolStyleLayer: PossiblyEvaluated[SymbolPaintProps, SymbolPaintPropsPossiblyEvaluated] = js.native
  
  @JSName("queryIntersectsFeature")
  def queryIntersectsFeature_MSymbolStyleLayer(): Boolean = js.native
  
  @JSName("queryRadius")
  def queryRadius_MSymbolStyleLayer(): Double = js.native
}
/* static members */
object SymbolStyleLayer {
  
  @JSImport("maplibre-gl", "SymbolStyleLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasPaintOverride(
    layout: PossiblyEvaluated[SymbolLayoutProps, SymbolLayoutPropsPossiblyEvaluated],
    propertyName: String
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPaintOverride")(layout.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
