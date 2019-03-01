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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("area_coords")(area_coords)
    __obj.updateDynamic("coords")(coords)
    __obj.updateDynamic("el")(el)
    __obj.updateDynamic("player_coords")(player_coords)
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GridsterCollisionData]
  }
}

