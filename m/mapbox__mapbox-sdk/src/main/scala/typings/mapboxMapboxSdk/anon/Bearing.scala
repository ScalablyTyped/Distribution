package typings.mapboxMapboxSdk.anon

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bearing extends js.Object {
  var bearing: js.UndefOr[Double] = js.native
  var coordinates: LngLatLike | auto = js.native
  var pitch: js.UndefOr[Double] = js.native
  var zoom: Double = js.native
}

object Bearing {
  @scala.inline
  def apply(coordinates: LngLatLike | auto, zoom: Double): Bearing = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearing]
  }
  @scala.inline
  implicit class BearingOps[Self <: Bearing] (val x: Self) extends AnyVal {
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
    def setCoordinates(value: LngLatLike | auto): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
  }
  
}

