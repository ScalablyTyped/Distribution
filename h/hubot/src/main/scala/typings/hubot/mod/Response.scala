package typings.hubot.mod

import typings.scopedHttpClient.mod.Options
import typings.scopedHttpClient.mod.ScopedClient
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Response")
@js.native
class Response[A /* <: Adapter */, M /* <: Message */] protected () extends js.Object {
  def this(robot: Robot[A], message: Message, `match`: RegExpMatchArray) = this()
  var envelope: Envelope = js.native
  var `match`: RegExpMatchArray = js.native
  var message: Message = js.native
  def emote(strings: String*): Unit = js.native
  def finish(): Unit = js.native
  def http(url: String): ScopedClient = js.native
  def http(url: String, options: Options): ScopedClient = js.native
  def locked(strings: String*): Unit = js.native
  def play(strings: String*): Unit = js.native
  def random[T](items: js.Array[T]): T = js.native
  def reply(strings: String*): Unit = js.native
  def send(strings: String*): Unit = js.native
  def topic(strings: String*): Unit = js.native
}

