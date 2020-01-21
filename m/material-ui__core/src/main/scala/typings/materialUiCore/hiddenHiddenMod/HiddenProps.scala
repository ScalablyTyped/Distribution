package typings.materialUiCore.hiddenHiddenMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.materialUiCoreStrings.css
import typings.materialUiCore.materialUiCoreStrings.js_
import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
@js.native
trait HiddenProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.native
  var implementation: js.UndefOr[js_ | css] = js.native
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var lgDown: js.UndefOr[Boolean] = js.native
  var lgUp: js.UndefOr[Boolean] = js.native
  var mdDown: js.UndefOr[Boolean] = js.native
  var mdUp: js.UndefOr[Boolean] = js.native
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
  var smDown: js.UndefOr[Boolean] = js.native
  var smUp: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var xlDown: js.UndefOr[Boolean] = js.native
  var xlUp: js.UndefOr[Boolean] = js.native
  var xsDown: js.UndefOr[Boolean] = js.native
  var xsUp: js.UndefOr[Boolean] = js.native
}

object HiddenProps {
  @scala.inline
  def apply(
    className: String = null,
    classes: Partial[ClassNameMap[scala.Nothing]] = null,
    implementation: js_ | css = null,
    initialWidth: Breakpoint = null,
    innerRef: Ref[_] | RefObject[_] = null,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  ): HiddenProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown.asInstanceOf[js.Any])
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp.asInstanceOf[js.Any])
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown.asInstanceOf[js.Any])
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown.asInstanceOf[js.Any])
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp.asInstanceOf[js.Any])
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown.asInstanceOf[js.Any])
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiddenProps]
  }
}

