package typings.hexoFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferString extends js.Object {
  var buffer: String
  var bytesWritten: Double
}

object BufferString {
  @scala.inline
  def apply(buffer: String, bytesWritten: Double): BufferString = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferString]
  }
}

