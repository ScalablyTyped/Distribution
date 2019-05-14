package typings
package atMaterialDashUiCoreLib.stylesCreateBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  unit  :string,   step  :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
trait BreakpointsOptions extends js.Object {
  var between: js.UndefOr[js.Any] = js.undefined
  var down: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var only: js.UndefOr[js.Any] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var up: js.UndefOr[js.Any] = js.undefined
  var values: js.UndefOr[BreakpointValues] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
}

object BreakpointsOptions {
  @scala.inline
  def apply(
    between: js.Any = null,
    down: js.Any = null,
    keys: js.Array[Breakpoint] = null,
    only: js.Any = null,
    step: scala.Int | scala.Double = null,
    unit: java.lang.String = null,
    up: js.Any = null,
    values: BreakpointValues = null,
    width: js.Any = null
  ): BreakpointsOptions = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between)
    if (down != null) __obj.updateDynamic("down")(down)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (only != null) __obj.updateDynamic("only")(only)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (up != null) __obj.updateDynamic("up")(up)
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BreakpointsOptions]
  }
}

