package typings.jqueryGridster

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCollisionData extends js.Object {
  var area: Double
  var area_coords: GridsterCoords
  var coords: GridsterCoords
  var el: HTMLElement
  var player_coords: GridsterCoords
  var region: String
}

object GridsterCollisionData {
  @scala.inline
  def apply(
    area: Double,
    area_coords: GridsterCoords,
    coords: GridsterCoords,
    el: HTMLElement,
    player_coords: GridsterCoords,
    region: String
  ): GridsterCollisionData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], area_coords = area_coords.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], player_coords = player_coords.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridsterCollisionData]
  }
}

