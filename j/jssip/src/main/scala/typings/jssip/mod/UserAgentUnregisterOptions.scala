package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentUnregisterOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
}

object UserAgentUnregisterOptions {
  @scala.inline
  def apply(all: js.UndefOr[Boolean] = js.undefined): UserAgentUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentUnregisterOptions]
  }
}

