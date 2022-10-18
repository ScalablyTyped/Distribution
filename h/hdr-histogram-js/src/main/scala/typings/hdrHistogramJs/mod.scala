package typings.hdrHistogramJs

import typings.hdrHistogramJs.distByteBufferMod.default
import typings.hdrHistogramJs.distHistogramBuilderMod.BuildRequest
import typings.hdrHistogramJs.distHistogramLogWriterMod.Writable
import typings.hdrHistogramJs.distHistogramMod.BitBucketSize
import typings.hdrHistogramJs.distHistogramMod.Histogram
import typings.hdrHistogramJs.hdrHistogramJsInts.`16`
import typings.hdrHistogramJs.hdrHistogramJsInts.`32`
import typings.hdrHistogramJs.hdrHistogramJsInts.`64`
import typings.hdrHistogramJs.hdrHistogramJsInts.`8`
import typings.hdrHistogramJs.hdrHistogramJsStrings.packed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hdr-histogram-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hdr-histogram-js", "ByteBuffer")
  @js.native
  open class ByteBuffer protected () extends default {
    def this(data: js.typedarray.Uint8Array) = this()
  }
  object ByteBuffer {
    
    @JSImport("hdr-histogram-js", "ByteBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def allocate(): typings.hdrHistogramJs.distByteBufferMod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")().asInstanceOf[typings.hdrHistogramJs.distByteBufferMod.ByteBuffer]
    inline def allocate(size: Double): typings.hdrHistogramJs.distByteBufferMod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(size.asInstanceOf[js.Any]).asInstanceOf[typings.hdrHistogramJs.distByteBufferMod.ByteBuffer]
  }
  
  @JSImport("hdr-histogram-js", "Float64Histogram")
  @js.native
  open class Float64Histogram protected ()
    extends typings.hdrHistogramJs.distFloat64HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  /**
    * A histogram log reader.
    * <p>
    * Histogram logs are used to capture full fidelity, per-time-interval
    * histograms of a recorded value.
    * <p>
    * For example, a histogram log can be used to capture high fidelity
    * reaction-time logs for some measured system or subsystem component.
    * Such a log would capture a full reaction time histogram for each
    * logged interval, and could be used to later reconstruct a full
    * HdrHistogram of the measured reaction time behavior for any arbitrary
    * time range within the log, by adding [only] the relevant interval
    * histograms.
    * <h3>Histogram log format:</h3>
    * A histogram log file consists of text lines. Lines beginning with
    * the "#" character are optional and treated as comments. Lines
    * containing the legend (starting with "Timestamp") are also optional
    * and ignored in parsing the histogram log. All other lines must
    * be valid interval description lines. Text fields are delimited by
    * commas, spaces.
    * <p>
    * A valid interval description line contains an optional Tag=tagString
    * text field, followed by an interval description.
    * <p>
    * A valid interval description must contain exactly four text fields:
    * <ul>
    * <li>StartTimestamp: The first field must contain a number parse-able as a Double value,
    * representing the start timestamp of the interval in seconds.</li>
    * <li>intervalLength: The second field must contain a number parse-able as a Double value,
    * representing the length of the interval in seconds.</li>
    * <li>Interval_Max: The third field must contain a number parse-able as a Double value,
    * which generally represents the maximum value of the interval histogram.</li>
    * <li>Interval_Compressed_Histogram: The fourth field must contain a text field
    * parse-able as a Base64 text representation of a compressed HdrHistogram.</li>
    * </ul>
    * The log file may contain an optional indication of a starting time. Starting time
    * is indicated using a special comments starting with "#[StartTime: " and followed
    * by a number parse-able as a double, representing the start time (in seconds)
    * that may be added to timestamps in the file to determine an absolute
    * timestamp (e.g. since the epoch) for each interval.
    */
  @JSImport("hdr-histogram-js", "HistogramLogReader")
  @js.native
  open class HistogramLogReader protected ()
    extends typings.hdrHistogramJs.distHistogramLogReaderMod.default {
    def this(logContent: String) = this()
    def this(logContent: String, bitBucketSize: BitBucketSize) = this()
    def this(logContent: String, bitBucketSize: Unit, useWebAssembly: Boolean) = this()
    def this(logContent: String, bitBucketSize: BitBucketSize, useWebAssembly: Boolean) = this()
  }
  
  @JSImport("hdr-histogram-js", "HistogramLogWriter")
  @js.native
  open class HistogramLogWriter protected ()
    extends typings.hdrHistogramJs.distHistogramLogWriterMod.default {
    def this(log: Writable) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int16Histogram")
  @js.native
  open class Int16Histogram protected ()
    extends typings.hdrHistogramJs.distInt16HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int32Histogram")
  @js.native
  open class Int32Histogram protected ()
    extends typings.hdrHistogramJs.distInt32HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int8Histogram")
  @js.native
  open class Int8Histogram protected ()
    extends typings.hdrHistogramJs.distInt8HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("hdr-histogram-js", "JsHistogram")
  @js.native
  open class JsHistogram protected ()
    extends StObject
       with typings.hdrHistogramJs.distJsHistogramMod.JsHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* CompleteClass */
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any = js.native
  }
  /* static members */
  object JsHistogram {
    
    @JSImport("hdr-histogram-js", "JsHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js", "JsHistogram.decode")
    @js.native
    def decode: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any = js.native
    inline def decode_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js", "JsHistogram.identityBuilder")
    @js.native
    def identityBuilder: Double = js.native
    inline def identityBuilder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identityBuilder")(x.asInstanceOf[js.Any])
  }
  
  /**
    * <h3>A High Dynamic Range (HDR) Histogram that uses a packed internal representation</h3>
    * <p>
    * {@link PackedHistogram} supports the recording and analyzing sampled data value counts across a configurable
    * integer value range with configurable value precision within the range. Value precision is expressed as the
    * number of significant digits in the value recording, and provides control over value quantization behavior
    * across the value range and the subsequent value resolution at any given level.
    * <p>
    * {@link PackedHistogram} tracks value counts in a packed internal representation optimized
    * for typical histogram recoded values are sparse in the value range and tend to be incremented in small unit counts.
    * This packed representation tends to require significantly smaller amounts of stoarge when compared to unpacked
    * representations, but can incur additional recording cost due to resizing and repacking operations that may
    * occur as previously unrecorded values are encountered.
    * <p>
    * For example, a {@link PackedHistogram} could be configured to track the counts of observed integer values between 0 and
    * 3,600,000,000,000 while maintaining a value precision of 3 significant digits across that range. Value quantization
    * within the range will thus be no larger than 1/1,000th (or 0.1%) of any value. This example Histogram could
    * be used to track and analyze the counts of observed response times ranging between 1 nanosecond and 1 hour
    * in magnitude, while maintaining a value resolution of 1 microsecond up to 1 millisecond, a resolution of
    * 1 millisecond (or better) up to one second, and a resolution of 1 second (or better) up to 1,000 seconds. At its
    * maximum tracked value (1 hour), it would still maintain a resolution of 3.6 seconds (or better).
    * <p>
    * Auto-resizing: When constructed with no specified value range range (or when auto-resize is turned on with {@link
    * Histogram#setAutoResize}) a {@link PackedHistogram} will auto-resize its dynamic range to include recorded values as
    * they are encountered. Note that recording calls that cause auto-resizing may take longer to execute, as resizing
    * incurs allocation and copying of internal data structures.
    * <p>
    */
  @JSImport("hdr-histogram-js", "PackedHistogram")
  @js.native
  open class PackedHistogram protected ()
    extends typings.hdrHistogramJs.distPackedHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  /**
    * Records integer values, and provides stable interval {@link Histogram} samples from
    * live recorded data without interrupting or stalling active recording of values. Each interval
    * histogram provided contains all value counts accumulated since the previous interval histogram
    * was taken.
    * <p>
    * This pattern is commonly used in logging interval histogram information while recording is ongoing.
    * <p>
    * {@link Recorder} supports concurrent
    * {@link Recorder#recordValue} or
    * {@link Recorder#recordValueWithExpectedInterval} calls.
    *
    */
  @JSImport("hdr-histogram-js", "Recorder")
  @js.native
  /**
    * Construct an auto-resizing {@link Recorder} with a lowest discernible value of
    * 1 and an auto-adjusting highestTrackableValue. Can auto-resize up to track values up to Number.MAX_SAFE_INTEGER.
    *
    * @param histogramBuildRequest parameters used to build histograms while using this recorder.
    * @param clock (for testing purpose) an action that give current time in ms since 1970
    */
  open class Recorder ()
    extends typings.hdrHistogramJs.distRecorderMod.default {
    def this(histogramBuildRequest: BuildRequest) = this()
    def this(histogramBuildRequest: Unit, clock: js.Function0[Double]) = this()
    def this(histogramBuildRequest: BuildRequest, clock: js.Function0[Double]) = this()
  }
  object Recorder {
    
    @JSImport("hdr-histogram-js", "Recorder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("hdr-histogram-js", "Recorder.idGenerator")
    @js.native
    def idGenerator: Double = js.native
    inline def idGenerator_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idGenerator")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hdr-histogram-js", "WasmHistogram")
  @js.native
  open class WasmHistogram protected ()
    extends typings.hdrHistogramJs.distWasmMod.WasmHistogram {
    def this(_wasmHistogram: Any, _remoteHistogramClass: String) = this()
  }
  /* static members */
  object WasmHistogram {
    
    @JSImport("hdr-histogram-js", "WasmHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(): typings.hdrHistogramJs.distWasmMod.WasmHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[typings.hdrHistogramJs.distWasmMod.WasmHistogram]
    inline def build(request: BuildRequest): typings.hdrHistogramJs.distWasmMod.WasmHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(request.asInstanceOf[js.Any]).asInstanceOf[typings.hdrHistogramJs.distWasmMod.WasmHistogram]
    
    inline def decode(data: js.typedarray.Uint8Array): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Histogram]
    inline def decode(data: js.typedarray.Uint8Array, bitBucketSize: `8` | `16` | `32` | `64` | packed): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any])).asInstanceOf[Histogram]
    inline def decode(
      data: js.typedarray.Uint8Array,
      bitBucketSize: `8` | `16` | `32` | `64` | packed,
      minBarForHighestTrackableValue: Double
    ): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
    inline def decode(data: js.typedarray.Uint8Array, bitBucketSize: Unit, minBarForHighestTrackableValue: Double): Histogram = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], bitBucketSize.asInstanceOf[js.Any], minBarForHighestTrackableValue.asInstanceOf[js.Any])).asInstanceOf[Histogram]
  }
  
  inline def build(): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[Histogram]
  inline def build(request: BuildRequest): Histogram = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(request.asInstanceOf[js.Any]).asInstanceOf[Histogram]
  
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
  
  inline def encodeIntoCompressedBase64(histogram: Histogram): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedBase64")(histogram.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeIntoCompressedBase64(histogram: Histogram, compressionLevel: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIntoCompressedBase64")(histogram.asInstanceOf[js.Any], compressionLevel.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def initWebAssembly(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initWebAssembly")().asInstanceOf[js.Promise[Unit]]
  
  inline def initWebAssemblySync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initWebAssemblySync")().asInstanceOf[Unit]
  
  inline def listTags(content: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTags")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
