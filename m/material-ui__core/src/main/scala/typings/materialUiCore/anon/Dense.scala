package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dense extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object Dense {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): Dense = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dense]
  }
}

