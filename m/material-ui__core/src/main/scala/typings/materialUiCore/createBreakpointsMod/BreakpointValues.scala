package typings.materialUiCore.createBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

