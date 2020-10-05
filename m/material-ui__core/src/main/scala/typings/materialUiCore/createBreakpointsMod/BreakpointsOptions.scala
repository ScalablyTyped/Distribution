package typings.materialUiCore.createBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  unit :string,   step :number} & @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoints> */
@js.native
trait BreakpointsOptions extends js.Object {
  var between: js.UndefOr[js.Function2[/* start */ Breakpoint, /* end */ Breakpoint, String]] = js.native
  var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
  var keys: js.UndefOr[js.Array[Breakpoint]] = js.native
  var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.native
  var step: js.UndefOr[Double] = js.native
  var unit: js.UndefOr[String] = js.native
  var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
  var values: js.UndefOr[BreakpointValues] = js.native
  var width: js.UndefOr[js.Function1[/* key */ Breakpoint, Double]] = js.native
}

object BreakpointsOptions {
  @scala.inline
  def apply(): BreakpointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsOptions]
  }
  @scala.inline
  implicit class BreakpointsOptionsOps[Self <: BreakpointsOptions] (val x: Self) extends AnyVal {
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
    def setBetween(value: (/* start */ Breakpoint, /* end */ Breakpoint) => String): Self = this.set("between", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    @scala.inline
    def setDown(value: /* key */ Breakpoint | Double => String): Self = this.set("down", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    @scala.inline
    def setKeysVarargs(value: Breakpoint*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[Breakpoint]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setOnly(value: /* key */ Breakpoint => String): Self = this.set("only", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUp(value: /* key */ Breakpoint | Double => String): Self = this.set("up", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    @scala.inline
    def setValues(value: BreakpointValues): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setWidth(value: /* key */ Breakpoint => Double): Self = this.set("width", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

