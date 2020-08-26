package typings.jqueryGridster

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridsterCollisionData extends js.Object {
  var area: Double = js.native
  var area_coords: GridsterCoords = js.native
  var coords: GridsterCoords = js.native
  var el: HTMLElement = js.native
  var player_coords: GridsterCoords = js.native
  var region: String = js.native
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
  @scala.inline
  implicit class GridsterCollisionDataOps[Self <: GridsterCollisionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArea(value: Double): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setArea_coords(value: GridsterCoords): Self = this.set("area_coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoords(value: GridsterCoords): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayer_coords(value: GridsterCoords): Self = this.set("player_coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

