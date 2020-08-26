package typings.materialUiCore.spacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/spacing.Spacing> */
@js.native
trait SpacingOptions extends js.Object {
  var unit: js.UndefOr[Double] = js.native
}

object SpacingOptions {
  @scala.inline
  def apply(): SpacingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpacingOptions]
  }
  @scala.inline
  implicit class SpacingOptionsOps[Self <: SpacingOptions] (val x: Self) extends AnyVal {
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
    def setUnit(value: Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

