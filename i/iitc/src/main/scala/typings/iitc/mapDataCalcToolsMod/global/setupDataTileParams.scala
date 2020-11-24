package typings.iitc.mapDataCalcToolsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("setupDataTileParams")
@js.native
object setupDataTileParams extends js.Object {
  
  /**
    * Ingress Intel splits up requests for map data (portals, links,fields) into tiles. To get data for the current viewport
    * (i.e. what is currently visible) it first calculates which tiles intersect.
    * For all those tiles, it then calculates the lat/lng bounds of that tile and a quadkey.
    * Both the bounds and the quadkey are “somewhat” required to get complete data.
    *
    * Conversion functions courtesy of @link http://wiki.openstreetmap.org/wiki/Slippy_map_tilenames
    */
  def apply(): Unit = js.native
}
