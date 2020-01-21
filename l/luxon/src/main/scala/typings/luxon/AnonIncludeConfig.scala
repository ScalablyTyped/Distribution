package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeConfig extends js.Object {
  var includeConfig: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeConfig {
  @scala.inline
  def apply(includeConfig: js.UndefOr[Boolean] = js.undefined): AnonIncludeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeConfig)) __obj.updateDynamic("includeConfig")(includeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeConfig]
  }
}

