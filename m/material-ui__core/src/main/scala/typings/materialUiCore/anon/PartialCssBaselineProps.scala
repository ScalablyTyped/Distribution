package typings.materialUiCore.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
@js.native
trait PartialCssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
}

object PartialCssBaselineProps {
  @scala.inline
  def apply(): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
  @scala.inline
  implicit class PartialCssBaselinePropsOps[Self <: PartialCssBaselineProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

