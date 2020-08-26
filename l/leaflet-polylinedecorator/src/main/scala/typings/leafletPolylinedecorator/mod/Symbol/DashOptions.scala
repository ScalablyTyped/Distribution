package typings.leafletPolylinedecorator.mod.Symbol

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashOptions extends js.Object {
  var pathOptions: js.UndefOr[PathOptions] = js.native
  var pixelSize: js.UndefOr[Double] = js.native
}

object DashOptions {
  @scala.inline
  def apply(): DashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashOptions]
  }
  @scala.inline
  implicit class DashOptionsOps[Self <: DashOptions] (val x: Self) extends AnyVal {
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
    def setPathOptions(value: PathOptions): Self = this.set("pathOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathOptions: Self = this.set("pathOptions", js.undefined)
    @scala.inline
    def setPixelSize(value: Double): Self = this.set("pixelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelSize: Self = this.set("pixelSize", js.undefined)
  }
  
}

