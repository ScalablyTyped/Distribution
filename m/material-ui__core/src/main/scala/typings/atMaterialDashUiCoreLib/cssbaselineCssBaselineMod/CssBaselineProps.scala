package typings
package atMaterialDashUiCoreLib.cssbaselineCssBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object CssBaselineProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactElement[_] = null): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[CssBaselineProps]
  }
}

