package typings.atMaterialDashUiCore.hiddenHiddenJsMod

import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiddenJsProps extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.undefined
  var lgDown: js.UndefOr[Boolean] = js.undefined
  var lgUp: js.UndefOr[Boolean] = js.undefined
  var mdDown: js.UndefOr[Boolean] = js.undefined
  var mdUp: js.UndefOr[Boolean] = js.undefined
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.undefined
  var smDown: js.UndefOr[Boolean] = js.undefined
  var smUp: js.UndefOr[Boolean] = js.undefined
  var xlDown: js.UndefOr[Boolean] = js.undefined
  var xlUp: js.UndefOr[Boolean] = js.undefined
  var xsDown: js.UndefOr[Boolean] = js.undefined
  var xsUp: js.UndefOr[Boolean] = js.undefined
}

object HiddenJsProps {
  @scala.inline
  def apply(
    initialWidth: Breakpoint = null,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  ): HiddenJsProps = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown.asInstanceOf[js.Any])
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp.asInstanceOf[js.Any])
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown.asInstanceOf[js.Any])
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown.asInstanceOf[js.Any])
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiddenJsProps]
  }
}

