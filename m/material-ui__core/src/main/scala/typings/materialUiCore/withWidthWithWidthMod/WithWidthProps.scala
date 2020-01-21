package typings.materialUiCore.withWidthWithWidthMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
@js.native
trait WithWidthProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  var width: js.UndefOr[Breakpoint] = js.native
}

object WithWidthProps {
  @scala.inline
  def apply(innerRef: Ref[_] | RefObject[_] = null, width: Breakpoint = null): WithWidthProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthProps]
  }
}

