package typings
package hubotLib.hubotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Response")
@js.native
class Response[R] protected () extends js.Object {
  def this(robot: R, message: Message, `match`: stdLib.RegExpMatchArray) = this()
  var `match`: stdLib.RegExpMatchArray = js.native
  var message: Message = js.native
  def random[T](items: js.Array[T]): T = js.native
  def reply(strings: java.lang.String*): scala.Unit = js.native
  def send(strings: java.lang.String*): scala.Unit = js.native
}

