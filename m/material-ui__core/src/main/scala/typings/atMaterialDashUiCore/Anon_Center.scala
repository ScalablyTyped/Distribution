package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: js.UndefOr[Boolean] = js.undefined
}

object Anon_Center {
  @scala.inline
  def apply(center: js.UndefOr[Boolean] = js.undefined): Anon_Center = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Center]
  }
}

