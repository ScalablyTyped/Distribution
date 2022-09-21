package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glMatrix.mod.mat2
import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Altitude
import typings.maplibreGl.anon.Maxzoom
import typings.maplibreGl.anon.RoundZoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Transform")
@js.native
open class Transform () extends StObject {
  def this(minZoom: Double) = this()
  def this(minZoom: Double, maxZoom: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: Double) = this()
  def this(minZoom: Double, maxZoom: Double, minPitch: Double) = this()
  def this(minZoom: Double, maxZoom: scala.Unit, minPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: Double, minPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: scala.Unit, minPitch: Double) = this()
  def this(minZoom: Double, maxZoom: Double, minPitch: Double, maxPitch: Double) = this()
  def this(minZoom: Double, maxZoom: Double, minPitch: scala.Unit, maxPitch: Double) = this()
  def this(minZoom: Double, maxZoom: scala.Unit, minPitch: Double, maxPitch: Double) = this()
  def this(minZoom: Double, maxZoom: scala.Unit, minPitch: scala.Unit, maxPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: Double, minPitch: Double, maxPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: Double, minPitch: scala.Unit, maxPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: scala.Unit, minPitch: Double, maxPitch: Double) = this()
  def this(minZoom: scala.Unit, maxZoom: scala.Unit, minPitch: scala.Unit, maxPitch: Double) = this()
  def this(minZoom: Double, maxZoom: Double, minPitch: Double, maxPitch: Double, renderWorldCopies: Boolean) = this()
  def this(
    minZoom: Double,
    maxZoom: Double,
    minPitch: Double,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: Double,
    minPitch: scala.Unit,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: Double,
    minPitch: scala.Unit,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: scala.Unit,
    minPitch: Double,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: scala.Unit,
    minPitch: Double,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: scala.Unit,
    minPitch: scala.Unit,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: Double,
    maxZoom: scala.Unit,
    minPitch: scala.Unit,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: Double,
    minPitch: Double,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: Double,
    minPitch: Double,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: Double,
    minPitch: scala.Unit,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: Double,
    minPitch: scala.Unit,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: scala.Unit,
    minPitch: Double,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: scala.Unit,
    minPitch: Double,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: scala.Unit,
    minPitch: scala.Unit,
    maxPitch: Double,
    renderWorldCopies: Boolean
  ) = this()
  def this(
    minZoom: scala.Unit,
    maxZoom: scala.Unit,
    minPitch: scala.Unit,
    maxPitch: scala.Unit,
    renderWorldCopies: Boolean
  ) = this()
  
  var _alignedPosMatrixCache: StringDictionary[mat4] = js.native
  
  def _calcMatrices(): scala.Unit = js.native
  
  var _center: LngLat = js.native
  
  def _constrain(): scala.Unit = js.native
  
  var _constraining: Boolean = js.native
  
  var _edgeInsets: EdgeInsets = js.native
  
  var _elevation: Double = js.native
  
  var _fov: Double = js.native
  
  var _maxPitch: Double = js.native
  
  var _maxZoom: Double = js.native
  
  var _minPitch: Double = js.native
  
  var _minZoom: Double = js.native
  
  var _pitch: Double = js.native
  
  var _pixelPerMeter: Double = js.native
  
  var _posMatrixCache: StringDictionary[mat4] = js.native
  
  var _renderWorldCopies: Boolean = js.native
  
  var _unmodified: Boolean = js.native
  
  var _zoom: Double = js.native
  
  var alignedProjMatrix: mat4 = js.native
  
  var angle: Double = js.native
  
  def bearing: Double = js.native
  def bearing_=(bearing: Double): scala.Unit = js.native
  
  /**
  	 * Calculate the posMatrix that, given a tile coordinate, would be used to display the tile on a map.
  	 * @param {UnwrappedTileID} unwrappedTileID;
  	 * @private
  	 */
  def calculatePosMatrix(unwrappedTileID: UnwrappedTileID): mat4 = js.native
  def calculatePosMatrix(unwrappedTileID: UnwrappedTileID, aligned: Boolean): mat4 = js.native
  
  var cameraToCenterDistance: Double = js.native
  
  var cameraToSeaLevelDistance: Double = js.native
  
  def center: LngLat = js.native
  
  def centerOffset: ^ = js.native
  
  /**
  	 * The center of the screen in pixels with the top-left corner being (0,0)
  	 * and +y axis pointing downwards. This accounts for padding.
  	 *
  	 * @readonly
  	 * @type {Point}
  	 * @memberof Transform
  	 */
  def centerPoint: ^ = js.native
  
  def center_=(center: LngLat): scala.Unit = js.native
  
  /**
  	 * Given a Coordinate, return its geographical position.
  	 * @param {Coordinate} coord
  	 * @returns {LngLat} lnglat
  	 * @private
  	 */
  def coordinateLocation(coord: MercatorCoordinate): LngLat = js.native
  
  /**
  	 * Given a coordinate, return the screen point that corresponds to it
  	 * @param {Coordinate} coord
  	 * @param {number} elevation default = 0
  	 * @param {mat4} pixelMatrix, default = this.pixelMatrix
  	 * @returns {Point} screen point
  	 * @private
  	 */
  def coordinatePoint(coord: MercatorCoordinate): ^ = js.native
  def coordinatePoint(coord: MercatorCoordinate, elevation: Double): ^ = js.native
  def coordinatePoint(coord: MercatorCoordinate, elevation: Double, pixelMatrix: mat4): ^ = js.native
  def coordinatePoint(coord: MercatorCoordinate, elevation: scala.Unit, pixelMatrix: mat4): ^ = js.native
  
  /**
  	 * Return all coordinates that could cover this transform for a covering
  	 * zoom level.
  	 * @param {Object} options
  	 * @param {number} options.tileSize
  	 * @param {number} options.minzoom
  	 * @param {number} options.maxzoom
  	 * @param {boolean} options.roundZoom
  	 * @param {boolean} options.reparseOverscaled
  	 * @param {boolean} options.renderWorldCopies
  	 * @returns {Array<OverscaledTileID>} OverscaledTileIDs
  	 * @private
  	 */
  def coveringTiles(options: Maxzoom): js.Array[OverscaledTileID] = js.native
  
  /**
  	 * Return a zoom level that will cover all tiles the transform
  	 * @param {Object} options options
  	 * @param {number} options.tileSize Tile size, expressed in screen pixels.
  	 * @param {boolean} options.roundZoom Target zoom level. If true, the value will be rounded to the closest integer. Otherwise the value will be floored.
  	 * @returns {number} zoom level An integer zoom level at which all tiles will be visible.
  	 */
  def coveringZoomLevel(options: RoundZoom): Double = js.native
  
  def customLayerMatrix(): mat4 = js.native
  
  def elevation: Double = js.native
  def elevation_=(elevation: Double): scala.Unit = js.native
  
  def fov: Double = js.native
  def fov_=(fov: Double): scala.Unit = js.native
  
  var freezeElevation: Boolean = js.native
  
  /**
  	 * Returns the map's geographical bounds. When the bearing or pitch is non-zero, the visible region is not
  	 * an axis-aligned rectangle, and the result is the smallest bounds that encompasses the visible region.
  	 * @returns {LngLatBounds} Returns a {@link LngLatBounds} object describing the map's geographical bounds.
  	 */
  def getBounds(): LngLatBounds = js.native
  
  def getCameraPoint(): ^ = js.native
  
  /**
  	 * get the camera position in LngLat and altitudes in meter
  	 * @returns {Object} An object with lngLat & altitude.
  	 */
  def getCameraPosition(): Altitude = js.native
  
  def getCameraQueryGeometry(queryGeometry: js.Array[^]): js.Array[^] = js.native
  
  /**
  	 * get the elevation from terrain for the current zoomlevel.
  	 * @param lnglat the location
  	 * @param terrain the terrain
  	 * @returns {number} elevation in meters
  	 */
  def getElevation(lnglat: LngLat, terrain: Terrain): Double = js.native
  
  /**
  	 * Calculate pixel height of the visible horizon in relation to map-center (e.g. height/2),
  	 * multiplied by a static factor to simulate the earth-radius.
  	 * The calculated value is the horizontal line from the camera-height to sea-level.
  	 * @returns {number} Horizon above center in pixels.
  	 */
  def getHorizon(): Double = js.native
  
  /**
  	 * Returns the maximum geographical bounds the map is constrained to, or `null` if none set.
  	 * @returns {LngLatBounds} {@link LngLatBounds}
  	 */
  def getMaxBounds(): LngLatBounds | Null = js.native
  
  /**
  	 * Return any "wrapped" copies of a given tile coordinate that are visible
  	 * in the current view.
  	 *
  	 * @private
  	 */
  def getVisibleUnwrappedCoordinates(tileID: CanonicalTileID): js.Array[UnwrappedTileID] = js.native
  
  var glCoordMatrix: mat4 = js.native
  
  var height: Double = js.native
  
  /**
  	 * Helper method to upadte edge-insets inplace
  	 *
  	 * @param {PaddingOptions} start the starting padding
  	 * @param {PaddingOptions} target the target padding
  	 * @param {number} t the step/weight
  	 * @memberof Transform
  	 */
  def interpolatePadding(start: PaddingOptions, target: PaddingOptions, t: Double): scala.Unit = js.native
  
  var invProjMatrix: mat4 = js.native
  
  /**
  	 * Returns if the padding params match
  	 *
  	 * @param {PaddingOptions} padding the padding to check against
  	 * @returns {boolean} true if they are equal, false otherwise
  	 * @memberof Transform
  	 */
  def isPaddingEqual(padding: PaddingOptions): Boolean = js.native
  
  var labelPlaneMatrix: mat4 = js.native
  
  var latRange: js.Tuple2[Double, Double] = js.native
  
  var lngRange: js.Tuple2[Double, Double] = js.native
  
  /**
  	 * Given a geographical lnglat, return an unrounded
  	 * coordinate that represents it at this transform's zoom level.
  	 * @param {LngLat} lnglat
  	 * @returns {MercatorCoordinate}
  	 * @private
  	 */
  def locationCoordinate(lnglat: LngLat): MercatorCoordinate = js.native
  
  /**
  	 * Given a location, return the screen point that corresponds to it
  	 * @param {LngLat} lnglat location
  	 * @param {Terrain} terrain optional terrain
  	 * @returns {Point} screen point
  	 * @private
  	 */
  def locationPoint(lnglat: LngLat): ^ = js.native
  def locationPoint(lnglat: LngLat, terrain: Terrain): ^ = js.native
  
  def maxPitch: Double = js.native
  
  def maxPitchScaleFactor(): Double = js.native
  
  def maxPitch_=(pitch: Double): scala.Unit = js.native
  
  var maxValidLatitude: Double = js.native
  
  def maxZoom: Double = js.native
  def maxZoom_=(zoom: Double): scala.Unit = js.native
  
  var mercatorMatrix: mat4 = js.native
  
  def minPitch: Double = js.native
  def minPitch_=(pitch: Double): scala.Unit = js.native
  
  def minZoom: Double = js.native
  def minZoom_=(zoom: Double): scala.Unit = js.native
  
  def padding: PaddingOptions = js.native
  def padding_=(padding: PaddingOptions): scala.Unit = js.native
  
  def pitch: Double = js.native
  def pitch_=(pitch: Double): scala.Unit = js.native
  
  var pixelMatrix: mat4 = js.native
  
  var pixelMatrix3D: mat4 = js.native
  
  var pixelMatrixInverse: mat4 = js.native
  
  var pixelsToGLUnits: js.Tuple2[Double, Double] = js.native
  
  def point: ^ = js.native
  
  /**
  	 * Given a Point, return its mercator coordinate.
  	 * @param {Point} p the point
  	 * @param {Terrain} terrain optional terrain
  	 * @returns {LngLat} lnglat
  	 * @private
  	 */
  def pointCoordinate(p: ^): MercatorCoordinate = js.native
  def pointCoordinate(p: ^, terrain: Terrain): MercatorCoordinate = js.native
  
  /**
  	 * Given a point on screen, return its lnglat
  	 * @param {Point} p screen point
  	 * @param {Terrain} terrain optional terrain
  	 * @returns {LngLat} lnglat location
  	 * @private
  	 */
  def pointLocation(p: ^): LngLat = js.native
  def pointLocation(p: ^, terrain: Terrain): LngLat = js.native
  
  var projMatrix: mat4 = js.native
  
  def project(lnglat: LngLat): ^ = js.native
  
  /**
  	 * This method works in combination with freezeElevation activated.
  	 * freezeElevtion is enabled during map-panning because during this the camera should sit in constant height.
  	 * After panning finished, call this method to recalculate the zoomlevel for the current camera-height in current terrain.
  	 * @param {Terrain} terrain the terrain
  	 */
  def recalculateZoom(terrain: Terrain): scala.Unit = js.native
  
  def renderWorldCopies: Boolean = js.native
  def renderWorldCopies_=(renderWorldCopies: Boolean): scala.Unit = js.native
  
  def resize(width: Double, height: Double): scala.Unit = js.native
  
  var rotationMatrix: mat2 = js.native
  
  var scale: Double = js.native
  
  def scaleZoom(scale: Double): Double = js.native
  
  def setLocationAtPoint(lnglat: LngLat, point: ^): scala.Unit = js.native
  
  /**
  	 * Sets or clears the map's geographical constraints.
  	 * @param {LngLatBounds} bounds A {@link LngLatBounds} object describing the new geographic boundaries of the map.
  	 */
  def setMaxBounds(): scala.Unit = js.native
  def setMaxBounds(bounds: LngLatBounds): scala.Unit = js.native
  
  def size: ^ = js.native
  
  var tileSize: Double = js.native
  
  var tileZoom: Double = js.native
  
  def unmodified: Boolean = js.native
  
  def unproject(point: ^): LngLat = js.native
  
  /**
  	 * Updates the center-elevation value unless freezeElevation is activated.
  	 * @param terrain the terrain
  	 */
  def updateElevation(): scala.Unit = js.native
  def updateElevation(terrain: Terrain): scala.Unit = js.native
  
  var width: Double = js.native
  
  def worldSize: Double = js.native
  
  def zoom: Double = js.native
  
  var zoomFraction: Double = js.native
  
  def zoomScale(zoom: Double): Double = js.native
  
  def zoom_=(zoom: Double): scala.Unit = js.native
}
