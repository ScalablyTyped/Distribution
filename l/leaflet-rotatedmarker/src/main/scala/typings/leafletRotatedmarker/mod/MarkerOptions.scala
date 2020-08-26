package typings.leafletRotatedmarker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  var rotationAngle: js.UndefOr[Double] = js.native
   // Rotation angle, in degrees, clockwise. (Default = 0)
  var rotationOrigin: js.UndefOr[String] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
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
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    @scala.inline
    def setRotationOrigin(value: String): Self = this.set("rotationOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationOrigin: Self = this.set("rotationOrigin", js.undefined)
  }
  
}

