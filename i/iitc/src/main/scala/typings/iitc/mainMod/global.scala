package typings.iitc.mainMod

import typings.iitc.iitctypesMod.IITC.PortalOptions
import typings.iitc.iitctypesMod.PortalGUID
import typings.iitc.inteltypesMod.Intel.PlayerInfo
import typings.iitc.mapDataRequestMod.MapDataRequest
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Marker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var DEFAULT_MAX_IDLE_TIME: Double = js.native
  
  var DEFAULT_REFRESH: Double = js.native
  
  /** Info about current player/agent */
  var PLAYER: PlayerInfo = js.native
  
  /** add Layergroup to leaflets layer-chooser */
  def addLayerGroup(name: String, layer: LayerGroup_[_], defaultVisibile: Boolean): Unit = js.native
  def addLayerGroup(name: String, layer: LayerGroup_[_], defaultVisibile: Boolean, groupname: String): Unit = js.native
  
  /** iitc-Pluigns setup/initialize function */
  var bootPlugins: js.Array[BootCallback] = js.native
  
  /** Create Portal-Marker */
  def createMarker(position: LatLng_, options: PortalOptions): CircleMarker_[_] = js.native
  
  var currentPane: String = js.native
  
  /** escape Html string */
  def escapeHtmlSpecialChars(name: String): String = js.native
  
  /** google-api */
  var gapi: js.Any = js.native
  
  /** if true iitc main script was already loaded (plugin need to trigger setup on iths own) */
  var iitcLoaded: Boolean = js.native
  
  /** get layer visiblity */
  def isLayerGroupDisplayed(name: String): Boolean = js.native
  def isLayerGroupDisplayed(name: String, defaultDisplay: Boolean): Boolean = js.native
  
  /** Layer visibilty control */
  var layerChooser: Layers = js.native
  
  /** the Leaflet Map */
  var map: Map_ = js.native
  
  /** Request handler */
  var mapDataRequest: MapDataRequest = js.native
  
  /** All iitc Pluigns */
  var plugin: js.Any = js.native
  
  /** prepare marker for OverlappingMarkerSpiderfier */
  def registerMarkerForOMS(marker: Marker_[_]): Unit = js.native
  
  /** remove a layer */
  def removeLayerGroup(layer: LayerGroup_[_]): Unit = js.native
  
  /** Load & show Portal Details Window */
  def renderPortalDetails(): Unit = js.native
  def renderPortalDetails(guid: PortalGUID): Unit = js.native
  
  /** update status bar */
  def renderUpdateStatus(): Unit = js.native
  
  // Map Stuff
  def selectPortalByLatLng(lat: Double, lng: Double): Unit = js.native
  
  def show(paneID: String): Unit = js.native
  
  def startRefreshTimeout(): Unit = js.native
  
  /** convert team string to id */
  def teamStringToId(team: String): Double = js.native
  
  /** set layer visiblity */
  def updateDisplayedLayerGroup(name: String, display: Boolean): Unit = js.native
  
  // Android
  def useAndroidPanes(): Boolean = js.native
  
  /** Make sure Portal is visible in Window */
  def zoomToAndShowPortal(guid: PortalGUID, position: LatLng_): Unit = js.native
  
  type BootCallback = js.Function0[Unit]
}
