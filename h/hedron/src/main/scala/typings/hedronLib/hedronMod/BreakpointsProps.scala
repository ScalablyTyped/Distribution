package typings
package hedronLib.hedronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointsProps extends js.Object {
  var breakpoints: Breakpoints
}

object BreakpointsProps {
  @scala.inline
  def apply(breakpoints: Breakpoints): BreakpointsProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpoints")(breakpoints)
    __obj.asInstanceOf[BreakpointsProps]
  }
}

