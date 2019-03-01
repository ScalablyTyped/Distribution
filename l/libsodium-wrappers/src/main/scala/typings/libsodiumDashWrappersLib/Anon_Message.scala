package typings
package libsodiumDashWrappersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: stdLib.Uint8Array
  var tag: scala.Double
}

object Anon_Message {
  @scala.inline
  def apply(message: stdLib.Uint8Array, tag: scala.Double): Anon_Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_Message]
  }
}

