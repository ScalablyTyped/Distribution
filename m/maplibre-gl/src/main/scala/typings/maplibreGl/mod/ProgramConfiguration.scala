package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ProgramConfiguration")
@js.native
open class ProgramConfiguration protected () extends StObject {
  def this(layer: TypedStyleLayer, zoom: Double, filterProperties: js.Function1[/* _ */ String, Boolean]) = this()
  
  var _buffers: js.Array[VertexBuffer] = js.native
  
  var binders: StringDictionary[AttributeBinder | UniformBinder] = js.native
  
  var cacheKey: String = js.native
  
  def defines(): js.Array[String] = js.native
  
  def destroy(): scala.Unit = js.native
  
  def getBinderAttributes(): js.Array[String] = js.native
  
  def getBinderUniforms(): js.Array[String] = js.native
  
  def getMaxValue(property: String): Double = js.native
  
  def getPaintVertexBuffers(): js.Array[VertexBuffer] = js.native
  
  def getUniforms(context: Context, locations: UniformLocations): js.Array[BinderUniform] = js.native
  
  def populatePaintArrays(newLength: Double, feature: Feature, imagePositions: StringDictionary[ImagePosition]): scala.Unit = js.native
  def populatePaintArrays(
    newLength: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: scala.Unit,
    formattedSection: FormattedSection
  ): scala.Unit = js.native
  def populatePaintArrays(
    newLength: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID
  ): scala.Unit = js.native
  def populatePaintArrays(
    newLength: Double,
    feature: Feature,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID,
    formattedSection: FormattedSection
  ): scala.Unit = js.native
  
  def setConstantPatternPositions(posTo: ImagePosition, posFrom: ImagePosition): scala.Unit = js.native
  
  def setUniforms(
    context: Context,
    binderUniforms: js.Array[BinderUniform],
    properties: Any,
    globals: GlobalProperties
  ): scala.Unit = js.native
  
  def updatePaintArrays(
    featureStates: FeatureStates,
    featureMap: FeaturePositionMap,
    vtLayer: VectorTileLayer,
    layer: TypedStyleLayer,
    imagePositions: StringDictionary[ImagePosition]
  ): Boolean = js.native
  
  def updatePaintBuffers(): scala.Unit = js.native
  def updatePaintBuffers(crossfade: CrossfadeParameters): scala.Unit = js.native
  
  def upload(context: Context): scala.Unit = js.native
}
