package typings.atMaterialDashUiCore

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
trait PartialCssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
}

object PartialCssBaselineProps {
  @scala.inline
  def apply(children: ReactElement = null): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
}

