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

