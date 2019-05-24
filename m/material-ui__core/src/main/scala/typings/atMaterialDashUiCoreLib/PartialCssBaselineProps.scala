package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineProps> */
trait PartialCssBaselineProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
}

object PartialCssBaselineProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactElement[_] = null): PartialCssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[PartialCssBaselineProps]
  }
}

