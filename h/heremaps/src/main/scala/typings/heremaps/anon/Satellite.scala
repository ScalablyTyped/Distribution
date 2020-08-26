package typings.heremaps.anon

import typings.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Satellite extends js.Object {
  var normal: MapType = js.native
  var satellite: MapType = js.native
  var terrain: MapType = js.native
}

object Satellite {
  @scala.inline
  def apply(normal: MapType, satellite: MapType, terrain: MapType): Satellite = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], satellite = satellite.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Satellite]
  }
  @scala.inline
  implicit class SatelliteOps[Self <: Satellite] (val x: Self) extends AnyVal {
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
    def setNormal(value: MapType): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSatellite(value: MapType): Self = this.set("satellite", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerrain(value: MapType): Self = this.set("terrain", value.asInstanceOf[js.Any])
  }
  
}

