package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typings.hdrHistogramJs.byteBufferMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHistogramEncodingMod {
  
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", "doDecodeFromByteBuffer")
  @js.native
  def doDecodeFromByteBuffer(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = js.native
  
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", "doDecodeFromCompressedByteBuffer")
  @js.native
  def doDecodeFromCompressedByteBuffer(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = js.native
  
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", "encodeIntoByteBuffer")
  @js.native
  def encodeIntoByteBuffer(buffer: default): Double = js.native
  
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", "encodeIntoCompressedByteBuffer")
  @js.native
  def encodeIntoCompressedByteBuffer(targetBuffer: default): Double = js.native
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", "encodeIntoCompressedByteBuffer")
  @js.native
  def encodeIntoCompressedByteBuffer(targetBuffer: default, compressionLevel: Double): Double = js.native
  
  /* augmented module */
  object hdrHistogramJsAbstractHistogramAugmentingMod {
    
    @js.native
    trait AbstractHistogram extends StObject {
      
      def encodeIntoByteBuffer(buffer: default): Double = js.native
      @JSName("encodeIntoByteBuffer")
      var encodeIntoByteBuffer_Original: js.Function1[/* buffer */ default, Double] = js.native
      
      def encodeIntoCompressedByteBuffer(targetBuffer: default): Double = js.native
      def encodeIntoCompressedByteBuffer(targetBuffer: default, compressionLevel: Double): Double = js.native
      @JSName("encodeIntoCompressedByteBuffer")
      var encodeIntoCompressedByteBuffer_Original: js.Function2[/* targetBuffer */ default, /* compressionLevel */ js.UndefOr[Double], Double] = js.native
    }
  }
}
