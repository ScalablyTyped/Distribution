package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineOptions extends PathOptions {
  var noClip: js.UndefOr[Boolean] = js.native
  var smoothFactor: js.UndefOr[Double] = js.native
}

object PolylineOptions {
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
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
    def setNoClip(value: Boolean): Self = this.set("noClip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoClip: Self = this.set("noClip", js.undefined)
    @scala.inline
    def setSmoothFactor(value: Double): Self = this.set("smoothFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothFactor: Self = this.set("smoothFactor", js.undefined)
  }
  
}

