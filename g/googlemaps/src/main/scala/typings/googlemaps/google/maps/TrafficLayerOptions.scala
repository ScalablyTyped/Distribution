package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficLayerOptions extends js.Object {
  var autoRefresh: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
}

object TrafficLayerOptions {
  @scala.inline
  def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  @scala.inline
  implicit class TrafficLayerOptionsOps[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
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
    def setAutoRefresh(value: Boolean): Self = this.set("autoRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRefresh: Self = this.set("autoRefresh", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

