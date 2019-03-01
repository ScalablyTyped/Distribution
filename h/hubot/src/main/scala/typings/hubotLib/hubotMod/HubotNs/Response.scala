package typings
package hubotLib.hubotMod.HubotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[R] extends js.Object {
  var `match`: stdLib.RegExpMatchArray
  var message: Message
  def random[T](items: js.Array[T]): T
  def reply(strings: java.lang.String*): scala.Unit
  def send(strings: java.lang.String*): scala.Unit
}

object Response {
  @scala.inline
  def apply[R](
    `match`: stdLib.RegExpMatchArray,
    message: Message,
    random: js.Function1[js.Array[js.Any], js.Any],
    reply: js.Function1[/* repeated */ java.lang.String, scala.Unit],
    send: js.Function1[/* repeated */ java.lang.String, scala.Unit]
  ): Response[R] = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("random")(random)
    __obj.updateDynamic("reply")(reply)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[Response[R]]
  }
}

