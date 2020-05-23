package typings.ionic.libIntegrationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationOptions extends js.Object {
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object IntegrationOptions {
  @scala.inline
  def apply(quiet: js.UndefOr[Boolean] = js.undefined): IntegrationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationOptions]
  }
}

