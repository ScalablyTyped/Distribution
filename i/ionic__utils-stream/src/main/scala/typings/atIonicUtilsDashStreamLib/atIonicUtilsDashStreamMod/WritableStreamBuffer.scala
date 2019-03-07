package typings
package atIonicUtilsDashStreamLib.atIonicUtilsDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-stream", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer ()
  extends nodeLib.streamMod.Writable {
  def this(opts: WritableStreamBufferOptions) = this()
  var _size: scala.Double = js.native
  var buffer: nodeLib.Buffer = js.native
  var growSize: scala.Double = js.native
  val size: scala.Double = js.native
  def _write(chunk: js.Any, encoding: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def consume(): nodeLib.Buffer = js.native
  def consume(bytes: scala.Double): nodeLib.Buffer = js.native
}

