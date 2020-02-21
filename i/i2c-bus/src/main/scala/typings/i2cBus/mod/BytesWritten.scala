package typings.i2cBus.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWritten extends js.Object {
  var buffer: Buffer
  var bytesWritten: Double
}

object BytesWritten {
  @scala.inline
  def apply(buffer: Buffer, bytesWritten: Double): BytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BytesWritten]
  }
}

