package typings.heremaps.HNs.clusteringNs

import typings.heremaps.HNs.clusteringNs.ProviderNs.Options
import typings.heremaps.HNs.geoNs.Rect
import typings.heremaps.HNs.mapNs.DomMarker
import typings.heremaps.HNs.mapNs.Marker
import typings.heremaps.HNs.mapNs.Object
import typings.heremaps.HNs.mapNs.Spatial
import typings.heremaps.HNs.mapNs.providerNs.Invalidations
import typings.heremaps.HNs.mapNs.providerNs.Tile
import typings.heremaps.HNs.mathNs.BitMask
import typings.heremaps.HNs.utilNs.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clustering provider serves clusters and noise point representation for the map depending on the provided data set.
  * Levels for clustering as well as custom cluster representation can be set via Options.
  * @property min {number} - Minimum zoom level at which provider can cluster data
  * @property max {number} - Maximum zoom level at which provider can cluster data
  */
@JSGlobal("H.clustering.Provider")
@js.native
class Provider protected () extends EventTarget {
  /**
    * Constructor
    * @param dataPoints {Array<H.clustering.DataPoint>}
    * @param opt_options {H.clustering.Provider.Options=}
    */
  def this(dataPoints: js.Array[DataPoint]) = this()
  def this(dataPoints: js.Array[DataPoint], opt_options: Options) = this()
  var max: Double = js.native
  var min: Double = js.native
  /**
    * This method adds a data point to the provider. Beware that this method provokes reclustering of the whole data set.
    * @param dataPoint {H.clustering.DataPoint}
    */
  def addDataPoint(dataPoint: DataPoint): Unit = js.native
  /**
    * This method adds a list of data points to the provider. Beware that this method provokes reclustering of the whole data set.
    * @param dataPoints {Array<H.clustering.DataPoint>}
    */
  def addDataPoints(dataPoints: js.Array[DataPoint]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  /**
    * Returns the accumulate invalidations of this provider's objects that have occurred.
    * @returns {H.map.provider.Invalidations} - an invalidations object
    */
  def getInvalidations(): Invalidations = js.native
  /**
    * This method returns current theme used for creating cluster visualization
    * @returns {H.clustering.ITheme}
    */
  def getTheme(): ITheme = js.native
  /**
    * To signal to this provider that a map object has been changed. The method updates the Invalidations of this provider and the given map object and triggers dispatchUpdate()
    * @param mapObject {!H.map.Object} - The map object to be invalidated
    * @param changes {H.math.BitMask} - The flags indicating the types of occurred changes
    */
  def invalidateObject(mapObject: Object, changes: BitMask): Unit = js.native
  /**
    * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
    * @returns {boolean}
    */
  def providesDomMarkers(): Boolean = js.native
  /**
    * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
    * @returns {boolean}
    */
  def providesMarkers(): Boolean = js.native
  /**
    * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
    * @returns {boolean}
    */
  def providesSpatials(): Boolean = js.native
  /**
    * This method removes a data point from the provider. Beware that this method provokes reclustering of the whole data set.
    * @param dataPoint {H.clustering.DataPoint}
    */
  def removeDataPoint(dataPoint: DataPoint): Unit = js.native
  /**
    * Returns all DomMarker cluster and noise point representations which intersect with the provided rectangular area.
    * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.DomMarker>} - a list of intersecting objects
    */
  def requestDomMarkers(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[DomMarker] = js.native
  /**
    * Returns all cluster and noise point markers which intersect with the provided rectangular area.
    * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Marker>} - a list of intersecting objects
    */
  def requestMarkers(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Marker] = js.native
  /**
    * Returns all polyline, polygon, circle and rect objects which represent cluster and noise points and intersect with the provided area.
    * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
    * @param zoomLevel {number} - The zoom level for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Spatial>} - a list of intersecting objects
    */
  def requestSpatials(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
  /**
    * Returns the spatial objects which intersect the given tile
    * @param tile {H.map.provider.SpatialTile} - The tile for which the objects are requested
    * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
    * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
    * @returns {Array<H.map.Spatial>} - a list of intersecting objects
    */
  def requestSpatialsByTile(tile: Tile, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
  /**
    * This method sets new data to the provider
    * @param dataPoints {Array<H.clustering.DataPoint>}
    */
  def setDataPoints(dataPoints: js.Array[DataPoint]): Unit = js.native
  /**
    * This method sets new theme on the provider. Calling this method will change visuals for displayed clusters and noise points.
    * @param theme {H.clustering.ITheme}
    */
  def setTheme(theme: ITheme): Unit = js.native
}

