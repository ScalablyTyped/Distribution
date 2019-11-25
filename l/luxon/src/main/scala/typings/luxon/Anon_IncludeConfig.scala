package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeConfig extends js.Object {
  var includeConfig: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeConfig {
  @scala.inline
  def apply(includeConfig: js.UndefOr[Boolean] = js.undefined): Anon_IncludeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeConfig)) __obj.updateDynamic("includeConfig")(includeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeConfig]
  }
}

