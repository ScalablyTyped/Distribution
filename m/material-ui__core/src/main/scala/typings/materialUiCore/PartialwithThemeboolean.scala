package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  withTheme  :boolean}> */
@js.native
trait PartialwithThemeboolean extends js.Object {
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialwithThemeboolean {
  @scala.inline
  def apply(withTheme: js.UndefOr[Boolean] = js.undefined): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
}

