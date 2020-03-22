package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDense extends js.Object {
  var dense: js.UndefOr[Boolean] = js.native
}

object AnonDense {
  @scala.inline
  def apply(dense: js.UndefOr[Boolean] = js.undefined): AnonDense = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDense]
  }
}

