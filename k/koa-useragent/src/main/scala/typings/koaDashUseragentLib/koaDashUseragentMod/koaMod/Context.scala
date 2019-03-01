package typings
package koaDashUseragentLib.koaDashUseragentMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var userAgent: koaDashUseragentLib.koaDashUseragentMod.UserAgentNs.UserAgent
}

object Context {
  @scala.inline
  def apply(userAgent: koaDashUseragentLib.koaDashUseragentMod.UserAgentNs.UserAgent): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Context]
  }
}

