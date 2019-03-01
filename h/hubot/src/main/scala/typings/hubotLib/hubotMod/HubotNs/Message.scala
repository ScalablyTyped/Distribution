package typings
package hubotLib.hubotMod.HubotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var id: java.lang.String
  var text: java.lang.String
  var user: User
}

object Message {
  @scala.inline
  def apply(id: java.lang.String, text: java.lang.String, user: User): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Message]
  }
}

