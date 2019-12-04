package typings.atMaterialDashUiCore.listItemMergeListContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeWithListContextProps extends js.Object {
  var dense: js.UndefOr[Boolean] = js.undefined
}

object MergeWithListContextProps {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): MergeWithListContextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeWithListContextProps]
  }
}

