package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer[TBuffer /* <: nodeLib.Buffer | stdLib.Uint8Array */] extends js.Object {
  var buffer: TBuffer
  var bytesRead: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply[TBuffer /* <: nodeLib.Buffer | stdLib.Uint8Array */](buffer: TBuffer, bytesRead: scala.Double): Anon_Buffer[TBuffer] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    __obj.updateDynamic("bytesRead")(bytesRead)
    __obj.asInstanceOf[Anon_Buffer[TBuffer]]
  }
}

