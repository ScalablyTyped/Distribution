package typings.koaDashUseragent.koaDashUseragentMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var userAgent: typings.koaDashUseragent.koaDashUseragentMod.UserAgent.UserAgent
}

object Context {
  @scala.inline
  def apply(userAgent: typings.koaDashUseragent.koaDashUseragentMod.UserAgent.UserAgent): Context = {
    val __obj = js.Dynamic.literal(userAgent = userAgent)
  
    __obj.asInstanceOf[Context]
  }
}

