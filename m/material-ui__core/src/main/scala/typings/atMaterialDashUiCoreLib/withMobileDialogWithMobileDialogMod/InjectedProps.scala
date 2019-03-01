package typings
package atMaterialDashUiCoreLib.withMobileDialogWithMobileDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
}

object InjectedProps {
  @scala.inline
  def apply(fullScreen: js.UndefOr[scala.Boolean] = js.undefined): InjectedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    __obj.asInstanceOf[InjectedProps]
  }
}

