package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Message")
@js.native
class Message protected () extends js.Object {
  def this(user: User) = this()
  def this(user: User, done: Boolean) = this()
  var id: String = js.native
  var room: String = js.native
  var text: String | Null = js.native
  var user: User = js.native
  def finish(): Unit = js.native
}

