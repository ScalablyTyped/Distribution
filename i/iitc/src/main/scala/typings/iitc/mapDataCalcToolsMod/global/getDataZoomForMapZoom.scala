package typings.iitc.mapDataCalcToolsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("getDataZoomForMapZoom")
@js.native
object getDataZoomForMapZoom extends js.Object {
  
  /**
    * we can fetch data at a zoom level different to the map zoom.
    * To improve the cacheing performance, we try and limit the number of zoom levels we retrieve data for
    * to avoid impacting server load, we keep ourselves restricted to a zoom level with the sane number
    * of tilesPerEdge and portal levels visible
    */
  def apply(mapZoom: Double): Double = js.native
}
