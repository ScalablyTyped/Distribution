package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typings.hdrHistogramJs.byteBufferMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHistogramEncodingMod {
  
  @JSImport("hdr-histogram-js/AbstractHistogram.encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doDecodeFromByteBuffer(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecodeFromByteBuffer")(buffer.asInstanceOf[js.Any], histogramConstr.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[AbstractHistogram]
  
  @scala.inline
  def doDecodeFromCompressedByteBuffer(buffer: default, histogramConstr: HistogramConstructor, minBarForHighestTrackableValue: Double): AbstractHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecodeFromCompressedByteBuffer")(buffer.asInstanceOf[js.Any], histogramConstr.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[AbstractHistogram]
  
  @scala.inline
  def encodeIntoByteBuffer(buffer: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoByteBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def encodeIntoCompressedByteBuffer(targetBuffer: default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedByteBuffer")(targetBuffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def encodeIntoCompressedByteBuffer(targetBuffer: default, compressionLevel: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedByteBuffer")(targetBuffer.asInstanceOf[js.Any], compressionLevel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* augmented module */
  object hdrHistogramJsAbstractHistogramAugmentingMod {
    
    trait AbstractHistogram extends StObject {
      
      def encodeIntoByteBuffer(buffer: default): Double
      @JSName("encodeIntoByteBuffer")
      var encodeIntoByteBuffer_Original: js.Function1[/* buffer */ default, Double]
      
      def encodeIntoCompressedByteBuffer(targetBuffer: default): Double
      def encodeIntoCompressedByteBuffer(targetBuffer: default, compressionLevel: Double): Double
      @JSName("encodeIntoCompressedByteBuffer")
      var encodeIntoCompressedByteBuffer_Original: js.Function2[/* targetBuffer */ default, /* compressionLevel */ js.UndefOr[Double], Double]
    }
    object AbstractHistogram {
      
      @scala.inline
      def apply(
        encodeIntoByteBuffer: /* buffer */ default => Double,
        encodeIntoCompressedByteBuffer: (/* targetBuffer */ default, /* compressionLevel */ js.UndefOr[Double]) => Double
      ): typings.hdrHistogramJs.abstractHistogramEncodingMod.hdrHistogramJsAbstractHistogramAugmentingMod.AbstractHistogram = {
        val __obj = js.Dynamic.literal(encodeIntoByteBuffer = js.Any.fromFunction1(encodeIntoByteBuffer), encodeIntoCompressedByteBuffer = js.Any.fromFunction2(encodeIntoCompressedByteBuffer))
        __obj.asInstanceOf[typings.hdrHistogramJs.abstractHistogramEncodingMod.hdrHistogramJsAbstractHistogramAugmentingMod.AbstractHistogram]
      }
      
      @scala.inline
      implicit class AbstractHistogramMutableBuilder[Self <: typings.hdrHistogramJs.abstractHistogramEncodingMod.hdrHistogramJsAbstractHistogramAugmentingMod.AbstractHistogram] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEncodeIntoByteBuffer(value: /* buffer */ default => Double): Self = StObject.set(x, "encodeIntoByteBuffer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEncodeIntoCompressedByteBuffer(value: (/* targetBuffer */ default, /* compressionLevel */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "encodeIntoCompressedByteBuffer", js.Any.fromFunction2(value))
      }
    }
  }
}
