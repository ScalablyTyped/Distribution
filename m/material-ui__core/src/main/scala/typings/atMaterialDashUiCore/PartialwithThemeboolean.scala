package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  withTheme  :boolean}> */
trait PartialwithThemeboolean extends js.Object {
  var withTheme: js.UndefOr[Boolean] = js.undefined
}

object PartialwithThemeboolean {
  @scala.inline
  def apply(withTheme: js.UndefOr[Boolean] = js.undefined): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
}

