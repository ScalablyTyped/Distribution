package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWritten[TBuffer /* <: nodeLib.Buffer | stdLib.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesWritten: scala.Double
}

object Anon_BufferBytesWritten {
  @scala.inline
  def apply[TBuffer /* <: nodeLib.Buffer | stdLib.Uint8Array */](buffer: TBuffer, bytesWritten: scala.Double): Anon_BufferBytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_BufferBytesWritten[TBuffer]]
  }
}

