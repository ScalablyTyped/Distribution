package typings
package hubotLib.hubotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Response")
@js.native
class Response[R] protected ()
  extends hubotLib.hubotMod.HubotNs.Response[R] {
  def this(robot: R, message: hubotLib.hubotMod.HubotNs.Message, `match`: stdLib.RegExpMatchArray) = this()
  /* CompleteClass */
  override var `match`: stdLib.RegExpMatchArray = js.native
  /* CompleteClass */
  override var message: hubotLib.hubotMod.HubotNs.Message = js.native
  /* CompleteClass */
  override def random[T](items: js.Array[T]): T = js.native
  /* CompleteClass */
  override def reply(strings: java.lang.String*): scala.Unit = js.native
  /* CompleteClass */
  override def send(strings: java.lang.String*): scala.Unit = js.native
}

