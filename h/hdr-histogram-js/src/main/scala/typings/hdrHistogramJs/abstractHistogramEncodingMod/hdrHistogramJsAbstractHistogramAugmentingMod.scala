package typings.hdrHistogramJs.abstractHistogramEncodingMod

import typings.hdrHistogramJs.byteBufferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("hdr-histogram-js/AbstractHistogram", JSImport.Namespace)
@js.native
object hdrHistogramJsAbstractHistogramAugmentingMod extends js.Object {
  @js.native
  trait AbstractHistogram extends js.Object {
    @JSName("encodeIntoByteBuffer")
    var encodeIntoByteBuffer_Original: js.Function1[/* buffer */ default, Double] = js.native
    @JSName("encodeIntoCompressedByteBuffer")
    var encodeIntoCompressedByteBuffer_Original: js.Function2[/* targetBuffer */ default, /* compressionLevel */ js.UndefOr[Double], Double] = js.native
    def encodeIntoByteBuffer(buffer: default): Double = js.native
    def encodeIntoCompressedByteBuffer(targetBuffer: default): Double = js.native
    def encodeIntoCompressedByteBuffer(targetBuffer: default, compressionLevel: Double): Double = js.native
  }
  
}

