package typings.hdrHistogramJs

import typings.hdrHistogramJs.distJsHistogramMod.JsHistogram
import typings.hdrHistogramJs.distPackedarrayPackedArrayMod.PackedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackedHistogramMod {
  
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
  @JSImport("hdr-histogram-js/dist/PackedHistogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PackedHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* protected */ /* CompleteClass */
    override def _getEstimatedFootprintInBytes(): Double = js.native
    
    /* CompleteClass */
    override def addToCountAtIndex(index: Double, value: Double): Unit = js.native
    
    /* CompleteClass */
    override def clearCounts(): Unit = js.native
    
    /* CompleteClass */
    override def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): PackedHistogram = js.native
    
    /* CompleteClass */
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any = js.native
    
    /* CompleteClass */
    override def getCountAtIndex(index: Double): Double = js.native
    
    /* CompleteClass */
    override def incrementCountAtIndex(index: Double): Unit = js.native
    
    /* CompleteClass */
    var packedCounts: PackedArray = js.native
    
    /* CompleteClass */
    override def resize(newHighestTrackableValue: Double): Unit = js.native
    
    /* CompleteClass */
    override def setCountAtIndex(index: Double, value: Double): Unit = js.native
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
  trait PackedHistogram
    extends StObject
       with JsHistogram {
    
    /* protected */ def _getEstimatedFootprintInBytes(): Double
    
    def addToCountAtIndex(index: Double, value: Double): Unit
    
    def clearCounts(): Unit
    
    def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): PackedHistogram
    
    def getCountAtIndex(index: Double): Double
    
    def incrementCountAtIndex(index: Double): Unit
    
    var packedCounts: PackedArray
    
    def resize(newHighestTrackableValue: Double): Unit
    
    def setCountAtIndex(index: Double, value: Double): Unit
  }
  object PackedHistogram {
    
    inline def apply(
      _getEstimatedFootprintInBytes: () => Double,
      addToCountAtIndex: (Double, Double) => Unit,
      clearCounts: () => Unit,
      copyCorrectedForCoordinatedOmission: Double => PackedHistogram,
      encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any,
      getCountAtIndex: Double => Double,
      incrementCountAtIndex: Double => Unit,
      packedCounts: PackedArray,
      resize: Double => Unit,
      setCountAtIndex: (Double, Double) => Unit
    ): PackedHistogram = {
      val __obj = js.Dynamic.literal(_getEstimatedFootprintInBytes = js.Any.fromFunction0(_getEstimatedFootprintInBytes), addToCountAtIndex = js.Any.fromFunction2(addToCountAtIndex), clearCounts = js.Any.fromFunction0(clearCounts), copyCorrectedForCoordinatedOmission = js.Any.fromFunction1(copyCorrectedForCoordinatedOmission), encodeIntoCompressedBase64 = encodeIntoCompressedBase64.asInstanceOf[js.Any], getCountAtIndex = js.Any.fromFunction1(getCountAtIndex), incrementCountAtIndex = js.Any.fromFunction1(incrementCountAtIndex), packedCounts = packedCounts.asInstanceOf[js.Any], resize = js.Any.fromFunction1(resize), setCountAtIndex = js.Any.fromFunction2(setCountAtIndex))
      __obj.asInstanceOf[PackedHistogram]
    }
    
    extension [Self <: PackedHistogram](x: Self) {
      
      inline def setAddToCountAtIndex(value: (Double, Double) => Unit): Self = StObject.set(x, "addToCountAtIndex", js.Any.fromFunction2(value))
      
      inline def setClearCounts(value: () => Unit): Self = StObject.set(x, "clearCounts", js.Any.fromFunction0(value))
      
      inline def setCopyCorrectedForCoordinatedOmission(value: Double => PackedHistogram): Self = StObject.set(x, "copyCorrectedForCoordinatedOmission", js.Any.fromFunction1(value))
      
      inline def setGetCountAtIndex(value: Double => Double): Self = StObject.set(x, "getCountAtIndex", js.Any.fromFunction1(value))
      
      inline def setIncrementCountAtIndex(value: Double => Unit): Self = StObject.set(x, "incrementCountAtIndex", js.Any.fromFunction1(value))
      
      inline def setPackedCounts(value: PackedArray): Self = StObject.set(x, "packedCounts", value.asInstanceOf[js.Any])
      
      inline def setResize(value: Double => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setSetCountAtIndex(value: (Double, Double) => Unit): Self = StObject.set(x, "setCountAtIndex", js.Any.fromFunction2(value))
      
      inline def set_getEstimatedFootprintInBytes(value: () => Double): Self = StObject.set(x, "_getEstimatedFootprintInBytes", js.Any.fromFunction0(value))
    }
  }
}
