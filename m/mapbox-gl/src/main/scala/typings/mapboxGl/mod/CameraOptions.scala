package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraOptions extends js.Object {
  /** If zooming, the zoom center (defaults to map center) */
  var around: js.UndefOr[LngLatLike] = js.native
  /** Map rotation bearing in degrees counter-clockwise from north */
  var bearing: js.UndefOr[Double] = js.native
  /** Map center */
  var center: js.UndefOr[LngLatLike] = js.native
  /** Map angle in degrees at which the camera is looking at the ground */
  var pitch: js.UndefOr[Double] = js.native
  /** Map zoom level */
  var zoom: js.UndefOr[Double] = js.native
}

object CameraOptions {
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  @scala.inline
  implicit class CameraOptionsOps[Self <: CameraOptions] (val x: Self) extends AnyVal {
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
    def setAround(value: LngLatLike): Self = this.set("around", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAround: Self = this.set("around", js.undefined)
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    @scala.inline
    def setCenter(value: LngLatLike): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

