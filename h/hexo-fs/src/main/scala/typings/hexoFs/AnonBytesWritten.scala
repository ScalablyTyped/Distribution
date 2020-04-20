package typings.hexoFs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesWritten extends js.Object {
  var buffer: Buffer
  var bytesWritten: Double
}

object AnonBytesWritten {
  @scala.inline
  def apply(buffer: Buffer, bytesWritten: Double): AnonBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesWritten]
  }
}

