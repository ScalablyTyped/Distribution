package typings.heremaps

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: TileLayer
  var traffic: TileLayer
  var trafficincidents: MarkerTileLayer
}

object AnonMap {
  @scala.inline
  def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMap]
  }
}

