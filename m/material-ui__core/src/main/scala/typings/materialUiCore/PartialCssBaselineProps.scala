package typings.materialUiCore

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
@js.native
trait PartialCssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
}

object PartialCssBaselineProps {
  @scala.inline
  def apply(children: ReactElement = null): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
}

