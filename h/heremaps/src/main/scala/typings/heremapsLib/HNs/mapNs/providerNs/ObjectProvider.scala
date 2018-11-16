package typings
package heremapsLib.HNs.mapNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * An abstract class to manage and provide map objects (Marker, Polyline, Polygon)
             */
@JSGlobal("H.map.provider.ObjectProvider")
@js.native
class ObjectProvider () extends Provider {
  /**
                   * Constructor
                   * @param opt_options {H.map.provider.Provider.Options=}
                   */
  def this(opt_options: heremapsLib.HNs.mapNs.providerNs.ProviderNs.Options) = this()
  /**
                   * Returns the accumulate invalidations of this provider's objects that have occurred.
                   * @param opt_type {H.map.Object.Type=} - The type of objects to consider for the invalidations. If undefined, all types are taken into account.
                   * @returns {H.map.provider.Invalidations}
                   */
  def getInvalidations(): Invalidations = js.native
  /**
                   * Returns the accumulate invalidations of this provider's objects that have occurred.
                   * @param opt_type {H.map.Object.Type=} - The type of objects to consider for the invalidations. If undefined, all types are taken into account.
                   * @returns {H.map.provider.Invalidations}
                   */
  def getInvalidations(opt_type: heremapsLib.HNs.mapNs.ObjectNs.Type): Invalidations = js.native
  /**
                   * To signal to this provider that a map object has been changed. The method updates the Invalidations of this provider and the given map object and triggers dispatchUpdate()
                   * @param mapObject {!H.map.Object} - The map object to be invalidated
                   * @param changes {H.math.BitMask} - The flags indicating the types of occurred changes
                   */
  def invalidateObject(mapObject: heremapsLib.HNs.mapNs.Object, changes: heremapsLib.HNs.mathNs.BitMask): scala.Unit = js.native
  /**
                   * Checks whether this provider is currently providing DomMarker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
                   * @returns {boolean}
                   */
  def providesDomMarkers(): scala.Boolean = js.native
  /**
                   * Checks whether this provider is currently providing Marker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
                   * @returns {boolean}
                   */
  def providesMarkers(): scala.Boolean = js.native
  /**
                   * Checks whether this provider is currently providing overlay map objects. A concrete implementation of ObjectProvider must override it if it currently provides overlays.
                   * @returns {boolean}
                   */
  def providesOverlays(): scala.Boolean = js.native
  /**
                   * Checks whether this provider is currently providing spatial map objects. A concrete implementation of ObjectProvider must override it if it currently provides Spatials.
                   * @returns {boolean}
                   */
  def providesSpatials(): scala.Boolean = js.native
  /**
                   * Returns all DomMarker map objects which intersect with the provided rectangular area.
                   * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @returns {Array<H.map.DomMarker>} - a list of intersecting objects
                   */
  def requestDomMarkers(
    geoRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    visiblesOnly: scala.Boolean,
    cacheOnly: scala.Boolean
  ): js.Array[heremapsLib.HNs.mapNs.DomMarker] = js.native
  /**
                   * Returns all Marker map objects which intersect with the provided rectangular area.
                   * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @returns {Array<H.map.Marker>} - a list of intersecting objects
                   */
  def requestMarkers(
    geoRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    visiblesOnly: scala.Boolean,
    cacheOnly: scala.Boolean
  ): js.Array[heremapsLib.HNs.mapNs.Marker] = js.native
  /**
                   * Returns all Overlay objects which intersect with the provided area.
                   * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @returns {Array<H.map.Overlay>} - a list of intersecting objects
                   */
  def requestOverlays(
    geoRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    visiblesOnly: scala.Boolean,
    cacheOnly: scala.Boolean
  ): js.Array[heremapsLib.HNs.mapNs.Overlay] = js.native
  /**
                   * Returns all polyline, polygon, circle and rect objects which intersect with the provided area.
                   * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
                   * @param zoomLevel {number} - The zoom level for which the objects are requested
                   * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @returns {Array<H.map.Spatial>} - a list of intersecting objects
                   */
  def requestSpatials(
    geoRect: heremapsLib.HNs.geoNs.Rect,
    zoomLevel: scala.Double,
    visiblesOnly: scala.Boolean,
    cacheOnly: scala.Boolean
  ): js.Array[heremapsLib.HNs.mapNs.Spatial] = js.native
  /**
                   * Returns the spatial objects which intersect the given tile
                   * @param tile {H.map.provider.SpatialTile} - The tile for which the objects are requested
                   * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
                   * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
                   * @returns {Array<H.map.Spatial>} - a list of intersecting objects
                   */
  def requestSpatialsByTile(tile: Tile, visiblesOnly: scala.Boolean, cacheOnly: scala.Boolean): js.Array[heremapsLib.HNs.mapNs.Spatial] = js.native
}

