package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.mapboxVectorTile.mod.VectorTileFeature
import typings.mapboxVectorTile.mod.VectorTileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FeatureIndex")
@js.native
open class FeatureIndex protected () extends StObject {
  def this(tileID: OverscaledTileID) = this()
  def this(tileID: OverscaledTileID, promoteId: PromoteIdSpecification) = this()
  
  var bucketLayerIDs: js.Array[js.Array[String]] = js.native
  
  var featureIndexArray: FeatureIndexArray = js.native
  
  def getId(feature: VectorTileFeature, sourceLayerId: String): String | Double = js.native
  
  var grid: TransferableGridIndex = js.native
  
  var grid3D: TransferableGridIndex = js.native
  
  def hasLayer(id: String): Boolean = js.native
  
  def insert(
    feature: VectorTileFeature,
    geometry: js.Array[js.Array[^]],
    featureIndex: Double,
    sourceLayerIndex: Double,
    bucketIndex: Double
  ): scala.Unit = js.native
  def insert(
    feature: VectorTileFeature,
    geometry: js.Array[js.Array[^]],
    featureIndex: Double,
    sourceLayerIndex: Double,
    bucketIndex: Double,
    is3D: Boolean
  ): scala.Unit = js.native
  
  def loadMatchingFeature(
    result: StringDictionary[js.Array[typings.maplibreGl.anon.FeatureIndex]],
    bucketIndex: Double,
    sourceLayerIndex: Double,
    featureIndex: Double,
    filter: FeatureFilter,
    filterLayerIDs: js.Array[String],
    availableImages: js.Array[String],
    styleLayers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any]
  ): scala.Unit = js.native
  def loadMatchingFeature(
    result: StringDictionary[js.Array[typings.maplibreGl.anon.FeatureIndex]],
    bucketIndex: Double,
    sourceLayerIndex: Double,
    featureIndex: Double,
    filter: FeatureFilter,
    filterLayerIDs: js.Array[String],
    availableImages: js.Array[String],
    styleLayers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any],
    sourceFeatureState: scala.Unit,
    intersectionTest: js.Function4[
      /* feature */ VectorTileFeature, 
      /* styleLayer */ StyleLayer, 
      /* featureState */ Any, 
      /* id */ String | Double | scala.Unit, 
      Boolean | Double
    ]
  ): scala.Unit = js.native
  def loadMatchingFeature(
    result: StringDictionary[js.Array[typings.maplibreGl.anon.FeatureIndex]],
    bucketIndex: Double,
    sourceLayerIndex: Double,
    featureIndex: Double,
    filter: FeatureFilter,
    filterLayerIDs: js.Array[String],
    availableImages: js.Array[String],
    styleLayers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any],
    sourceFeatureState: SourceFeatureState
  ): scala.Unit = js.native
  def loadMatchingFeature(
    result: StringDictionary[js.Array[typings.maplibreGl.anon.FeatureIndex]],
    bucketIndex: Double,
    sourceLayerIndex: Double,
    featureIndex: Double,
    filter: FeatureFilter,
    filterLayerIDs: js.Array[String],
    availableImages: js.Array[String],
    styleLayers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any],
    sourceFeatureState: SourceFeatureState,
    intersectionTest: js.Function4[
      /* feature */ VectorTileFeature, 
      /* styleLayer */ StyleLayer, 
      /* featureState */ Any, 
      /* id */ String | Double | scala.Unit, 
      Boolean | Double
    ]
  ): scala.Unit = js.native
  
  def loadVTLayers(): StringDictionary[VectorTileLayer] = js.native
  
  def lookupSymbolFeatures(
    symbolFeatureIndexes: js.Array[Double],
    serializedLayers: StringDictionary[StyleLayer],
    bucketIndex: Double,
    sourceLayerIndex: Double,
    filterSpec: FilterSpecification,
    filterLayerIDs: js.Array[String],
    availableImages: js.Array[String],
    styleLayers: StringDictionary[StyleLayer]
  ): js.Object = js.native
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  
  def query(
    args: QueryParameters,
    styleLayers: StringDictionary[StyleLayer],
    serializedLayers: StringDictionary[Any],
    sourceFeatureState: SourceFeatureState
  ): StringDictionary[js.Array[typings.maplibreGl.anon.Feature]] = js.native
  
  var rawTileData: js.typedarray.ArrayBuffer = js.native
  
  var sourceLayerCoder: DictionaryCoder = js.native
  
  var tileID: OverscaledTileID = js.native
  
  var vtLayers: StringDictionary[VectorTileLayer] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
