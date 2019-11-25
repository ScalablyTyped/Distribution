package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTag extends js.Object {
  var message: Uint8Array
  var tag: Double
}

object MessageTag {
  @scala.inline
  def apply(message: Uint8Array, tag: Double): MessageTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageTag]
  }
}

