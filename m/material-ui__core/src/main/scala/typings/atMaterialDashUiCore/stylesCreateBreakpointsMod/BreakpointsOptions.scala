package typings.atMaterialDashUiCore.stylesCreateBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  unit  :string,   step  :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
trait BreakpointsOptions extends js.Object {
  var between: js.UndefOr[js.Function2[/* start */ Breakpoint, /* end */ Breakpoint, String]] = js.undefined
  var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
  var keys: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.undefined
  var values: js.UndefOr[BreakpointValues] = js.undefined
  var width: js.UndefOr[js.Function1[/* key */ Breakpoint, Double]] = js.undefined
}

object BreakpointsOptions {
  @scala.inline
  def apply(
    between: (/* start */ Breakpoint, /* end */ Breakpoint) => String = null,
    down: /* key */ Breakpoint | Double => String = null,
    keys: js.Array[Breakpoint] = null,
    only: /* key */ Breakpoint => String = null,
    step: Int | Double = null,
    unit: String = null,
    up: /* key */ Breakpoint | Double => String = null,
    values: BreakpointValues = null,
    width: /* key */ Breakpoint => Double = null
  ): BreakpointsOptions = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(js.Any.fromFunction2(between))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (only != null) __obj.updateDynamic("only")(js.Any.fromFunction1(only))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1(up))
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(js.Any.fromFunction1(width))
    __obj.asInstanceOf[BreakpointsOptions]
  }
}

