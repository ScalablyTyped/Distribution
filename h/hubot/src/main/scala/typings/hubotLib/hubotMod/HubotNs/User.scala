package typings
package hubotLib.hubotMod.HubotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var id: js.Any
  var name: java.lang.String
}

object User {
  @scala.inline
  def apply(id: js.Any, name: java.lang.String): User = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[User]
  }
}

