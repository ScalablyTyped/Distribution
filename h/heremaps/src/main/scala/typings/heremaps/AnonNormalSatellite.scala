package typings.heremaps

import typings.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNormalSatellite extends js.Object {
  var normal: MapType
  var satellite: MapType
  var terrain: MapType
}

object AnonNormalSatellite {
  @scala.inline
  def apply(normal: MapType, satellite: MapType, terrain: MapType): AnonNormalSatellite = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], satellite = satellite.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNormalSatellite]
  }
}

