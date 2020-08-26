package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.native
  var sdf: js.UndefOr[Boolean] = js.native
}

object PixelRatio {
  @scala.inline
  def apply(): PixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelRatio]
  }
  @scala.inline
  implicit class PixelRatioOps[Self <: PixelRatio] (val x: Self) extends AnyVal {
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
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setSdf(value: Boolean): Self = this.set("sdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdf: Self = this.set("sdf", js.undefined)
  }
  
}

