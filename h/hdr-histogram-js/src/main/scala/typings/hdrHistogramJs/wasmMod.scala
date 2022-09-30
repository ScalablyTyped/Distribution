package typings.hdrHistogramJs

import typings.hdrHistogramJs.hdrHistogramJsInts.`16`
import typings.hdrHistogramJs.hdrHistogramJsInts.`32`
import typings.hdrHistogramJs.hdrHistogramJsInts.`64`
import typings.hdrHistogramJs.hdrHistogramJsInts.`8`
import typings.hdrHistogramJs.hdrHistogramJsStrings.packed
import typings.hdrHistogramJs.histogramBuilderMod.BuildRequest
import typings.hdrHistogramJs.histogramMod.Histogram
import typings.hdrHistogramJs.histogramMod.HistogramSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wasmMod {
  
  @JSImport("hdr-histogram-js/dist/wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hdr-histogram-js/dist/wasm", "WasmHistogram")
  @js.native
  open class WasmHistogram protected ()
    extends StObject
       with Histogram {
    def this(_wasmHistogram: Any, _remoteHistogramClass: String) = this()
    
    /* private */ var _remoteHistogramClass: Any = js.native
    
    /* private */ var _wasmHistogram: Any = js.native
    
    def add(otherHistogram: WasmHistogram): Unit = js.native
    
    def addWhileCorrectingForCoordinatedOmission(otherHistogram: WasmHistogram, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    @JSName("autoResize")
    def autoResize_MWasmHistogram: Boolean = js.native
    
    def encode(): js.typedarray.Uint8Array = js.native
    
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof encodeWasmIntoCompressedBase64 */ Any = js.native
    
    @JSName("endTimeStampMsec")
    def endTimeStampMsec_MWasmHistogram: Double = js.native
    
    @JSName("estimatedFootprintInBytes")
    def estimatedFootprintInBytes_MWasmHistogram: Double = js.native
    
    def highestTrackableValue_=(value: Double): Unit = js.native
    @JSName("highestTrackableValue")
    def highestTrackableValue_MWasmHistogram: Double = js.native
    
    def inspect(): String = js.native
    
    /* private */ var isDestroyed: Any = js.native
    
    @JSName("maxValue")
    def maxValue_MWasmHistogram: Double = js.native
    
    @JSName("mean")
    def mean_MWasmHistogram: Double = js.native
    
    @JSName("minNonZeroValue")
    def minNonZeroValue_MWasmHistogram: Double = js.native
    
    @JSName("numberOfSignificantValueDigits")
    def numberOfSignificantValueDigits_MWasmHistogram: Double = js.native
    
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    
    @JSName("startTimeStampMsec")
    def startTimeStampMsec_MWasmHistogram: Double = js.native
    
    @JSName("stdDeviation")
    def stdDeviation_MWasmHistogram: Double = js.native
    
    def subtract(otherHistogram: WasmHistogram): Unit = js.native
    
    @JSName("summary")
    def summary_MWasmHistogram: HistogramSummary = js.native
    
    @JSName("totalCount")
    def totalCount_MWasmHistogram: Double = js.native
  }
  /* static members */
  object WasmHistogram {
    
    @JSImport("hdr-histogram-js/dist/wasm", "WasmHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): WasmHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[WasmHistogram]
    inline def build(request: BuildRequest): WasmHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(request.asInstanceOf[js.Any]).asInstanceOf[WasmHistogram]
    
    inline def decode(data: js.typedarray.Uint8Array): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Histogram]
    inline def decode(data: js.typedarray.Uint8Array, bitBucketSize: `8` | `16` | `32` | `64` | packed): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any])).asInstanceOf[Histogram]
    inline def decode(
      data: js.typedarray.Uint8Array,
      bitBucketSize: `8` | `16` | `32` | `64` | packed,
      minBarForHighestTrackableValue: Double
    ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
    inline def decode(data: js.typedarray.Uint8Array, bitBucketSize: Unit, minBarForHighestTrackableValue: Double): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  }
  
  inline def initWebAssembly(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initWebAssembly")().asInstanceOf[js.Promise[Unit]]
  
  inline def initWebAssemblySync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initWebAssemblySync")().asInstanceOf[Unit]
  
  @JSImport("hdr-histogram-js/dist/wasm", "webAssemblyAvailable")
  @js.native
  val webAssemblyAvailable: Boolean = js.native
  
  inline def webAssemblyReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("webAssemblyReady")().asInstanceOf[Boolean]
}
