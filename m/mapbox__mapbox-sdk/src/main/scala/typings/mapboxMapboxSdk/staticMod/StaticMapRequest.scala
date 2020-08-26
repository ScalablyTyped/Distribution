package typings.mapboxMapboxSdk.staticMod

import typings.mapboxMapboxSdk.anon.Bearing
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapRequest extends js.Object {
  var attribution: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var highRes: js.UndefOr[Boolean] = js.native
  var insertOverlayBeforeLayer: js.UndefOr[String] = js.native
  var logo: js.UndefOr[Boolean] = js.native
  var overlays: js.UndefOr[js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay]] = js.native
  var ownerId: String = js.native
  var position: Bearing | auto = js.native
  var styleId: String = js.native
  var width: Double = js.native
}

object StaticMapRequest {
  @scala.inline
  def apply(height: Double, ownerId: String, position: Bearing | auto, styleId: String, width: Double): StaticMapRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapRequest]
  }
  @scala.inline
  implicit class StaticMapRequestOps[Self <: StaticMapRequest] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Bearing | auto): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribution(value: Boolean): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    @scala.inline
    def setHighRes(value: Boolean): Self = this.set("highRes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighRes: Self = this.set("highRes", js.undefined)
    @scala.inline
    def setInsertOverlayBeforeLayer(value: String): Self = this.set("insertOverlayBeforeLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertOverlayBeforeLayer: Self = this.set("insertOverlayBeforeLayer", js.undefined)
    @scala.inline
    def setLogo(value: Boolean): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setOverlaysVarargs(value: (CustomMarkerOverlay | GeoJsonOverlay | PathOverlay)*): Self = this.set("overlays", js.Array(value :_*))
    @scala.inline
    def setOverlays(value: js.Array[CustomMarkerOverlay | GeoJsonOverlay | PathOverlay]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
  }
  
}

