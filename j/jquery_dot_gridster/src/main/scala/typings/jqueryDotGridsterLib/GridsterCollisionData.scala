package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCollisionData extends js.Object {
  var area: scala.Double
  var area_coords: GridsterCoords
  var coords: GridsterCoords
  var el: stdLib.HTMLElement
  var player_coords: GridsterCoords
  var region: java.lang.String
}

object GridsterCollisionData {
  @scala.inline
  def apply(
    area: scala.Double,
    area_coords: GridsterCoords,
    coords: GridsterCoords,
    el: stdLib.HTMLElement,
    player_coords: GridsterCoords,
    region: java.lang.String
  ): GridsterCollisionData = {
    val __obj = js.Dynamic.literal(area = area, area_coords = area_coords, coords = coords, el = el, player_coords = player_coords, region = region)
  
    __obj.asInstanceOf[GridsterCollisionData]
  }
}

