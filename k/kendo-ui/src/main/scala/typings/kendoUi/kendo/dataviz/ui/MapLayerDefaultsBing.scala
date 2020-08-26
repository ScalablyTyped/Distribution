package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerDefaultsBing extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var culture: js.UndefOr[String] = js.native
  var imagerySet: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object MapLayerDefaultsBing {
  @scala.inline
  def apply(): MapLayerDefaultsBing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBing]
  }
  @scala.inline
  implicit class MapLayerDefaultsBingOps[Self <: MapLayerDefaultsBing] (val x: Self) extends AnyVal {
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
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setImagerySet(value: String): Self = this.set("imagerySet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagerySet: Self = this.set("imagerySet", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

