package typings.iitc

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMapDataDebugMod {
  
  @JSImport("iitc/core/map_data_debug", "RenderDebugTiles")
  @js.native
  open class RenderDebugTiles () extends StObject {
    
    var CLEAR_CHECK_TIME: Double = js.native
    
    // = 0.1;
    var FADE_TIME: Double = js.native
    
    def create(id: String, bounds: LatLngBounds_): Unit = js.native
    
    //  = 1.0;
    /* private */ var debugTileLayer: LayerGroup_[Any] = js.native
    
    def reset(): Unit = js.native
    
    def runClearPass(): Unit = js.native
    
    def setColour(id: String, borercol: String, fillcol: String): Unit = js.native
    
    def setState(id: String, state: DebugTileState): Unit = js.native
    
    /**
      * @param waitTime in msec
      */
    def startTimer(waitTime: Double): Unit = js.native
    
    /* private */ var timer: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iitc.iitcStrings.ok
    - typings.iitc.iitcStrings.error
    - typings.iitc.iitcStrings.`cache-fresh`
    - typings.iitc.iitcStrings.`cache-stale`
    - typings.iitc.iitcStrings.requested
    - typings.iitc.iitcStrings.retrying
    - typings.iitc.iitcStrings.`request-fail`
    - typings.iitc.iitcStrings.`tile-fail`
    - typings.iitc.iitcStrings.`tile-timeout`
    - typings.iitc.iitcStrings.`render-queue`
  */
  trait DebugTileState extends StObject
  object DebugTileState {
    
    inline def `cache-fresh`: typings.iitc.iitcStrings.`cache-fresh` = "cache-fresh".asInstanceOf[typings.iitc.iitcStrings.`cache-fresh`]
    
    inline def `cache-stale`: typings.iitc.iitcStrings.`cache-stale` = "cache-stale".asInstanceOf[typings.iitc.iitcStrings.`cache-stale`]
    
    inline def error: typings.iitc.iitcStrings.error = "error".asInstanceOf[typings.iitc.iitcStrings.error]
    
    inline def ok: typings.iitc.iitcStrings.ok = "ok".asInstanceOf[typings.iitc.iitcStrings.ok]
    
    inline def `render-queue`: typings.iitc.iitcStrings.`render-queue` = "render-queue".asInstanceOf[typings.iitc.iitcStrings.`render-queue`]
    
    inline def `request-fail`: typings.iitc.iitcStrings.`request-fail` = "request-fail".asInstanceOf[typings.iitc.iitcStrings.`request-fail`]
    
    inline def requested: typings.iitc.iitcStrings.requested = "requested".asInstanceOf[typings.iitc.iitcStrings.requested]
    
    inline def retrying: typings.iitc.iitcStrings.retrying = "retrying".asInstanceOf[typings.iitc.iitcStrings.retrying]
    
    inline def `tile-fail`: typings.iitc.iitcStrings.`tile-fail` = "tile-fail".asInstanceOf[typings.iitc.iitcStrings.`tile-fail`]
    
    inline def `tile-timeout`: typings.iitc.iitcStrings.`tile-timeout` = "tile-timeout".asInstanceOf[typings.iitc.iitcStrings.`tile-timeout`]
  }
}
