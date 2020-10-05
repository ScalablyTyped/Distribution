package typings.materialUiCore.createBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint ]: number} */
@js.native
trait BreakpointValues extends js.Object {
  var lg: Double = js.native
  var md: Double = js.native
  var sm: Double = js.native
  var xl: Double = js.native
  var xs: Double = js.native
}

object BreakpointValues {
  @scala.inline
  def apply(lg: Double, md: Double, sm: Double, xl: Double, xs: Double): BreakpointValues = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointValues]
  }
  @scala.inline
  implicit class BreakpointValuesOps[Self <: BreakpointValues] (val x: Self) extends AnyVal {
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
    def setLg(value: Double): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd(value: Double): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def setSm(value: Double): Self = this.set("sm", value.asInstanceOf[js.Any])
    @scala.inline
    def setXl(value: Double): Self = this.set("xl", value.asInstanceOf[js.Any])
    @scala.inline
    def setXs(value: Double): Self = this.set("xs", value.asInstanceOf[js.Any])
  }
  
}

