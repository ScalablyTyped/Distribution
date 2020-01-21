package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDenseBoolean extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object AnonDenseBoolean {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): AnonDenseBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDenseBoolean]
  }
}

