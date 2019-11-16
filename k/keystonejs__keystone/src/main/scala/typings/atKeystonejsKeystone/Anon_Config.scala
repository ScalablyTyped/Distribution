package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config[ListNames /* <: String */] extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var list: ListNames
  var `type`: BaseAuthStrategy
}

object Anon_Config {
  @scala.inline
  def apply[ListNames /* <: String */](list: ListNames, `type`: BaseAuthStrategy, config: js.Any = null): Anon_Config[ListNames] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Config[ListNames]]
  }
}

