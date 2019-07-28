package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidth> */
trait PartialWithWidth extends js.Object {
  var width: js.UndefOr[Breakpoint] = js.undefined
}

object PartialWithWidth {
  @scala.inline
  def apply(width: Breakpoint = null): PartialWithWidth = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PartialWithWidth]
  }
}

