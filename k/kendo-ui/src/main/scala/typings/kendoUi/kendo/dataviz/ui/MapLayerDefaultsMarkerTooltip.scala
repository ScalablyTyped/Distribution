package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerDefaultsMarkerTooltip extends js.Object {
  var animation: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimation] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var callout: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | js.Function | MapLayerDefaultsMarkerTooltipContent] = js.native
  var height: js.UndefOr[Double] = js.native
  var iframe: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[String] = js.native
  var showAfter: js.UndefOr[Double] = js.native
  var showOn: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object MapLayerDefaultsMarkerTooltip {
  @scala.inline
  def apply(): MapLayerDefaultsMarkerTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltip]
  }
  @scala.inline
  implicit class MapLayerDefaultsMarkerTooltipOps[Self <: MapLayerDefaultsMarkerTooltip] (val x: Self) extends AnyVal {
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
    def setAnimation(value: MapLayerDefaultsMarkerTooltipAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setCallout(value: Boolean): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def setContent(value: String | js.Function | MapLayerDefaultsMarkerTooltipContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowAfter(value: Double): Self = this.set("showAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAfter: Self = this.set("showAfter", js.undefined)
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

