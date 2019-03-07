package typings
package atIonicUtilsDashStreamLib.atIonicUtilsDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-stream", "ReadableStreamBuffer")
@js.native
class ReadableStreamBuffer ()
  extends nodeLib.streamMod.Readable {
  def this(opts: ReadableStreamBufferOptions) = this()
  var _size: scala.Double = js.native
  var _stopped: scala.Boolean = js.native
  var buffer: nodeLib.Buffer = js.native
  var chunkSize: scala.Double = js.native
  var growSize: scala.Double = js.native
  val size: scala.Double = js.native
  val stopped: scala.Boolean = js.native
  def _read(): scala.Unit = js.native
  /* protected */ def _send(): scala.Unit = js.native
  def feed(data: java.lang.String): scala.Unit = js.native
  def feed(data: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def feed(data: nodeLib.Buffer): scala.Unit = js.native
  def feed(data: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

