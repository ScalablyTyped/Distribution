package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ProgramConfigurationSet")
@js.native
open class ProgramConfigurationSet[Layer /* <: TypedStyleLayer */] protected () extends StObject {
  def this(layers: js.Array[Layer], zoom: Double) = this()
  def this(layers: js.Array[Layer], zoom: Double, filterProperties: js.Function1[/* _ */ String, Boolean]) = this()
  
  var _bufferOffset: Double = js.native
  
  var _featureMap: FeaturePositionMap = js.native
  
  def destroy(): scala.Unit = js.native
  
  def get(layerId: String): ProgramConfiguration = js.native
  
  var needsUpload: Boolean = js.native
  
  def populatePaintArrays(
    length: Double,
    feature: Feature,
    index: Double,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID
  ): scala.Unit = js.native
  def populatePaintArrays(
    length: Double,
    feature: Feature,
    index: Double,
    imagePositions: StringDictionary[ImagePosition],
    canonical: CanonicalTileID,
    formattedSection: FormattedSection
  ): scala.Unit = js.native
  
  var programConfigurations: StringDictionary[ProgramConfiguration] = js.native
  
  def updatePaintArrays(
    featureStates: FeatureStates,
    vtLayer: VectorTileLayer,
    layers: js.Array[TypedStyleLayer],
    imagePositions: StringDictionary[ImagePosition]
  ): scala.Unit = js.native
  
  def upload(context: Context): scala.Unit = js.native
}
