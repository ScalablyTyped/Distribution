package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.Position
import typings.mapboxMapboxGlDraw.anon.CircleLayeridThemeLayerId
import typings.mapboxMapboxGlDraw.anon.Click
import typings.mapboxMapboxGlDraw.anon.CombineFeatures
import typings.mapboxMapboxGlDraw.anon.Disable
import typings.mapboxMapboxGlDraw.anon.FillLayeridThemeLayerId
import typings.mapboxMapboxGlDraw.anon.FineTolerance
import typings.mapboxMapboxGlDraw.anon.Interval
import typings.mapboxMapboxGlDraw.anon.IsActiveFeature
import typings.mapboxMapboxGlDraw.anon.Lat
import typings.mapboxMapboxGlDraw.anon.LineLayeridThemeLayerId
import typings.mapboxMapboxGlDraw.anon.Midpoints
import typings.mapboxMapboxGlDraw.anon.PickFeatureGeometryGeoJso
import typings.mapboxMapboxGlDraw.anon.Point
import typings.mapboxMapboxGlDraw.anon.Time
import typings.mapboxMapboxGlDraw.anon.X
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lib_ extends StObject {
  
  var CommonSelectors: IsActiveFeature = js.native
  
  def ModeHandler(mode: Any, DrawContext: Any): CombineFeatures = js.native
  
  def StringSet(): typings.mapboxMapboxGlDraw.mod.StringSet = js.native
  def StringSet(items: js.Array[String | Double]): typings.mapboxMapboxGlDraw.mod.StringSet = js.native
  
  def constrainFeatureMovement(geojsonFeatures: js.Array[DrawFeature], delta: Lat): Double = js.native
  
  def createMidPoint(parent: String, startVertex: DrawFeature, endVertex: DrawFeature): GeoJSON = js.native
  
  def createSupplementaryPoints(geojson: DrawFeature): js.Array[GeoJSON] = js.native
  def createSupplementaryPoints(geojson: DrawFeature, options: Unit, basePath: String): js.Array[GeoJSON] = js.native
  def createSupplementaryPoints(geojson: DrawFeature, options: Midpoints): js.Array[GeoJSON] = js.native
  def createSupplementaryPoints(geojson: DrawFeature, options: Midpoints, basePath: String): js.Array[GeoJSON] = js.native
  
  /**
    * Returns GeoJSON for a Point representing the
    * vertex of another feature.
    *
    * @param parentId
    * @param coordinates
    * @param path Dot-separated numbers indicating exactly
    *   where the point exists within its parent feature's coordinates.
    * @param selected
    * @return GeoJSON Point
    */
  def createVertex(parentId: String, coordinates: Position, path: String, selected: Boolean): GeoJSON = js.native
  
  // TODO: define a proper type for ctx since is not exposed correctly
  // https://github.com/mapbox/mapbox-gl-draw/issues/1156
  var doubleClickZoom: Disable = js.native
  
  def euclideanDistance(a: X, b: X): Double = js.native
  
  var featuresAt: Click = js.native
  
  def getFeatureAtAndSetCursors(event: MapMouseEvent, ctx: DrawCustomModeThis): Feature[Geometry, GeoJsonProperties] = js.native
  
  def isClick(start: Point, end: Time): Boolean = js.native
  def isClick(start: Point, end: Time, options: FineTolerance): Boolean = js.native
  
  def isEventAtCoordinates(event: MapMouseEvent, coordinates: js.Array[Position]): Boolean = js.native
  
  def isTap(start: Point, end: Time): Boolean = js.native
  def isTap(start: Point, end: Time, options: Interval): Boolean = js.native
  
  /**
    * Returns a bounding box representing the event's location.
    *
    * @param mapEvent - Mapbox GL JS map event, with a point properties.
    * @param [buffer=0]
    * @return Bounding box.
    */
  def mapEventToBoundingBox(mapEvent: MapMouseEvent): js.Array[Position] = js.native
  def mapEventToBoundingBox(mapEvent: MapMouseEvent, buffer: Double): js.Array[Position] = js.native
  def mapEventToBoundingBox(mapEvent: MapTouchEvent): js.Array[Position] = js.native
  def mapEventToBoundingBox(mapEvent: MapTouchEvent, buffer: Double): js.Array[Position] = js.native
  
  def moveFeatures(features: js.Array[DrawFeature], delta: Lat): Unit = js.native
  
  /**
    * Sort features in the following order Point: 0, LineString: 1, MultiLineString: 1,
    * Polygon: 2, then sort polygons by area ascending.
    * @param features
    */
  def sortFeatures(features: js.Array[DrawFeature]): js.Array[DrawFeature] = js.native
  
  def stringSetsAreEqual(a: js.Array[PickFeatureGeometryGeoJso], b: js.Array[PickFeatureGeometryGeoJso]): Boolean = js.native
  
  var theme: js.Array[FillLayeridThemeLayerId | LineLayeridThemeLayerId | CircleLayeridThemeLayerId] = js.native
  
  /**
    * Derive a dense array (no `undefined`s) from a single value or array.
    */
  def toDenseArray(x: Any): js.Array[NonNullable[Any]] = js.native
}
