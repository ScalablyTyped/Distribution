package typings.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesWritten extends js.Object {
  var buffer: typings.node.Buffer
  var bytesWritten: Double
}

object BytesWritten {
  @scala.inline
  def apply(buffer: typings.node.Buffer, bytesWritten: Double): BytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten]
  }
}

