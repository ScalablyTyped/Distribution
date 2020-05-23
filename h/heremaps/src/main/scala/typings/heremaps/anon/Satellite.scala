package typings.heremaps.anon

import typings.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Satellite extends js.Object {
  var normal: MapType
  var satellite: MapType
  var terrain: MapType
}

object Satellite {
  @scala.inline
  def apply(normal: MapType, satellite: MapType, terrain: MapType): Satellite = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], satellite = satellite.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Satellite]
  }
}

