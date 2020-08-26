package typings.materialUiCore.cssBaselineCssBaselineMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
}

object CssBaselineProps {
  @scala.inline
  def apply(): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssBaselineProps]
  }
  @scala.inline
  implicit class CssBaselinePropsOps[Self <: CssBaselineProps] (val x: Self) extends AnyVal {
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

