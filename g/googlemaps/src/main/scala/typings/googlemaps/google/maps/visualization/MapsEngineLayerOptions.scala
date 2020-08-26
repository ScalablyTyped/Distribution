package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait MapsEngineLayerOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var fitBounds: js.UndefOr[Boolean] = js.native
  var layerId: js.UndefOr[String] = js.native
  var layerKey: js.UndefOr[String] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var mapId: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var suppressInfoWindows: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MapsEngineLayerOptions {
  @scala.inline
  def apply(): MapsEngineLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapsEngineLayerOptions]
  }
  @scala.inline
  implicit class MapsEngineLayerOptionsOps[Self <: MapsEngineLayerOptions] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setFitBounds(value: Boolean): Self = this.set("fitBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitBounds: Self = this.set("fitBounds", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLayerKey(value: String): Self = this.set("layerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerKey: Self = this.set("layerKey", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapId(value: String): Self = this.set("mapId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapId: Self = this.set("mapId", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = this.set("suppressInfoWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressInfoWindows: Self = this.set("suppressInfoWindows", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

