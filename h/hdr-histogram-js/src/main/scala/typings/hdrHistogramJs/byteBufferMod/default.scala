package typings.hdrHistogramJs.byteBufferMod

import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
@js.native
class default protected () extends ByteBuffer {
  def this(data: Uint8Array) = this()
  /* CompleteClass */
  override var data: Uint8Array = js.native
  /* CompleteClass */
  override var int32ArrayForConvert: Uint32Array = js.native
  /* CompleteClass */
  override var int8ArrayForConvert: Uint8Array = js.native
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override def get(): Double = js.native
  /* CompleteClass */
  override def getInt32(): Double = js.native
  /* CompleteClass */
  override def getInt64(): Double = js.native
  /* CompleteClass */
  override def put(value: Double): Unit = js.native
  /* CompleteClass */
  override def putArray(array: Uint8Array): Unit = js.native
  /* CompleteClass */
  override def putInt32(value: Double): Unit = js.native
  /* CompleteClass */
  override def putInt64(value: Double): Unit = js.native
  /* CompleteClass */
  override def resetPosition(): Unit = js.native
}

/* static members */
@JSImport("hdr-histogram-js/ByteBuffer", JSImport.Default)
@js.native
object default extends js.Object {
  def allocate(): ByteBuffer = js.native
  def allocate(size: Double): ByteBuffer = js.native
}

