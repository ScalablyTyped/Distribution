package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMarker extends js.Object {
  var location: js.UndefOr[js.Any | Location] = js.native
  var shape: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[MapMarkerTooltip] = js.native
}

object MapMarker {
  @scala.inline
  def apply(): MapMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapMarker]
  }
  @scala.inline
  implicit class MapMarkerOps[Self <: MapMarker] (val x: Self) extends AnyVal {
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
    def setLocation(value: js.Any | Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: MapMarkerTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

