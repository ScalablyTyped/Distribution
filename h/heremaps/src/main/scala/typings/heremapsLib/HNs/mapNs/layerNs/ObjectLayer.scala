package typings
package heremapsLib.HNs.mapNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This class represents a layer which renders map objects. Spatial objects like polygons and polylines a rendered to tiles before being passed to the enigne. Point objects like markers
             * are provided as objects given an rectangular area.
             */
@JSGlobal("H.map.layer.ObjectLayer")
@js.native
class ObjectLayer protected ()
  extends Layer
     with ITileLayer {
  /**
                   * Constructor
                   * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
                   * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
                   */
  def this(provider: heremapsLib.HNs.clusteringNs.Provider) = this()
  /**
                   * Constructor
                   * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
                   * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
                   */
  def this(provider: heremapsLib.HNs.mapNs.providerNs.ObjectProvider) = this()
  /**
                   * Constructor
                   * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
                   * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
                   */
  def this(provider: heremapsLib.HNs.clusteringNs.Provider, opt_options: heremapsLib.HNs.mapNs.layerNs.ObjectLayerNs.Options) = this()
  /**
                   * Constructor
                   * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
                   * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
                   */
  def this(provider: heremapsLib.HNs.mapNs.providerNs.ObjectProvider, opt_options: heremapsLib.HNs.mapNs.layerNs.ObjectLayerNs.Options) = this()
  /**
                   * This method cancels a previously requested tile.
                   * @param x {number} - tile row position
                   * @param y {number} - tile column position
                   * @param z {number} - zoom level
                   */
  /* CompleteClass */
  override def cancelTile(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
                   * This method returns current ObjectLayer's data provider
                   * @returns {H.map.provider.ObjectProvider}
                   */
  def getProvider(): heremapsLib.HNs.mapNs.providerNs.ObjectProvider = js.native
  /**
                   * This method requests dom marker objects for provided bounding rectangle.
                   * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
                   * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
                   */
  def requestDomMarkers(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse = js.native
  /**
                   * This method requests marker objects for provided bounding rectangle.
                   * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
                   * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
                   */
  def requestMarkers(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.Response | heremapsLib.HNs.mapNs.layerNs.IMarkerLayerNs.TiledResponse = js.native
  /**
                   * To request overlay objects for the passsed bounding rectangle. It returns all overlay objects which are contained within this bounding rectangle.
                   * @param bounds {H.geo.Rect} - The bounding rectangle for which overlays are to be returned
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
                   * @returns {H.map.layer.ObjectLayer.OverlaysResponse}
                   */
  def requestOverlays(
    bounds: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.ObjectLayerNs.OverlaysResponse = js.native
  /**
                   * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
                   * @param x {number} - tile row position
                   * @param y {number} - tile column position
                   * @param z {number} - The zoom level for which the tile is requested
                   * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
                   * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
                   */
  /* CompleteClass */
  override def requestTile(x: scala.Double, y: scala.Double, z: scala.Double, cacheOnly: scala.Boolean): heremapsLib.HNs.mapNs.providerNs.Tile | scala.Unit = js.native
  /**
                   * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
                   * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
                   * @param zoomLevel {number} - The zoom level for which the tiles are requested
                   * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
                   * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
                   * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
                   */
  /* CompleteClass */
  override def requestTiles(
    boundingRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    cacheOnly: scala.Boolean,
    prioCenter: heremapsLib.HNs.mathNs.Point
  ): heremapsLib.HNs.mapNs.layerNs.ITileLayerNs.Response = js.native
}

