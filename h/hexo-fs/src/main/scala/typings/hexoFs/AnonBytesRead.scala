package typings.hexoFs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesRead extends js.Object {
  var buffer: Uint8Array
  var bytesRead: Double
}

object AnonBytesRead {
  @scala.inline
  def apply(buffer: Uint8Array, bytesRead: Double): AnonBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesRead]
  }
}

