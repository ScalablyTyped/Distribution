package typings.luxon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeConfig extends js.Object {
  var includeConfig: js.UndefOr[Boolean] = js.undefined
}

object IncludeConfig {
  @scala.inline
  def apply(includeConfig: js.UndefOr[Boolean] = js.undefined): IncludeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeConfig)) __obj.updateDynamic("includeConfig")(includeConfig.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeConfig]
  }
}

