package typings.iitc.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.iitc.iitctypesMod.IITC.Field
import typings.iitc.iitctypesMod.IITC.Link
import typings.iitc.iitctypesMod.IITC.Portal
import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  // circles around a selected portal that show from where you can hack
  // it and how far the portal reaches (i.e. how far links may be made
  // from this portal)
  val ACCESS_INDICATOR_COLOR: String = js.native
  
  val CAPTURE_PORTAL: Double = js.native
  
  // how many pixels to the top before requesting new data
  val CHAT_REQUEST_SCROLL_TOP: Double = js.native
  
  val CHAT_SHRINKED: Double = js.native
  
  /**
    * Team colors
    * @default ['#FF6600','#0088FF','#03DC03']
    */
  val COLORS: js.Tuple3[String, String, String] = js.native
  
  val COLORS_LVL: js.Array[String] = js.native
  
  val COLOR_SELECTED_PORTAL: String = js.native
  
  val COMPLETION_BONUS: Double = js.native
  
  val DEFAULT_PORTAL_IMG: String = js.native
  
  // used when zoom level is not specified explicitly (must contain all the portals)
  val DEFAULT_ZOOM: Double = js.native
  
  val DEPLOY_RESONATOR: Double = js.native
  
  val DESTROY_FIELD: Double = js.native
  
  val DESTROY_LINK: Double = js.native
  
  val DESTROY_RESONATOR: Double = js.native
  
  // Minimum area to zoom ratio that field MU's will display
  val FIELD_MU_DISPLAY_AREA_ZOOM_RATIO: Double = js.native
  
  // Point tolerance for displaying MU's
  val FIELD_MU_DISPLAY_POINT_TOLERANCE: Double = js.native
  
  val HACK_RANGE: Double = js.native
  
  val HIDDEN_SCROLLBAR_ASSUMED_WIDTH: Double = js.native
  
  val MAX_IDLE_TIME: Double = js.native
  
  val MAX_PORTAL_LEVEL: Double = js.native
  
  val MAX_RESO_PER_PLAYER: js.Array[Double] = js.native
  
  val MINIMUM_OVERRIDE_REFRESH: Double = js.native
  
  // min zoom for intel map - should match that used by stock intel
  val MIN_ZOOM: Double = js.native
  
  val NOMINATIM: String = js.native
  
  val OCTANTS: js.Array[String] = js.native
  
  val OCTANTS_ARROW: js.Array[String] = js.native
  
  val ON_MOVE_REFRESH: Double = js.native
  
  val RANGE_INDICATOR_COLOR: String = js.native
  
  // CONFIG OPTIONS ////////////////////////////////////////////////////
  val REFRESH: Double = js.native
  
  val REFRESH_GAME_SCORE: Double = js.native
  
  // INGRESS CONSTANTS /////////////////////////////////////////////////
  // http://decodeingress.me/2012/11/18/ingress-portal-levels-and-link-range/
  val RESO_NRG: js.Array[Double] = js.native
  
  val SIDEBAR_WIDTH: Double = js.native
  
  // OTHER MORE-OR-LESS CONSTANTS //////////////////////////////////////
  /** Team constants */
  val TEAM_ENL: Double = js.native
  
  /** ['Neutral', 'Resistance', 'Enlightened'] */
  val TEAM_NAMES: js.Tuple3[String, String, String] = js.native
  
  val TEAM_NONE: Double = js.native
  
  val TEAM_RES: Double = js.native
  
  /** Team CSS = ['none', 'res', 'enl'] */
  val TEAM_TO_CSS: js.Tuple3[String, String, String] = js.native
  
  val UPGRADE_ANOTHERS_RESONATOR: Double = js.native
  
  val ZOOM_LEVEL_ADJ: Double = js.native
  
  val fieldsFactionLayers: LayerGroup_[js.Any] = js.native
  
  val iitcBuildDate: String = js.native
  
  val linksFactionLayers: LayerGroup_[js.Any] = js.native
  
  var mapRunsUserAction: js.Any = js.native
  
  var portalAccessIndicator: js.Any = js.native
  
  var portalRangeIndicator: js.Any = js.native
  
  val portalsFactionLayers: LayerGroup_[js.Any] = js.native
  
  // STORAGE ///////////////////////////////////////////////////////////
  // global constiables used for storage. Most likely READ ONLY. Proper
  // way would be to encapsulate them in an anonymous function and write
  // getters/setters, but if you are careful enough, this works.
  var refreshTimeout: js.Any = js.native
  
  @JSName("script_info")
  val scriptInfo: js.Any = js.native
  
  /** guid of current selected portal */
  var selectedPortal: PortalGUID | Null = js.native
  
  var urlPortal: js.Any = js.native
  
  var urlPortalLL: js.Any = js.native
  
  /** list of all fields */
  @js.native
  object fields extends /* guid */ StringDictionary[Field]
  
  /** list of all loaded links */
  @js.native
  object links extends /* guid */ StringDictionary[Link]
  
  // contain current status(on/off) of overlay layerGroups.
  // But you should use isLayerGroupDisplayed(name) to check the status
  @js.native
  object overlayStatus extends js.Object
  
  /** list of all loaded portals */
  @js.native
  object portals extends /* guid */ StringDictionary[Portal]
}
