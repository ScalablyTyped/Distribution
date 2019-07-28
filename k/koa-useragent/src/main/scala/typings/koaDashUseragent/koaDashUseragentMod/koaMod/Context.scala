package typings.koaDashUseragent.koaDashUseragentMod.koaMod

import typings.koaDashUseragent.koaDashUseragentMod.UserAgentNs.UserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var userAgent: UserAgent
}

object Context {
  @scala.inline
  def apply(userAgent: UserAgent): Context = {
    val __obj = js.Dynamic.literal(userAgent = userAgent)
  
    __obj.asInstanceOf[Context]
  }
}

