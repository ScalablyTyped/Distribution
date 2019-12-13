package typings.atIonicUtilsDashStream.atIonicUtilsDashStreamMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-stream", "ReadableStreamBuffer")
@js.native
class ReadableStreamBuffer () extends Readable {
  def this(opts: ReadableStreamBufferOptions) = this()
  var _size: Double = js.native
  var _stopped: Boolean = js.native
  var buffer: Buffer = js.native
  var chunkSize: Double = js.native
  var growSize: Double = js.native
  def _read(): Unit = js.native
  /* protected */ def _send(): Unit = js.native
  def feed(data: String): Unit = js.native
  def feed(data: String, encoding: String): Unit = js.native
  def feed(data: Buffer): Unit = js.native
  def feed(data: Buffer, encoding: String): Unit = js.native
  def size(): Double = js.native
  def stop(): Unit = js.native
  def stopped(): Boolean = js.native
}

