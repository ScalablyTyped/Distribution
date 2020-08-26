package typings.materialUiCore.shapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/shape.Shape> */
@js.native
trait ShapeOptions extends js.Object {
  var borderRadius: js.UndefOr[Double] = js.native
}

object ShapeOptions {
  @scala.inline
  def apply(): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeOptions]
  }
  @scala.inline
  implicit class ShapeOptionsOps[Self <: ShapeOptions] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
  }
  
}

