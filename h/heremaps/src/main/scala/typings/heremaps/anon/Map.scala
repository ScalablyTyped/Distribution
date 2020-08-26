package typings.heremaps.anon

import typings.heremaps.H.map.layer.MarkerTileLayer
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var map: TileLayer = js.native
  var traffic: TileLayer = js.native
  var trafficincidents: MarkerTileLayer = js.native
}

object Map {
  @scala.inline
  def apply(map: TileLayer, traffic: TileLayer, trafficincidents: MarkerTileLayer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any], trafficincidents = trafficincidents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
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
    def setMap(value: TileLayer): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraffic(value: TileLayer): Self = this.set("traffic", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficincidents(value: MarkerTileLayer): Self = this.set("trafficincidents", value.asInstanceOf[js.Any])
  }
  
}

