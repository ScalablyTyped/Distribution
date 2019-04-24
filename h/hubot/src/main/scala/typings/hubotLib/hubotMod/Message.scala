package typings
package hubotLib.hubotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Message")
@js.native
class Message protected () extends js.Object {
  def this(user: User) = this()
  def this(user: User, done: scala.Boolean) = this()
  var id: java.lang.String = js.native
  var text: java.lang.String = js.native
  var user: User = js.native
  def finish(): scala.Unit = js.native
}

