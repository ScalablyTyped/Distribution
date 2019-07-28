package typings.atMaterialDashUiCore.withWidthWithWidthMod

import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth> */
trait WithWidthProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var width: js.UndefOr[Breakpoint] = js.undefined
}

object WithWidthProps {
  @scala.inline
  def apply(innerRef: Ref[_] | RefObject[_] = null, width: Breakpoint = null): WithWidthProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[WithWidthProps]
  }
}

