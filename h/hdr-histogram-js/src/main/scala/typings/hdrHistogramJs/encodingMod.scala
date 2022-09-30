package typings.hdrHistogramJs

import typings.hdrHistogramJs.hdrHistogramJsInts.`16`
import typings.hdrHistogramJs.hdrHistogramJsInts.`32`
import typings.hdrHistogramJs.hdrHistogramJsInts.`64`
import typings.hdrHistogramJs.hdrHistogramJsInts.`8`
import typings.hdrHistogramJs.hdrHistogramJsStrings.packed
import typings.hdrHistogramJs.histogramMod.Histogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("hdr-histogram-js/dist/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeFromCompressedBase64(base64String: String): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any]).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(base64String: String, bitBucketSize: `8` | `16` | `32` | `64` | packed): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(base64String: String, bitBucketSize: `8` | `16` | `32` | `64` | packed, useWebAssembly: Boolean): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(
    base64String: String,
    bitBucketSize: `8` | `16` | `32` | `64` | packed,
    useWebAssembly: Boolean,
    minBarForHighestTrackableValue: Double
  ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(
    base64String: String,
    bitBucketSize: `8` | `16` | `32` | `64` | packed,
    useWebAssembly: Unit,
    minBarForHighestTrackableValue: Double
  ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(base64String: String, bitBucketSize: Unit, useWebAssembly: Boolean): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(
    base64String: String,
    bitBucketSize: Unit,
    useWebAssembly: Boolean,
    minBarForHighestTrackableValue: Double
  ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  inline def decodeFromCompressedBase64(
    base64String: String,
    bitBucketSize: Unit,
    useWebAssembly: Unit,
    minBarForHighestTrackableValue: Double
  ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromCompressedBase64")(base64String.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], useWebAssembly.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  
  inline def decompress(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeIntoCompressedBase64(histogram: Histogram): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedBase64")(histogram.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeIntoCompressedBase64(histogram: Histogram, compressionLevel: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedBase64")(histogram.asInstanceOf[js.Any], compressionLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* augmented module */
  object hdrHistogramJsDistWasmAugmentingMod {
    
    trait WasmHistogram extends StObject {
      
      def encodeIntoCompressedBase64(): String
      def encodeIntoCompressedBase64(compressionLevel: Double): String
      @JSName("encodeIntoCompressedBase64")
      var encodeIntoCompressedBase64_Original: js.Function1[/* compressionLevel */ js.UndefOr[Double], String]
    }
    object WasmHistogram {
      
      inline def apply(encodeIntoCompressedBase64: /* compressionLevel */ js.UndefOr[Double] => String): WasmHistogram = {
        val __obj = js.Dynamic.literal(encodeIntoCompressedBase64 = js.Any.fromFunction1(encodeIntoCompressedBase64))
        __obj.asInstanceOf[WasmHistogram]
      }
      
      extension [Self <: WasmHistogram](x: Self) {
        
        inline def setEncodeIntoCompressedBase64(value: /* compressionLevel */ js.UndefOr[Double] => String): Self = StObject.set(x, "encodeIntoCompressedBase64", js.Any.fromFunction1(value))
      }
    }
  }
}
