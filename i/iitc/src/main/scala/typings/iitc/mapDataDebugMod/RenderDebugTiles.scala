package typings.iitc.mapDataDebugMod

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iitc/core/map_data_debug", "RenderDebugTiles")
@js.native
class RenderDebugTiles () extends js.Object {
  
  var CLEAR_CHECK_TIME: Double = js.native
  
   // = 0.1;
  var FADE_TIME: Double = js.native
  
  def create(id: String, bounds: LatLngBounds_): Unit = js.native
  
   //  = 1.0;
  var debugTileLayer: LayerGroup_[_] = js.native
  
  def reset(): Unit = js.native
  
  def runClearPass(): Unit = js.native
  
  def setColour(id: String, borercol: String, fillcol: String): Unit = js.native
  
  def setState(id: String, state: DebugTileState): Unit = js.native
  
  /**
    * @param waitTime in msec
    */
  def startTimer(waitTime: Double): Unit = js.native
  
  var timer: js.UndefOr[Double] = js.native
}
