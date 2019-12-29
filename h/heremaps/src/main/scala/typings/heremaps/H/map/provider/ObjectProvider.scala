package typings.heremaps.H.map.provider

import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.DomMarker
import typings.heremaps.H.map.Marker
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.Object.Type
import typings.heremaps.H.map.Overlay
import typings.heremaps.H.map.Spatial
import typings.heremaps.H.map.provider.Provider.Options
import typings.heremaps.H.math.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract class to manage and provide map objects (Marker, Polyline, Polygon)
  */
@JSGlobal("H.map.provider.ObjectProvider")
@js.native
/**
  * Constructor
  * @param opt_options {H.map.provider.Provider.Options=}
  */
class ObjectProvider () extends Provider {
  def this(opt_options: Options) = this()
  /**
    * Returns the accumulate invalidations of this provider's objects that have occurred.
    * @param opt_type {H.map.Object.Type=} - The type of objects to consider for the invalidations. If undefined, all types are taken into account.
    * @returns {H.map.provider.Invalidations}
    */
  def getInvalidations(): Invalidations = js.native
  def getInvalidations(opt_type: Type): Invalidations = js.native
  /**
    * To signal to this provider that a map object has been changed. The method updates the Invalidations of this provider and the given map object and triggers dispatchUpdate()
    * @param mapObject {!H.map.Object} - The map object to be invalidated
    * @param changes {H.math.BitMask} - The flags indicating the types of occurred changes
    */
  def invalidateObject(mapObject: Object, changes: BitMask): Unit = js.native
  /**
    * Checks whether this provider is currently providing DomMarker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
    * @returns {boolean}
    */
  def providesDomMarkers(): Boolean = js.native
  /**
    * Checks whether this provider is currently providing Marker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
    * @returns {boolean}
    */
  def providesMarkers(): Boolean = js.native
  /**
    * Checks whether this provider is currently providing overlay map objects. A concrete implementation of ObjectProvider must override it if it currently provides overlays.
    * @returns {boolean}
    */
  def providesOverlays(): Boolean = js.native
  /**
    * Checks whether this provider is currently providing spatial map objects. A concrete implementation of ObjectProvider must override it if it currently provides Spatials.
    * @returns {boolean}
    */
  def providesSpatials(): Boolean = js.native
  /**
    * Returns all DomMarker map objects which intersect with the provided rectangular area.
    * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.DomMarker>} - a list of intersecting objects
    */
  def requestDomMarkers(geoRect: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[DomMarker] = js.native
  /**
    * Returns all Marker map objects which intersect with the provided rectangular area.
    * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Marker>} - a list of intersecting objects
    */
  def requestMarkers(geoRect: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Marker] = js.native
  /**
    * Returns all Overlay objects which intersect with the provided area.
    * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Overlay>} - a list of intersecting objects
    */
  def requestOverlays(geoRect: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Overlay] = js.native
  /**
    * Returns all polyline, polygon, circle and rect objects which intersect with the provided area.
    * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Spatial>} - a list of intersecting objects
    */
  def requestSpatials(geoRect: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
  /**
    * Returns the spatial objects which intersect the given tile
    * @param tile {H.map.provider.SpatialTile} - The tile for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Spatial>} - a list of intersecting objects
    */
  def requestSpatialsByTile(tile: Tile, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
}

