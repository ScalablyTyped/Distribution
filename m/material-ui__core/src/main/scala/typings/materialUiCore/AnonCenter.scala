package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCenter extends js.Object {
  var center: js.UndefOr[Boolean] = js.native
}

object AnonCenter {
  @scala.inline
  def apply(center: js.UndefOr[Boolean] = js.undefined): AnonCenter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

