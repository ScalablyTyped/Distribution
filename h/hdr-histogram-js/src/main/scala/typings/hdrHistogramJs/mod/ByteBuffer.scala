package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.byteBufferMod.default
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js", "ByteBuffer")
@js.native
class ByteBuffer protected () extends default {
  def this(data: Uint8Array) = this()
}

/* static members */
@JSImport("hdr-histogram-js", "ByteBuffer")
@js.native
object ByteBuffer extends js.Object {
  def allocate(): typings.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
  def allocate(size: Double): typings.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
}

