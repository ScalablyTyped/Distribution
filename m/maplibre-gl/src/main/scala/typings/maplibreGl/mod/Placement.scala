package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.glMatrix.mod.mat4
import typings.maplibreGl.anon.PlacedGlyphBoxes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Placement")
@js.native
open class Placement protected () extends StObject {
  def this(transform: Transform, terrain: Terrain, fadeDuration: Double, crossSourceCollisions: Boolean) = this()
  def this(
    transform: Transform,
    terrain: Terrain,
    fadeDuration: Double,
    crossSourceCollisions: Boolean,
    prevPlacement: Placement
  ) = this()
  
  def attemptAnchorPlacement(
    anchor: TextAnchor,
    textBox: SingleCollisionBox,
    width: Double,
    height: Double,
    textBoxScale: Double,
    rotateWithMap: Boolean,
    pitchWithMap: Boolean,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroup: CollisionGroup,
    textOverlapMode: OverlapMode,
    symbolInstance: SymbolInstance,
    bucket: SymbolBucket,
    orientation: Double
  ): PlacedGlyphBoxes = js.native
  def attemptAnchorPlacement(
    anchor: TextAnchor,
    textBox: SingleCollisionBox,
    width: Double,
    height: Double,
    textBoxScale: Double,
    rotateWithMap: Boolean,
    pitchWithMap: Boolean,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroup: CollisionGroup,
    textOverlapMode: OverlapMode,
    symbolInstance: SymbolInstance,
    bucket: SymbolBucket,
    orientation: Double,
    iconBox: Null,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): PlacedGlyphBoxes = js.native
  def attemptAnchorPlacement(
    anchor: TextAnchor,
    textBox: SingleCollisionBox,
    width: Double,
    height: Double,
    textBoxScale: Double,
    rotateWithMap: Boolean,
    pitchWithMap: Boolean,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroup: CollisionGroup,
    textOverlapMode: OverlapMode,
    symbolInstance: SymbolInstance,
    bucket: SymbolBucket,
    orientation: Double,
    iconBox: scala.Unit,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): PlacedGlyphBoxes = js.native
  def attemptAnchorPlacement(
    anchor: TextAnchor,
    textBox: SingleCollisionBox,
    width: Double,
    height: Double,
    textBoxScale: Double,
    rotateWithMap: Boolean,
    pitchWithMap: Boolean,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroup: CollisionGroup,
    textOverlapMode: OverlapMode,
    symbolInstance: SymbolInstance,
    bucket: SymbolBucket,
    orientation: Double,
    iconBox: SingleCollisionBox
  ): PlacedGlyphBoxes = js.native
  def attemptAnchorPlacement(
    anchor: TextAnchor,
    textBox: SingleCollisionBox,
    width: Double,
    height: Double,
    textBoxScale: Double,
    rotateWithMap: Boolean,
    pitchWithMap: Boolean,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroup: CollisionGroup,
    textOverlapMode: OverlapMode,
    symbolInstance: SymbolInstance,
    bucket: SymbolBucket,
    orientation: Double,
    iconBox: SingleCollisionBox,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): PlacedGlyphBoxes = js.native
  
  var collisionCircleArrays: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in any ]: maplibre-gl.maplibre-gl.CollisionCircleArray} */ js.Any = js.native
  
  var collisionGroups: CollisionGroups = js.native
  
  var collisionIndex: CollisionIndex = js.native
  
  def commit(now: Double): scala.Unit = js.native
  
  var commitTime: Double = js.native
  
  var fadeDuration: Double = js.native
  
  def getBucketParts(results: js.Array[BucketPart], styleLayer: StyleLayer, tile: Tile, sortAcrossTiles: Boolean): scala.Unit = js.native
  
  def hasTransitions(now: Double): Boolean = js.native
  
  var lastPlacementChangeTime: Double = js.native
  
  def markUsedJustification(
    bucket: SymbolBucket,
    placedAnchor: TextAnchor,
    symbolInstance: SymbolInstance,
    orientation: Double
  ): scala.Unit = js.native
  
  def markUsedOrientation(bucket: SymbolBucket, orientation: Double, symbolInstance: SymbolInstance): scala.Unit = js.native
  
  var opacities: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in maplibre-gl.maplibre-gl.CrossTileID ]: maplibre-gl.maplibre-gl.JointOpacityState} */ js.Any = js.native
  
  def placeLayerBucketPart(
    bucketPart: BucketPart,
    seenCrossTileIDs: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in string | number ]: boolean} */ js.Any,
    showCollisionBoxes: Boolean
  ): scala.Unit = js.native
  
  var placedOrientations: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in maplibre-gl.maplibre-gl.CrossTileID ]: number} */ js.Any = js.native
  
  var placements: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in maplibre-gl.maplibre-gl.CrossTileID ]: maplibre-gl.maplibre-gl.JointPlacement} */ js.Any = js.native
  
  var prevPlacement: Placement = js.native
  
  var prevZoomAdjustment: Double = js.native
  
  var retainedQueryData: NumberDictionary[RetainedQueryData] = js.native
  
  def setStale(): scala.Unit = js.native
  
  var stale: Boolean = js.native
  
  def stillRecent(now: Double, zoom: Double): Boolean = js.native
  
  def symbolFadeChange(now: Double): Double = js.native
  
  var terrain: Terrain = js.native
  
  var transform: Transform = js.native
  
  def updateBucketOpacities(
    bucket: SymbolBucket,
    seenCrossTileIDs: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in string | number ]: boolean} */ js.Any
  ): scala.Unit = js.native
  def updateBucketOpacities(
    bucket: SymbolBucket,
    seenCrossTileIDs: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in string | number ]: boolean} */ js.Any,
    collisionBoxArray: CollisionBoxArray
  ): scala.Unit = js.native
  
  def updateLayerOpacities(styleLayer: StyleLayer, tiles: js.Array[Tile]): scala.Unit = js.native
  
  var variableOffsets: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in maplibre-gl.maplibre-gl.CrossTileID ]: maplibre-gl.maplibre-gl.VariableOffset} */ js.Any = js.native
  
  def zoomAdjustment(zoom: Double): Double = js.native
  
  var zoomAtLastRecencyCheck: Double = js.native
}
