package typings
package leafletDotMarkerclusterLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.MarkerClusterGroup")
@js.native
class MarkerClusterGroup ()
  extends leafletLib.leafletMod.FeatureGroup[js.Any] {
  /*
          * Bulk methods for adding and removing markers and should be favoured over the
          * single versions when doing bulk addition/removal of markers.
          */
  def addLayers(layers: js.Array[leafletLib.leafletMod.Layer]): this.type = js.native
  /*
          * Returns the array of total markers contained within that cluster.
          */
  def getAllChildMarkers(): js.Array[leafletLib.leafletMod.Marker[_]] = js.native
  /*
          * Returns the total number of markers contained within that cluster.
          */
  def getChildCount(): scala.Double = js.native
  /*
          * If you have a marker in your MarkerClusterGroup and you want to get the visible
          * parent of it
          */
  def getVisibleParent(marker: leafletLib.leafletMod.Marker[_]): leafletLib.leafletMod.Marker[_] = js.native
  /*
          * If you have customized the clusters icon to use some data from the contained markers,
          * and later that data changes, use this method to force a refresh of the cluster icons.
          */
  def refreshClusters(): this.type = js.native
  /*
          * If you have customized the clusters icon to use some data from the contained markers,
          * and later that data changes, use this method to force a refresh of the cluster icons.
          */
  def refreshClusters(clusters: js.Array[leafletLib.leafletMod.Marker[_]]): this.type = js.native
  /*
          * If you have customized the clusters icon to use some data from the contained markers,
          * and later that data changes, use this method to force a refresh of the cluster icons.
          */
  def refreshClusters(clusters: leafletLib.leafletMod.LayerGroup[_]): this.type = js.native
  /*
          * If you have customized the clusters icon to use some data from the contained markers,
          * and later that data changes, use this method to force a refresh of the cluster icons.
          */
  def refreshClusters(clusters: leafletLib.leafletMod.Marker[_]): this.type = js.native
  /*
          * If you have customized the clusters icon to use some data from the contained markers,
          * and later that data changes, use this method to force a refresh of the cluster icons.
          */
  def refreshClusters(clusters: org.scalablytyped.runtime.StringDictionary[leafletLib.leafletMod.Layer]): this.type = js.native
  def removeLayers(layers: js.Array[leafletLib.leafletMod.Layer]): this.type = js.native
  /*
          * Zooms to show the given marker (spiderfying if required),
          * calls the callback when the marker is visible on the map.
          */
  def zoomToShowLayer(layer: leafletLib.leafletMod.Layer): scala.Unit = js.native
  /*
          * Zooms to show the given marker (spiderfying if required),
          * calls the callback when the marker is visible on the map.
          */
  def zoomToShowLayer(layer: leafletLib.leafletMod.Layer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

