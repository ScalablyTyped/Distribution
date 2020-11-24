package typings.hdrHistogramJs.byteBufferMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
@js.native
class default protected () extends ByteBuffer {
  def this(data: Uint8Array) = this()
}
/* static members */
@JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def allocate(): ByteBuffer = js.native
  def allocate(size: Double): ByteBuffer = js.native
}
