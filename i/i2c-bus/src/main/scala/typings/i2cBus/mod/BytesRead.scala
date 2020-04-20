package typings.i2cBus.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesRead extends js.Object {
  var buffer: Buffer
  var bytesRead: Double
}

object BytesRead {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
}

