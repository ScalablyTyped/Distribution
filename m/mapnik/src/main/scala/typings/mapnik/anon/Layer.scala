package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  var layer: js.UndefOr[String] = js.native
  var tolerance: js.UndefOr[Double] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
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
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

