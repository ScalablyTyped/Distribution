package typings.materialUiCore.withWidthWithWidthMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var noSSR: js.UndefOr[Boolean] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object WithWidthOptions {
  @scala.inline
  def apply(
    initialWidth: Breakpoint = null,
    noSSR: js.UndefOr[Boolean] = js.undefined,
    resizeInterval: js.UndefOr[Double] = js.undefined,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): WithWidthOptions = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noSSR)) __obj.updateDynamic("noSSR")(noSSR.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeInterval)) __obj.updateDynamic("resizeInterval")(resizeInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthOptions]
  }
}

