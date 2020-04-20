package typings.koaUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentContext extends js.Object {
  var userAgent: typings.koaUseragent.useragentMod.default
}

object UserAgentContext {
  @scala.inline
  def apply(userAgent: typings.koaUseragent.useragentMod.default): UserAgentContext = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentContext]
  }
}

