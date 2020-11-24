package typings.ionicUtilsStream.mod

import typings.node.Buffer
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-stream", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer () extends Writable {
  def this(opts: WritableStreamBufferOptions) = this()
  
  var _size: Double = js.native
  
  def _write(chunk: js.Any, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  
  var buffer: Buffer = js.native
  
  def consume(): Buffer = js.native
  def consume(bytes: Double): Buffer = js.native
  
  var growSize: Double = js.native
  
  def size: Double = js.native
}
