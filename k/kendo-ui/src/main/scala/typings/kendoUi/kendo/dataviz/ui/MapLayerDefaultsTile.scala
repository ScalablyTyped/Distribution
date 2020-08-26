package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerDefaultsTile extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var subdomains: js.UndefOr[js.Any] = js.native
  var urlTemplate: js.UndefOr[String] = js.native
}

object MapLayerDefaultsTile {
  @scala.inline
  def apply(): MapLayerDefaultsTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsTile]
  }
  @scala.inline
  implicit class MapLayerDefaultsTileOps[Self <: MapLayerDefaultsTile] (val x: Self) extends AnyVal {
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSubdomains(value: js.Any): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
  }
  
}

