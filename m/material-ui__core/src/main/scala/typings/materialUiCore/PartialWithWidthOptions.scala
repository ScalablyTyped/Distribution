package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidthOptions> */
@js.native
trait PartialWithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var noSSR: js.UndefOr[Boolean] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialWithWidthOptions {
  @scala.inline
  def apply(
    initialWidth: Breakpoint = null,
    noSSR: js.UndefOr[Boolean] = js.undefined,
    resizeInterval: Int | Double = null,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noSSR)) __obj.updateDynamic("noSSR")(noSSR.asInstanceOf[js.Any])
    if (resizeInterval != null) __obj.updateDynamic("resizeInterval")(resizeInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
}

