package typings.hubot.hubotMod

import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Response")
@js.native
class Response[R] protected () extends js.Object {
  def this(robot: R, message: Message, `match`: RegExpMatchArray) = this()
  var `match`: RegExpMatchArray = js.native
  var message: Message = js.native
  def emote(strings: String*): Unit = js.native
  def locked(strings: String*): Unit = js.native
  def play(strings: String*): Unit = js.native
  def random[T](items: js.Array[T]): T = js.native
  def reply(strings: String*): Unit = js.native
  def send(strings: String*): Unit = js.native
  def topic(strings: String*): Unit = js.native
}

