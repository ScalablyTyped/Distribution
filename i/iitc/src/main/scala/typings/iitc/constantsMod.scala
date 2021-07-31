package typings.iitc

import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object global {
    
    // { RES_SHIELD: 'Shield', MULTIHACK: 'Multi-hack', FORCE_AMP: 'Force Amp', HEATSINK: 'Heat Sink', TURRET: 'Turret', LINK_AMPLIFIER: 'Link Amp' };
    // circles around a selected portal that show from where you can hack
    // it and how far the portal reaches (i.e. how far links may be made
    // from this portal)
    @JSGlobal("ACCESS_INDICATOR_COLOR")
    @js.native
    val ACCESS_INDICATOR_COLOR: String = js.native
    
    /** @default 750 AP for destroying field */
    @JSGlobal("CAPTURE_PORTAL")
    @js.native
    val CAPTURE_PORTAL: Double = js.native
    
    /** @default = 300; */
    // how many pixels to the top before requesting new data
    @JSGlobal("CHAT_REQUEST_SCROLL_TOP")
    @js.native
    val CHAT_REQUEST_SCROLL_TOP: Double = js.native
    
    /** @default = 200; */
    @JSGlobal("CHAT_SHRINKED")
    @js.native
    val CHAT_SHRINKED: Double = js.native
    
    /** @default '#f0f' */
    /**
      * Team colors
      * @default ['#FF6600','#0088FF','#03DC03']
      */
    @JSGlobal("COLORS")
    @js.native
    val COLORS: js.Tuple3[String, String, String] = js.native
    
    @JSGlobal("COLORS_LVL")
    @js.native
    val COLORS_LVL: js.Array[String] = js.native
    
    /** @default = 60 */
    @JSGlobal("COLOR_SELECTED_PORTAL")
    @js.native
    val COLOR_SELECTED_PORTAL: String = js.native
    
    /** @default 125 AP for deploying a resonator */
    @JSGlobal("COMPLETION_BONUS")
    @js.native
    val COMPLETION_BONUS: Double = js.native
    
    // = 15;
    @JSGlobal("DEFAULT_PORTAL_IMG")
    @js.native
    val DEFAULT_PORTAL_IMG: String = js.native
    
    // = 3;
    // used when zoom level is not specified explicitly (must contain all the portals)
    @JSGlobal("DEFAULT_ZOOM")
    @js.native
    val DEFAULT_ZOOM: Double = js.native
    
    /** @default 500 AP for capturing a portal */
    @JSGlobal("DEPLOY_RESONATOR")
    @js.native
    val DEPLOY_RESONATOR: Double = js.native
    
    /** @default 187  AP for destroying link */
    @JSGlobal("DESTROY_FIELD")
    @js.native
    val DESTROY_FIELD: Double = js.native
    
    /** @default 75 AP for destroying portal */
    @JSGlobal("DESTROY_LINK")
    @js.native
    val DESTROY_LINK: Double = js.native
    
    /** @default ['→', '↗', '↑', '↖', '←', '↙', '↓', '↘'] */
    @JSGlobal("DESTROY_RESONATOR")
    @js.native
    val DESTROY_RESONATOR: Double = js.native
    
    /** @default = 60; */
    // Minimum area to zoom ratio that field MU's will display
    @JSGlobal("FIELD_MU_DISPLAY_AREA_ZOOM_RATIO")
    @js.native
    val FIELD_MU_DISPLAY_AREA_ZOOM_RATIO: Double = js.native
    
    /** @default 0.001; */
    // Point tolerance for displaying MU's
    @JSGlobal("FIELD_MU_DISPLAY_POINT_TOLERANCE")
    @js.native
    val FIELD_MU_DISPLAY_POINT_TOLERANCE: Double = js.native
    
    /** @default [0,1000,1500,2000,2500,3000,4000,5000,6000] */
    @JSGlobal("HACK_RANGE")
    @js.native
    val HACK_RANGE: Double = js.native
    
    /** @default = 15 * 60; // stop updating map after 15min idling */
    @JSGlobal("HIDDEN_SCROLLBAR_ASSUMED_WIDTH")
    @js.native
    val HIDDEN_SCROLLBAR_ASSUMED_WIDTH: Double = js.native
    
    /** @default = 15 * 60; // refresh game score every 15 minutes */
    @JSGlobal("MAX_IDLE_TIME")
    @js.native
    val MAX_IDLE_TIME: Double = js.native
    
    /** @default 65; AP for upgrading another's resonator */
    @JSGlobal("MAX_PORTAL_LEVEL")
    @js.native
    val MAX_PORTAL_LEVEL: Double = js.native
    
    /** @default 8 */
    @JSGlobal("MAX_RESO_PER_PLAYER")
    @js.native
    val MAX_RESO_PER_PLAYER: js.Array[Double] = js.native
    
    /** @default = 2.5;  //refresh time to use after a movement event */
    @JSGlobal("MINIMUM_OVERRIDE_REFRESH")
    @js.native
    val MINIMUM_OVERRIDE_REFRESH: Double = js.native
    
    // = 'red'
    // min zoom for intel map - should match that used by stock intel
    @JSGlobal("MIN_ZOOM")
    @js.native
    val MIN_ZOOM: Double = js.native
    
    // '//commondatastorage.googleapis.com/ingress.com/img/default-portal-image.png';
    @JSGlobal("NOMINATIM")
    @js.native
    val NOMINATIM: String = js.native
    
    /** @default 40 in meters, max. distance from portal to be able to access it */
    @JSGlobal("OCTANTS")
    @js.native
    val OCTANTS: js.Array[String] = js.native
    
    /** @default ['E', 'NE', 'N', 'NW', 'W', 'SW', 'S', 'SE'] */
    @JSGlobal("OCTANTS_ARROW")
    @js.native
    val OCTANTS_ARROW: js.Array[String] = js.native
    
    /** @default = 5; // add 5 seconds per zoom level */
    @JSGlobal("ON_MOVE_REFRESH")
    @js.native
    val ON_MOVE_REFRESH: Double = js.native
    
    // = 'orange';
    @JSGlobal("RANGE_INDICATOR_COLOR")
    @js.native
    val RANGE_INDICATOR_COLOR: String = js.native
    
    // CONFIG OPTIONS ////////////////////////////////////////////////////
    @JSGlobal("REFRESH")
    @js.native
    val REFRESH: Double = js.native
    
    /** @default = 10; //limit on refresh time since previous refresh, limiting repeated move refresh rate */
    @JSGlobal("REFRESH_GAME_SCORE")
    @js.native
    val REFRESH_GAME_SCORE: Double = js.native
    
    // '//nominatim.openstreetmap.org/search?format=json&polygon_geojson=1&q=';
    // INGRESS CONSTANTS /////////////////////////////////////////////////
    // http://decodeingress.me/2012/11/18/ingress-portal-levels-and-link-range/
    @JSGlobal("RESO_NRG")
    @js.native
    val RESO_NRG: js.Array[Double] = js.native
    
    /** @default = 20; */
    @JSGlobal("SIDEBAR_WIDTH")
    @js.native
    val SIDEBAR_WIDTH: Double = js.native
    
    /** @default [0, 8, 4, 4, 4, 2, 2, 1, 1] */
    // OTHER MORE-OR-LESS CONSTANTS //////////////////////////////////////
    /** Team constants */
    @JSGlobal("TEAM_ENL")
    @js.native
    val TEAM_ENL: Double = js.native
    
    /** ['Neutral', 'Resistance', 'Enlightened'] */
    @JSGlobal("TEAM_NAMES")
    @js.native
    val TEAM_NAMES: js.Tuple3[String, String, String] = js.native
    
    /** @default 1 */
    @JSGlobal("TEAM_NONE")
    @js.native
    val TEAM_NONE: Double = js.native
    
    /** @default 2 */
    @JSGlobal("TEAM_RES")
    @js.native
    val TEAM_RES: Double = js.native
    
    /** @default 0 */
    /** Team CSS = ['none', 'res', 'enl'] */
    @JSGlobal("TEAM_TO_CSS")
    @js.native
    val TEAM_TO_CSS: js.Tuple3[String, String, String] = js.native
    
    /** @default 250; AP for deploying all resonators on portal */
    @JSGlobal("UPGRADE_ANOTHERS_RESONATOR")
    @js.native
    val UPGRADE_ANOTHERS_RESONATOR: Double = js.native
    
    /** @default = 30; // refresh view every 30s (base time) */
    @JSGlobal("ZOOM_LEVEL_ADJ")
    @js.native
    val ZOOM_LEVEL_ADJ: Double = js.native
    
    @JSGlobal("fieldsFactionLayers")
    @js.native
    val fieldsFactionLayers: LayerGroup_[js.Any] = js.native
    
    @JSGlobal("iitcBuildDate")
    @js.native
    val iitcBuildDate: String = js.native
    
    @JSGlobal("linksFactionLayers")
    @js.native
    val linksFactionLayers: LayerGroup_[js.Any] = js.native
    
    // = null;
    @JSGlobal("mapRunsUserAction")
    @js.native
    def mapRunsUserAction: js.Any = js.native
    @scala.inline
    def mapRunsUserAction_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("mapRunsUserAction")(x.asInstanceOf[js.Any])
    
    // = null;
    @JSGlobal("portalAccessIndicator")
    @js.native
    def portalAccessIndicator: js.Any = js.native
    @scala.inline
    def portalAccessIndicator_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("portalAccessIndicator")(x.asInstanceOf[js.Any])
    
    @JSGlobal("portalRangeIndicator")
    @js.native
    def portalRangeIndicator: js.Any = js.native
    @scala.inline
    def portalRangeIndicator_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("portalRangeIndicator")(x.asInstanceOf[js.Any])
    
    // = false;
    @JSGlobal("portalsFactionLayers")
    @js.native
    val portalsFactionLayers: LayerGroup_[js.Any] = js.native
    
    // STORAGE ///////////////////////////////////////////////////////////
    // global constiables used for storage. Most likely READ ONLY. Proper
    // way would be to encapsulate them in an anonymous function and write
    // getters/setters, but if you are careful enough, this works.
    @JSGlobal("refreshTimeout")
    @js.native
    def refreshTimeout: js.Any = js.native
    @scala.inline
    def refreshTimeout_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("refreshTimeout")(x.asInstanceOf[js.Any])
    
    @JSGlobal("script_info")
    @js.native
    val scriptInfo: js.Any = js.native
    
    // = null;
    /** guid of current selected portal */
    @JSGlobal("selectedPortal")
    @js.native
    def selectedPortal: PortalGUID | Null = js.native
    @scala.inline
    def selectedPortal_=(x: PortalGUID | Null): Unit = js.Dynamic.global.updateDynamic("selectedPortal")(x.asInstanceOf[js.Any])
    
    // = undefined;
    @JSGlobal("urlPortal")
    @js.native
    def urlPortal: js.Any = js.native
    
    // = null;
    @JSGlobal("urlPortalLL")
    @js.native
    def urlPortalLL: js.Any = js.native
    @scala.inline
    def urlPortalLL_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("urlPortalLL")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def urlPortal_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("urlPortal")(x.asInstanceOf[js.Any])
    
    /** @default ['#000',...,'#9627F4'] */
    object COLORS_MOD
    
    /** @default {VERY_RARE:'#b08cff',RARE:'#73a8ff',COMMON:'#8cffbf'} */
    object MOD_TYPE
    
    /** list of all fields */
    object fields
    
    /** list of all loaded links */
    object links
    
    // contain current status(on/off) of overlay layerGroups.
    // But you should use isLayerGroupDisplayed(name) to check the status
    object overlayStatus
    
    /** list of all loaded portals */
    object portals
  }
}
