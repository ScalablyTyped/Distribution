package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typings.hdrHistogramJs.anon.HistogramConstr
import typings.hdrHistogramJs.byteBufferMod.default
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`16`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`1`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`2`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`32`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`3`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`4`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`5`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`64`
import typings.hdrHistogramJs.hdrHistogramJsNumbers.`8`
import typings.hdrHistogramJs.hdrHistogramJsStrings.packed
import typings.hdrHistogramJs.hdrHistogramJsStrings.sparse_array
import typings.hdrHistogramJs.histogramLogWriterMod.Writable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hdr-histogram-js", "AbstractHistogram")
  @js.native
  abstract class AbstractHistogram protected ()
    extends typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  object AbstractHistogram {
    
    @JSImport("hdr-histogram-js", "AbstractHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js", "AbstractHistogram.decodeFromByteBuffer")
    @js.native
    def decodeFromByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any = js.native
    @scala.inline
    def decodeFromByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromByteBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js", "AbstractHistogram.decodeFromCompressedByteBuffer")
    @js.native
    def decodeFromCompressedByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any = js.native
    @scala.inline
    def decodeFromCompressedByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromCompressedByteBuffer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hdr-histogram-js", "ByteBuffer")
  @js.native
  class ByteBuffer protected () extends default {
    def this(data: Uint8Array) = this()
  }
  object ByteBuffer {
    
    /* static member */
    @JSImport("hdr-histogram-js", "ByteBuffer.allocate")
    @js.native
    def allocate(): typings.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
    @JSImport("hdr-histogram-js", "ByteBuffer.allocate")
    @js.native
    def allocate(size: Double): typings.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
  }
  
  @JSImport("hdr-histogram-js", "Float64Histogram")
  @js.native
  class Float64Histogram protected ()
    extends typings.hdrHistogramJs.float64HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "Histogram")
  @js.native
  abstract class Histogram protected ()
    extends typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  object Histogram {
    
    @JSImport("hdr-histogram-js", "Histogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js", "Histogram.decodeFromByteBuffer")
    @js.native
    def decodeFromByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any = js.native
    @scala.inline
    def decodeFromByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromByteBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js", "Histogram.decodeFromCompressedByteBuffer")
    @js.native
    def decodeFromCompressedByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any = js.native
    @scala.inline
    def decodeFromCompressedByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromCompressedByteBuffer")(x.asInstanceOf[js.Any])
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
  class HistogramLogReader protected ()
    extends typings.hdrHistogramJs.histogramLogReaderMod.default {
    def this(logContent: String) = this()
    def this(logContent: String, options: HistogramConstr) = this()
  }
  
  @JSImport("hdr-histogram-js", "HistogramLogWriter")
  @js.native
  class HistogramLogWriter protected ()
    extends typings.hdrHistogramJs.histogramLogWriterMod.default {
    def this(log: Writable) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int16Histogram")
  @js.native
  class Int16Histogram protected ()
    extends typings.hdrHistogramJs.int16HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int32Histogram")
  @js.native
  class Int32Histogram protected ()
    extends typings.hdrHistogramJs.int32HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "Int8Histogram")
  @js.native
  class Int8Histogram protected ()
    extends typings.hdrHistogramJs.int8HistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
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
  class PackedHistogram protected ()
    extends typings.hdrHistogramJs.packedHistogramMod.default {
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
    * @param numberOfSignificantValueDigits Specifies the precision to use. This is the number of significant
    *                                       decimal digits to which the histogram will maintain value resolution
    *                                       and separation. Must be a non-negative integer between 0 and 5.
    * @param packed Specifies whether the recorder will uses a packed internal representation or not.
    * @param clock (for testing purpose) an action that give current time in ms since 1970
    */
  class Recorder ()
    extends typings.hdrHistogramJs.recorderMod.default {
    def this(numberOfSignificantValueDigits: Double) = this()
    def this(numberOfSignificantValueDigits: js.UndefOr[scala.Nothing], packed: Boolean) = this()
    def this(numberOfSignificantValueDigits: Double, packed: Boolean) = this()
    def this(
      numberOfSignificantValueDigits: js.UndefOr[scala.Nothing],
      packed: js.UndefOr[scala.Nothing],
      clock: js.Function0[Double]
    ) = this()
    def this(
      numberOfSignificantValueDigits: js.UndefOr[scala.Nothing],
      packed: Boolean,
      clock: js.Function0[Double]
    ) = this()
    def this(
      numberOfSignificantValueDigits: Double,
      packed: js.UndefOr[scala.Nothing],
      clock: js.Function0[Double]
    ) = this()
    def this(numberOfSignificantValueDigits: Double, packed: Boolean, clock: js.Function0[Double]) = this()
  }
  object Recorder {
    
    @JSImport("hdr-histogram-js", "Recorder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("hdr-histogram-js", "Recorder.idGenerator")
    @js.native
    def idGenerator: Double = js.native
    @scala.inline
    def idGenerator_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idGenerator")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hdr-histogram-js", "SparseArrayHistogram")
  @js.native
  class SparseArrayHistogram protected ()
    extends typings.hdrHistogramJs.sparseArrayHistogramMod.default {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  
  @JSImport("hdr-histogram-js", "build")
  @js.native
  def build(): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  @JSImport("hdr-histogram-js", "build")
  @js.native
  def build(request: BuildRequest): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  
  @JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(base64String: String): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  @JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: js.UndefOr[scala.Nothing],
    minBarForHighestTrackableValue: Double
  ): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  @JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(base64String: String, histogramConstr: HistogramConstructor): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  @JSImport("hdr-histogram-js", "decodeFromCompressedBase64")
  @js.native
  def decodeFromCompressedBase64(
    base64String: String,
    histogramConstr: HistogramConstructor,
    minBarForHighestTrackableValue: Double
  ): typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram = js.native
  
  @JSImport("hdr-histogram-js", "defaultRequest")
  @js.native
  val defaultRequest: BuildRequest = js.native
  
  @JSImport("hdr-histogram-js", "encodeIntoBase64String")
  @js.native
  def encodeIntoBase64String(histogram: typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram): String = js.native
  @JSImport("hdr-histogram-js", "encodeIntoBase64String")
  @js.native
  def encodeIntoBase64String(histogram: typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram, compressionLevel: Double): String = js.native
  
  @JSImport("hdr-histogram-js", "listTags")
  @js.native
  def listTags(content: String): js.Array[String] = js.native
  
  @js.native
  trait BuildRequest extends StObject {
    
    /**
      * Control whether or not the histogram can auto-resize and auto-adjust it's
      * highestTrackableValue
      * Default value is true
      */
    var autoResize: js.UndefOr[Boolean] = js.native
    
    /**
      * The size in bit of each count bucket
      * Default value is 32
      */
    var bitBucketSize: js.UndefOr[`8` | `16` | `32` | `64` | packed | sparse_array] = js.native
    
    /**
      * The highest value to be tracked by the histogram. Must be a positive
      * integer that is {@literal >=} (2 * lowestDiscernibleValue).
      * Default value is Number.MAX_SAFE_INTEGER
      */
    var highestTrackableValue: js.UndefOr[Double] = js.native
    
    /**
      * The lowest value that can be discerned (distinguished from 0) by the histogram.
      * Must be a positive integer that is {@literal >=} 1. May be internally rounded
      * down to nearest power of 2.
      * Default value is 1
      */
    var lowestDiscernibleValue: js.UndefOr[Double] = js.native
    
    /**
      * The number of significant decimal digits to which the histogram will
      * maintain value resolution and separation. Must be a non-negative
      * integer between 0 and 5.
      * Default value is 3
      */
    var numberOfSignificantValueDigits: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.native
  }
  object BuildRequest {
    
    @scala.inline
    def apply(): BuildRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildRequest]
    }
    
    @scala.inline
    implicit class BuildRequestMutableBuilder[Self <: BuildRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setBitBucketSize(value: `8` | `16` | `32` | `64` | packed | sparse_array): Self = StObject.set(x, "bitBucketSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitBucketSizeUndefined: Self = StObject.set(x, "bitBucketSize", js.undefined)
      
      @scala.inline
      def setHighestTrackableValue(value: Double): Self = StObject.set(x, "highestTrackableValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighestTrackableValueUndefined: Self = StObject.set(x, "highestTrackableValue", js.undefined)
      
      @scala.inline
      def setLowestDiscernibleValue(value: Double): Self = StObject.set(x, "lowestDiscernibleValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowestDiscernibleValueUndefined: Self = StObject.set(x, "lowestDiscernibleValue", js.undefined)
      
      @scala.inline
      def setNumberOfSignificantValueDigits(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "numberOfSignificantValueDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfSignificantValueDigitsUndefined: Self = StObject.set(x, "numberOfSignificantValueDigits", js.undefined)
    }
  }
}
