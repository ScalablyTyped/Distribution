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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  object global {
    
    @JSGlobal("DEFAULT_MAX_IDLE_TIME")
    @js.native
    def DEFAULT_MAX_IDLE_TIME: Double = js.native
    @scala.inline
    def DEFAULT_MAX_IDLE_TIME_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DEFAULT_MAX_IDLE_TIME")(x.asInstanceOf[js.Any])
    
    @JSGlobal("DEFAULT_REFRESH")
    @js.native
    def DEFAULT_REFRESH: Double = js.native
    @scala.inline
    def DEFAULT_REFRESH_=(x: Double): Unit = js.Dynamic.global.updateDynamic("DEFAULT_REFRESH")(x.asInstanceOf[js.Any])
    
    /** Info about current player/agent */
    @JSGlobal("PLAYER")
    @js.native
    def PLAYER: PlayerInfo = js.native
    @scala.inline
    def PLAYER_=(x: PlayerInfo): Unit = js.Dynamic.global.updateDynamic("PLAYER")(x.asInstanceOf[js.Any])
    
    /** add Layergroup to leaflets layer-chooser */
    @JSGlobal("addLayerGroup")
    @js.native
    def addLayerGroup(name: String, layer: LayerGroup_[_], defaultVisibile: Boolean): Unit = js.native
    @JSGlobal("addLayerGroup")
    @js.native
    def addLayerGroup(name: String, layer: LayerGroup_[_], defaultVisibile: Boolean, groupname: String): Unit = js.native
    
    /** iitc-Pluigns setup/initialize function */
    @JSGlobal("bootPlugins")
    @js.native
    def bootPlugins: js.Array[BootCallback] = js.native
    @scala.inline
    def bootPlugins_=(x: js.Array[BootCallback]): Unit = js.Dynamic.global.updateDynamic("bootPlugins")(x.asInstanceOf[js.Any])
    
    /** Create Portal-Marker */
    @JSGlobal("createMarker")
    @js.native
    def createMarker(position: LatLng_, options: PortalOptions): CircleMarker_[_] = js.native
    
    @JSGlobal("currentPane")
    @js.native
    def currentPane: String = js.native
    @scala.inline
    def currentPane_=(x: String): Unit = js.Dynamic.global.updateDynamic("currentPane")(x.asInstanceOf[js.Any])
    
    /** escape Html string */
    @JSGlobal("escapeHtmlSpecialChars")
    @js.native
    def escapeHtmlSpecialChars(name: String): String = js.native
    
    /** google-api */
    @JSGlobal("gapi")
    @js.native
    def gapi: js.Any = js.native
    @scala.inline
    def gapi_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("gapi")(x.asInstanceOf[js.Any])
    
    /** if true iitc main script was already loaded (plugin need to trigger setup on iths own) */
    @JSGlobal("iitcLoaded")
    @js.native
    def iitcLoaded: Boolean = js.native
    @scala.inline
    def iitcLoaded_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("iitcLoaded")(x.asInstanceOf[js.Any])
    
    /** get layer visiblity */
    @JSGlobal("isLayerGroupDisplayed")
    @js.native
    def isLayerGroupDisplayed(name: String): Boolean = js.native
    @JSGlobal("isLayerGroupDisplayed")
    @js.native
    def isLayerGroupDisplayed(name: String, defaultDisplay: Boolean): Boolean = js.native
    
    /** Layer visibilty control */
    @JSGlobal("layerChooser")
    @js.native
    def layerChooser: Layers = js.native
    @scala.inline
    def layerChooser_=(x: Layers): Unit = js.Dynamic.global.updateDynamic("layerChooser")(x.asInstanceOf[js.Any])
    
    /** the Leaflet Map */
    @JSGlobal("map")
    @js.native
    def map: Map_ = js.native
    
    /** Request handler */
    @JSGlobal("mapDataRequest")
    @js.native
    def mapDataRequest: MapDataRequest = js.native
    @scala.inline
    def mapDataRequest_=(x: MapDataRequest): Unit = js.Dynamic.global.updateDynamic("mapDataRequest")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def map_=(x: Map_): Unit = js.Dynamic.global.updateDynamic("map")(x.asInstanceOf[js.Any])
    
    /** All iitc Pluigns */
    @JSGlobal("plugin")
    @js.native
    def plugin: js.Any = js.native
    @scala.inline
    def plugin_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("plugin")(x.asInstanceOf[js.Any])
    
    /** prepare marker for OverlappingMarkerSpiderfier */
    @JSGlobal("registerMarkerForOMS")
    @js.native
    def registerMarkerForOMS(marker: Marker_[_]): Unit = js.native
    
    /** remove a layer */
    @JSGlobal("removeLayerGroup")
    @js.native
    def removeLayerGroup(layer: LayerGroup_[_]): Unit = js.native
    
    /** Load & show Portal Details Window */
    @JSGlobal("renderPortalDetails")
    @js.native
    def renderPortalDetails(): Unit = js.native
    @JSGlobal("renderPortalDetails")
    @js.native
    def renderPortalDetails(guid: PortalGUID): Unit = js.native
    
    /** update status bar */
    @JSGlobal("renderUpdateStatus")
    @js.native
    def renderUpdateStatus(): Unit = js.native
    
    // Map Stuff
    @JSGlobal("selectPortalByLatLng")
    @js.native
    def selectPortalByLatLng(lat: Double, lng: Double): Unit = js.native
    
    @JSGlobal("show")
    @js.native
    def show(paneID: String): Unit = js.native
    
    @JSGlobal("startRefreshTimeout")
    @js.native
    def startRefreshTimeout(): Unit = js.native
    
    /** convert team string to id */
    @JSGlobal("teamStringToId")
    @js.native
    def teamStringToId(team: String): Double = js.native
    
    /** set layer visiblity */
    @JSGlobal("updateDisplayedLayerGroup")
    @js.native
    def updateDisplayedLayerGroup(name: String, display: Boolean): Unit = js.native
    
    // Android
    @JSGlobal("useAndroidPanes")
    @js.native
    def useAndroidPanes(): Boolean = js.native
    
    /** Make sure Portal is visible in Window */
    @JSGlobal("zoomToAndShowPortal")
    @js.native
    def zoomToAndShowPortal(guid: PortalGUID, position: LatLng_): Unit = js.native
    
    type BootCallback = js.Function0[Unit]
  }
}
