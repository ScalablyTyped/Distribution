package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[ListNames /* <: String */] extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var list: ListNames
  var `type`: BaseAuthStrategy
}

object Config {
  @scala.inline
  def apply[/* <: java.lang.String */ ListNames](list: ListNames, `type`: BaseAuthStrategy, config: js.Any = null): Config[ListNames] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[ListNames]]
  }
}

