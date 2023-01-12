package typings.hdrHistogramJs

import typings.hdrHistogramJs.distHistogramMod.BitBucketSize
import typings.hdrHistogramJs.distJsHistogramMod.JsHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsHistogramDotencodingMod {
  
  @JSImport("hdr-histogram-js/dist/JsHistogram.encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decompress(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("hdr-histogram-js/dist/JsHistogram.encoding", "deflate")
  @js.native
  val deflate: Any = js.native
  
  inline def doDecode(data: js.typedarray.Uint8Array): JsHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("doDecode")(data.asInstanceOf[js.Any]).asInstanceOf[JsHistogram]
  inline def doDecode(data: js.typedarray.Uint8Array, bitBucketSize: Unit, minBarForHighestTrackableValue: Double): JsHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[JsHistogram]
  inline def doDecode(data: js.typedarray.Uint8Array, bitBucketSize: BitBucketSize): JsHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any])).asInstanceOf[JsHistogram]
  inline def doDecode(
    data: js.typedarray.Uint8Array,
    bitBucketSize: BitBucketSize,
    minBarForHighestTrackableValue: Double
  ): JsHistogram = (^.asInstanceOf[js.Dynamic].applyDynamic("doDecode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[JsHistogram]
  
  @JSImport("hdr-histogram-js/dist/JsHistogram.encoding", "inflate")
  @js.native
  val inflate: Any = js.native
  
  /* augmented module */
  object hdrHistogramJsDistJsHistogramAugmentingMod {
    
    trait JsHistogram extends StObject {
      
      def encodeIntoCompressedBase64(): String
      def encodeIntoCompressedBase64(compressionLevel: Double): String
      @JSName("encodeIntoCompressedBase64")
      var encodeIntoCompressedBase64_Original: js.Function1[/* compressionLevel */ js.UndefOr[Double], String]
    }
    object JsHistogram {
      
      inline def apply(encodeIntoCompressedBase64: /* compressionLevel */ js.UndefOr[Double] => String): typings.hdrHistogramJs.distJsHistogramDotencodingMod.hdrHistogramJsDistJsHistogramAugmentingMod.JsHistogram = {
        val __obj = js.Dynamic.literal(encodeIntoCompressedBase64 = js.Any.fromFunction1(encodeIntoCompressedBase64))
        __obj.asInstanceOf[typings.hdrHistogramJs.distJsHistogramDotencodingMod.hdrHistogramJsDistJsHistogramAugmentingMod.JsHistogram]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.hdrHistogramJs.distJsHistogramDotencodingMod.hdrHistogramJsDistJsHistogramAugmentingMod.JsHistogram] (val x: Self) extends AnyVal {
        
        inline def setEncodeIntoCompressedBase64(value: /* compressionLevel */ js.UndefOr[Double] => String): Self = StObject.set(x, "encodeIntoCompressedBase64", js.Any.fromFunction1(value))
      }
    }
  }
}
