package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWrittenNumber extends js.Object {
  var buffer: java.lang.String
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWrittenNumber {
  @scala.inline
  def apply(buffer: java.lang.String, bytesWritten: scala.Double): Anon_BufferBytesWrittenNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("bytesWritten")(bytesWritten)
    __obj.asInstanceOf[Anon_BufferBytesWrittenNumber]
  }
}

