package typings.mapboxGeoViewport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoViewport extends js.Object {
  var center: js.Tuple2[Double, Double] = js.native
  var zoom: Double = js.native
}

object GeoViewport {
  @scala.inline
  def apply(center: js.Tuple2[Double, Double], zoom: Double): GeoViewport = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoViewport]
  }
  @scala.inline
  implicit class GeoViewportOps[Self <: GeoViewport] (val x: Self) extends AnyVal {
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
    def setCenter(value: js.Tuple2[Double, Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

