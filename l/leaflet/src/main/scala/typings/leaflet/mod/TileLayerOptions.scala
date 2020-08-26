package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayerOptions extends GridLayerOptions {
  var accessToken: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  var detectRetina: js.UndefOr[Boolean] = js.native
  var errorTileUrl: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var maxNativeZoom: js.UndefOr[Double] = js.native
  var minNativeZoom: js.UndefOr[Double] = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tms: js.UndefOr[Boolean] = js.native
  var zoomOffset: js.UndefOr[Double] = js.native
  var zoomReverse: js.UndefOr[Boolean] = js.native
}

object TileLayerOptions {
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  @scala.inline
  implicit class TileLayerOptionsOps[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
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
    def setCrossOrigin(value: CrossOrigin): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectRetina: Self = this.set("detectRetina", js.undefined)
    @scala.inline
    def setErrorTileUrl(value: String): Self = this.set("errorTileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorTileUrl: Self = this.set("errorTileUrl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxNativeZoom(value: Double): Self = this.set("maxNativeZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNativeZoom: Self = this.set("maxNativeZoom", js.undefined)
    @scala.inline
    def setMinNativeZoom(value: Double): Self = this.set("minNativeZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinNativeZoom: Self = this.set("minNativeZoom", js.undefined)
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = this.set("subdomains", js.Array(value :_*))
    @scala.inline
    def setSubdomains(value: String | js.Array[String]): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    @scala.inline
    def setTms(value: Boolean): Self = this.set("tms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTms: Self = this.set("tms", js.undefined)
    @scala.inline
    def setZoomOffset(value: Double): Self = this.set("zoomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOffset: Self = this.set("zoomOffset", js.undefined)
    @scala.inline
    def setZoomReverse(value: Boolean): Self = this.set("zoomReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomReverse: Self = this.set("zoomReverse", js.undefined)
  }
  
}

