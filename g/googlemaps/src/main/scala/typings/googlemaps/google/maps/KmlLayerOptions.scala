package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlLayerOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[Map[Element]] = js.native
  var preserveViewport: js.UndefOr[Boolean] = js.native
  var screenOverlays: js.UndefOr[Boolean] = js.native
  var suppressInfoWindows: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object KmlLayerOptions {
  @scala.inline
  def apply(): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmlLayerOptions]
  }
  @scala.inline
  implicit class KmlLayerOptionsOps[Self <: KmlLayerOptions] (val x: Self) extends AnyVal {
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
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = this.set("preserveViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveViewport: Self = this.set("preserveViewport", js.undefined)
    @scala.inline
    def setScreenOverlays(value: Boolean): Self = this.set("screenOverlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenOverlays: Self = this.set("screenOverlays", js.undefined)
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = this.set("suppressInfoWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressInfoWindows: Self = this.set("suppressInfoWindows", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

