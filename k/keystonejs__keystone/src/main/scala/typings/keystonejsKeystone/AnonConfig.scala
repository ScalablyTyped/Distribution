package typings.keystonejsKeystone

import typings.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig[ListNames /* <: String */] extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var list: ListNames
  var `type`: BaseAuthStrategy
}

object AnonConfig {
  @scala.inline
  def apply[ListNames /* <: String */](list: ListNames, `type`: BaseAuthStrategy, config: js.Any = null): AnonConfig[ListNames] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig[ListNames]]
  }
}

