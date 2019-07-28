package typings.libsodiumDashWrappers

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: Uint8Array
  var tag: Double
}

object Anon_Message {
  @scala.inline
  def apply(message: Uint8Array, tag: Double): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message, tag = tag)
  
    __obj.asInstanceOf[Anon_Message]
  }
}

