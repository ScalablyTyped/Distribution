package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hubot", "Message")
@js.native
class Message protected () extends js.Object {
  def this(user: User) = this()
  def this(user: User, done: Boolean) = this()
  
  def finish(): Unit = js.native
  
  var id: String = js.native
  
  var room: String = js.native
  
  var text: String | Null = js.native
  
  var user: User = js.native
}
