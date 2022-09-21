package typings.hdrHistogramJs

import typings.hdrHistogramJs.hdrHistogramJsNumbers.`1`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`2`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`3`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`4`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`5`
import typings.hdrHistogramJs.histogramMod.BitBucketSize
import typings.hdrHistogramJs.histogramMod.Histogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramBuilderMod {
  
  @JSImport("hdr-histogram-js/dist/HistogramBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[Histogram]
  inline def build(request: BuildRequest): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(request.asInstanceOf[js.Any]).asInstanceOf[Histogram]
  
  @JSImport("hdr-histogram-js/dist/HistogramBuilder", "defaultRequest")
  @js.native
  val defaultRequest: BuildRequest = js.native
  
  trait BuildRequest extends StObject {
    
    /**
      * Control whether or not the histogram can auto-resize and auto-adjust it's
      * highestTrackableValue
      * Default value is true
      */
    var autoResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size in bit of each count bucket
      * Default value is 32
      */
    var bitBucketSize: js.UndefOr[BitBucketSize] = js.undefined
    
    /**
      * The highest value to be tracked by the histogram. Must be a positive
      * integer that is {@literal >=} (2 * lowestDiscernibleValue).
      * Default value is Number.MAX_SAFE_INTEGER
      */
    var highestTrackableValue: js.UndefOr[Double] = js.undefined
    
    /**
      * The lowest value that can be discerned (distinguished from 0) by the histogram.
      * Must be a positive integer that is {@literal >=} 1. May be internally rounded
      * down to nearest power of 2.
      * Default value is 1
      */
    var lowestDiscernibleValue: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of significant decimal digits to which the histogram will
      * maintain value resolution and separation. Must be a non-negative
      * integer between 0 and 5.
      * Default value is 3
      */
    var numberOfSignificantValueDigits: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
    
    /**
      * Is WebAssembly used to speed up computations.
      * Default value is false
      */
    var useWebAssembly: js.UndefOr[Boolean] = js.undefined
  }
  object BuildRequest {
    
    inline def apply(): BuildRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildRequest]
    }
    
    extension [Self <: BuildRequest](x: Self) {
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      inline def setBitBucketSize(value: BitBucketSize): Self = StObject.set(x, "bitBucketSize", value.asInstanceOf[js.Any])
      
      inline def setBitBucketSizeUndefined: Self = StObject.set(x, "bitBucketSize", js.undefined)
      
      inline def setHighestTrackableValue(value: Double): Self = StObject.set(x, "highestTrackableValue", value.asInstanceOf[js.Any])
      
      inline def setHighestTrackableValueUndefined: Self = StObject.set(x, "highestTrackableValue", js.undefined)
      
      inline def setLowestDiscernibleValue(value: Double): Self = StObject.set(x, "lowestDiscernibleValue", value.asInstanceOf[js.Any])
      
      inline def setLowestDiscernibleValueUndefined: Self = StObject.set(x, "lowestDiscernibleValue", js.undefined)
      
      inline def setNumberOfSignificantValueDigits(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "numberOfSignificantValueDigits", value.asInstanceOf[js.Any])
      
      inline def setNumberOfSignificantValueDigitsUndefined: Self = StObject.set(x, "numberOfSignificantValueDigits", js.undefined)
      
      inline def setUseWebAssembly(value: Boolean): Self = StObject.set(x, "useWebAssembly", value.asInstanceOf[js.Any])
      
      inline def setUseWebAssemblyUndefined: Self = StObject.set(x, "useWebAssembly", js.undefined)
    }
  }
}
