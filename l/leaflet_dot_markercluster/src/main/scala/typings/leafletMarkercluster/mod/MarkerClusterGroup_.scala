package typings.leafletMarkercluster.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Marker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "MarkerClusterGroup")
@js.native
class MarkerClusterGroup_ ()
  extends FeatureGroup_[js.Any] {
  def this(options: MarkerClusterGroupOptions) = this()
  
  /*
    * Bulk methods for adding and removing markers and should be favoured over the
    * single versions when doing bulk addition/removal of markers.
    */
  def addLayers(layers: js.Array[Layer]): this.type = js.native
  def addLayers(layers: js.Array[Layer], skipLayerAddEvent: Boolean): this.type = js.native
  
  /*
    * Returns the array of total markers contained within that cluster.
    */
  def getAllChildMarkers(): js.Array[Marker_[_]] = js.native
  
  /*
    * Returns the total number of markers contained within that cluster.
    */
  def getChildCount(): Double = js.native
  
  /*
    * If you have a marker in your MarkerClusterGroup and you want to get the visible
    * parent of it
    */
  def getVisibleParent(marker: Marker_[_]): Marker_[_] = js.native
  
  /*
    * If you have customized the clusters icon to use some data from the contained markers,
    * and later that data changes, use this method to force a refresh of the cluster icons.
    */
  def refreshClusters(): this.type = js.native
  def refreshClusters(clusters: js.Array[Marker_[_]]): this.type = js.native
  def refreshClusters(clusters: StringDictionary[Layer]): this.type = js.native
  def refreshClusters(clusters: LayerGroup_[_]): this.type = js.native
  def refreshClusters(clusters: Marker_[_]): this.type = js.native
  
  def removeLayers(layers: js.Array[Layer]): this.type = js.native
  
  /*
    * Zooms to show the given marker (spiderfying if required),
    * calls the callback when the marker is visible on the map.
    */
  def zoomToShowLayer(layer: Layer): Unit = js.native
  def zoomToShowLayer(layer: Layer, callback: js.Function0[Unit]): Unit = js.native
}
