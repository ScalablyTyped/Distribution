package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Box
import typings.maplibreGl.anon.Circles
import typings.maplibreGl.anon.PerspectiveRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CollisionIndex")
@js.native
open class CollisionIndex protected () extends StObject {
  def this(transform: Transform) = this()
  def this(transform: Transform, grid: GridIndex[FeatureKey]) = this()
  def this(transform: Transform, grid: scala.Unit, ignoredGrid: GridIndex[FeatureKey]) = this()
  def this(transform: Transform, grid: GridIndex[FeatureKey], ignoredGrid: GridIndex[FeatureKey]) = this()
  
  def getViewportMatrix(): mat4 = js.native
  
  var grid: GridIndex[FeatureKey] = js.native
  
  var gridBottomBoundary: Double = js.native
  
  var gridRightBoundary: Double = js.native
  
  var ignoredGrid: GridIndex[FeatureKey] = js.native
  
  def insertCollisionBox(
    collisionBox: js.Array[Double],
    overlapMode: OverlapMode,
    ignorePlacement: Boolean,
    bucketInstanceId: Double,
    featureIndex: Double,
    collisionGroupID: Double
  ): scala.Unit = js.native
  
  def insertCollisionCircles(
    collisionCircles: js.Array[Double],
    overlapMode: OverlapMode,
    ignorePlacement: Boolean,
    bucketInstanceId: Double,
    featureIndex: Double,
    collisionGroupID: Double
  ): scala.Unit = js.native
  
  def isInsideGrid(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  def isOffscreen(x1: Double, y1: Double, x2: Double, y2: Double): Boolean = js.native
  
  var perspectiveRatioCutoff: Double = js.native
  
  var pitchfactor: Double = js.native
  
  def placeCollisionBox(
    collisionBox: SingleCollisionBox,
    overlapMode: OverlapMode,
    textPixelRatio: Double,
    posMatrix: mat4
  ): Box = js.native
  def placeCollisionBox(
    collisionBox: SingleCollisionBox,
    overlapMode: OverlapMode,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroupPredicate: js.Function1[/* key */ FeatureKey, Boolean]
  ): Box = js.native
  def placeCollisionBox(
    collisionBox: SingleCollisionBox,
    overlapMode: OverlapMode,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroupPredicate: js.Function1[/* key */ FeatureKey, Boolean],
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Box = js.native
  def placeCollisionBox(
    collisionBox: SingleCollisionBox,
    overlapMode: OverlapMode,
    textPixelRatio: Double,
    posMatrix: mat4,
    collisionGroupPredicate: scala.Unit,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Box = js.native
  
  def placeCollisionCircles(
    overlapMode: OverlapMode,
    symbol: Any,
    lineVertexArray: SymbolLineVertexArray,
    glyphOffsetArray: GlyphOffsetArray,
    fontSize: Double,
    posMatrix: mat4,
    labelPlaneMatrix: mat4,
    labelToScreenMatrix: mat4,
    showCollisionCircles: Boolean,
    pitchWithMap: Boolean,
    collisionGroupPredicate: js.Function1[/* key */ FeatureKey, Boolean],
    circlePixelDiameter: Double,
    textPixelPadding: Double,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Circles = js.native
  
  def projectAndGetPerspectiveRatio(posMatrix: mat4, x: Double, y: Double): PerspectiveRatio = js.native
  def projectAndGetPerspectiveRatio(
    posMatrix: mat4,
    x: Double,
    y: Double,
    getElevation: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): PerspectiveRatio = js.native
  
  /**
  	 * Because the geometries in the CollisionIndex are an approximation of the shape of
  	 * symbols on the map, we use the CollisionIndex to look up the symbol part of
  	 * `queryRenderedFeatures`.
  	 *
  	 * @private
  	 */
  def queryRenderedSymbols(viewportQueryGeometry: js.Array[^]): js.Object = js.native
  
  var screenBottomBoundary: Double = js.native
  
  var screenRightBoundary: Double = js.native
  
  var transform: Transform = js.native
}
