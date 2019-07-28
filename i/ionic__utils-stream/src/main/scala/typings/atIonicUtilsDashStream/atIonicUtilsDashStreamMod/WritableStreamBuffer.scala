package typings.atIonicUtilsDashStream.atIonicUtilsDashStreamMod

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-stream", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer () extends Writable {
  def this(opts: WritableStreamBufferOptions) = this()
  var _size: Double = js.native
  var buffer: Buffer = js.native
  var growSize: Double = js.native
  val size: Double = js.native
  def _write(chunk: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def consume(): Buffer = js.native
  def consume(bytes: Double): Buffer = js.native
}

