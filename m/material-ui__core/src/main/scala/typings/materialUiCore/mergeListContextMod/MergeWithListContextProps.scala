package typings.materialUiCore.mergeListContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeWithListContextProps extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object MergeWithListContextProps {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): MergeWithListContextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeWithListContextProps]
  }
}

