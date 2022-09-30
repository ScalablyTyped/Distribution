package typings.iitc

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  object global {
    
    @JSGlobal("DEFAULT_MAX_IDLE_TIME")
    @js.native
    def DEFAULT_MAX_IDLE_TIME: Double = js.native
    inline def DEFAULT_MAX_IDLE_TIME_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DEFAULT_MAX_IDLE_TIME")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DEFAULT_REFRESH")
    @js.native
    def DEFAULT_REFRESH: Double = js.native
    inline def DEFAULT_REFRESH_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DEFAULT_REFRESH")(x.asInstanceOf[js.Any])
    
    /** Info about current player/agent */
    @JSGlobal("PLAYER")
    @js.native
    def PLAYER: PlayerInfo = js.native
    inline def PLAYER_=(x: PlayerInfo): Unit = js.Dynamic.global.updateDynamic("PLAYER")(x.asInstanceOf[js.Any])
    
    /** add Layergroup to leaflets layer-chooser */
    inline def addLayerGroup(name: String, layer: LayerGroup_[Any], defaultVisibile: Boolean): Unit = (js.Dynamic.global.applyDynamic("addLayerGroup")(name.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], defaultVisibile.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addLayerGroup(name: String, layer: LayerGroup_[Any], defaultVisibile: Boolean, groupname: String): Unit = (js.Dynamic.global.applyDynamic("addLayerGroup")(name.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], defaultVisibile.asInstanceOf[js.Any], groupname.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** iitc-Pluigns setup/initialize function */
    @JSGlobal("bootPlugins")
    @js.native
    def bootPlugins: js.Array[BootCallback] = js.native
    inline def bootPlugins_=(x: js.Array[BootCallback]): Unit = js.Dynamic.global.updateDynamic("bootPlugins")(x.asInstanceOf[js.Any])
    
    /** Create Portal-Marker */
    inline def createMarker(position: LatLng_, options: PortalOptions): CircleMarker_[Any] = (js.Dynamic.global.applyDynamic("createMarker")(position.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CircleMarker_[Any]]
    
    @JSGlobal("currentPane")
    @js.native
    def currentPane: String = js.native
    inline def currentPane_=(x: String): Unit = js.Dynamic.global.updateDynamic("currentPane")(x.asInstanceOf[js.Any])
    
    /** escape Html string */
    inline def escapeHtmlSpecialChars(name: String): String = js.Dynamic.global.applyDynamic("escapeHtmlSpecialChars")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** google-api */
    @JSGlobal("gapi")
    @js.native
    def gapi: Any = js.native
    inline def gapi_=(x: Any): Unit = js.Dynamic.global.updateDynamic("gapi")(x.asInstanceOf[js.Any])
    
    /** if true iitc main script was already loaded (plugin need to trigger setup on iths own) */
    @JSGlobal("iitcLoaded")
    @js.native
    def iitcLoaded: Boolean = js.native
    inline def iitcLoaded_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("iitcLoaded")(x.asInstanceOf[js.Any])
    
    /** get layer visiblity */
    inline def isLayerGroupDisplayed(name: String): Boolean = js.Dynamic.global.applyDynamic("isLayerGroupDisplayed")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isLayerGroupDisplayed(name: String, defaultDisplay: Boolean): Boolean = (js.Dynamic.global.applyDynamic("isLayerGroupDisplayed")(name.asInstanceOf[js.Any], defaultDisplay.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Layer visibilty control */
    @JSGlobal("layerChooser")
    @js.native
    def layerChooser: Layers = js.native
    inline def layerChooser_=(x: Layers): Unit = js.Dynamic.global.updateDynamic("layerChooser")(x.asInstanceOf[js.Any])
    
    /** the Leaflet Map */
    @JSGlobal("map")
    @js.native
    def map: Map_ = js.native
    
    /** Request handler */
    @JSGlobal("mapDataRequest")
    @js.native
    def mapDataRequest: MapDataRequest = js.native
    inline def mapDataRequest_=(x: MapDataRequest): Unit = js.Dynamic.global.updateDynamic("mapDataRequest")(x.asInstanceOf[js.Any])
    
    inline def map_=(x: Map_): Unit = js.Dynamic.global.updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** All iitc Pluigns */
    @JSGlobal("plugin")
    @js.native
    def plugin: Any = js.native
    inline def plugin_=(x: Any): Unit = js.Dynamic.global.updateDynamic("plugin")(x.asInstanceOf[js.Any])
    
    /** prepare marker for OverlappingMarkerSpiderfier */
    inline def registerMarkerForOMS(marker: Marker_[Any]): Unit = js.Dynamic.global.applyDynamic("registerMarkerForOMS")(marker.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** remove a layer */
    inline def removeLayerGroup(layer: LayerGroup_[Any]): Unit = js.Dynamic.global.applyDynamic("removeLayerGroup")(layer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Load & show Portal Details Window */
    inline def renderPortalDetails(): Unit = js.Dynamic.global.applyDynamic("renderPortalDetails")().asInstanceOf[Unit]
    inline def renderPortalDetails(guid: PortalGUID): Unit = js.Dynamic.global.applyDynamic("renderPortalDetails")(guid.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** update status bar */
    inline def renderUpdateStatus(): Unit = js.Dynamic.global.applyDynamic("renderUpdateStatus")().asInstanceOf[Unit]
    
    // Map Stuff
    inline def selectPortalByLatLng(lat: Double, lng: Double): Unit = (js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def show(paneID: String): Unit = js.Dynamic.global.applyDynamic("show")(paneID.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def startRefreshTimeout(): Unit = js.Dynamic.global.applyDynamic("startRefreshTimeout")().asInstanceOf[Unit]
    
    /** convert team string to id */
    inline def teamStringToId(team: String): Double = js.Dynamic.global.applyDynamic("teamStringToId")(team.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** set layer visiblity */
    inline def updateDisplayedLayerGroup(name: String, display: Boolean): Unit = (js.Dynamic.global.applyDynamic("updateDisplayedLayerGroup")(name.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // Android
    inline def useAndroidPanes(): Boolean = js.Dynamic.global.applyDynamic("useAndroidPanes")().asInstanceOf[Boolean]
    
    /** Make sure Portal is visible in Window */
    inline def zoomToAndShowPortal(guid: PortalGUID, position: LatLng_): Unit = (js.Dynamic.global.applyDynamic("zoomToAndShowPortal")(guid.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type BootCallback = js.Function0[Unit]
  }
}
