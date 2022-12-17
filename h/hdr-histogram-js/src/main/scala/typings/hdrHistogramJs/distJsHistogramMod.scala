package typings.hdrHistogramJs

import typings.hdrHistogramJs.distHistogramMod.Histogram
import typings.hdrHistogramJs.distHistogramMod.HistogramSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsHistogramMod {
  
  /* note: abstract class */ @JSImport("hdr-histogram-js/dist/JsHistogram", JSImport.Default)
  @js.native
  open class default protected () extends JsHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "default.decode")
    @js.native
    def decode: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any = js.native
    inline def decode_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "default.identityBuilder")
    @js.native
    def identityBuilder: Double = js.native
    inline def identityBuilder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identityBuilder")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("hdr-histogram-js/dist/JsHistogram", "JsHistogram")
  @js.native
  open class JsHistogram protected ()
    extends StObject
       with Histogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* protected */ def _getEstimatedFootprintInBytes(): Double = js.native
    
    var _totalCount: Double = js.native
    
    /**
      * Add the contents of another histogram to this one.
      * <p>
      * As part of adding the contents, the start/end timestamp range of this histogram will be
      * extended to include the start/end timestamp range of the other histogram.
      *
      * @param otherHistogram The other histogram.
      * @throws (may throw) if values in fromHistogram's are
      * higher than highestTrackableValue.
      */
    def add(otherHistogram: JsHistogram): Unit = js.native
    
    def addToCountAtIndex(index: Double, value: Double): Unit = js.native
    
    def addToTotalCount(value: Double): Unit = js.native
    
    /**
      * Add the contents of another histogram to this one, while correcting the incoming data for coordinated omission.
      * <p>
      * To compensate for the loss of sampled values when a recorded value is larger than the expected
      * interval between value samples, the values added will include an auto-generated additional series of
      * decreasingly-smaller (down to the expectedIntervalBetweenValueSamples) value records for each count found
      * in the current histogram that is larger than the expectedIntervalBetweenValueSamples.
      *
      * Note: This is a post-recording correction method, as opposed to the at-recording correction method provided
      * by {@link #recordValueWithExpectedInterval(long, long) recordValueWithExpectedInterval}. The two
      * methods are mutually exclusive, and only one of the two should be be used on a given data set to correct
      * for the same coordinated omission issue.
      * by
      * <p>
      * See notes in the description of the Histogram calls for an illustration of why this corrective behavior is
      * important.
      *
      * @param otherHistogram The other histogram. highestTrackableValue and largestValueWithSingleUnitResolution must match.
      * @param expectedIntervalBetweenValueSamples If expectedIntervalBetweenValueSamples is larger than 0, add
      *                                           auto-generated value records as appropriate if value is larger
      *                                           than expectedIntervalBetweenValueSamples
      * @throws ArrayIndexOutOfBoundsException (may throw) if values exceed highestTrackableValue
      */
    def addWhileCorrectingForCoordinatedOmission(otherHistogram: JsHistogram, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    var bucketCount: Double = js.native
    
    def clearCounts(): Unit = js.native
    
    /* private */ var computeCountsArrayIndex: Any = js.native
    
    def countsArrayIndex(value: Double): Double = js.native
    
    var countsArrayLength: Double = js.native
    
    def determineArrayLengthNeeded(highestTrackableValue: Double): Double = js.native
    
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any = js.native
    
    def establishInternalTackingValues(): Unit = js.native
    def establishInternalTackingValues(lengthToCover: Double): Unit = js.native
    
    /**
      * The buckets (each of which has subBucketCount sub-buckets, here assumed to be 2048 as an example) overlap:
      *
      * <pre>
      * The 0'th bucket covers from 0...2047 in multiples of 1, using all 2048 sub-buckets
      * The 1'th bucket covers from 2048..4097 in multiples of 2, using only the top 1024 sub-buckets
      * The 2'th bucket covers from 4096..8191 in multiple of 4, using only the top 1024 sub-buckets
      * ...
      * </pre>
      *
      * Bucket 0 is "special" here. It is the only one that has 2048 entries. All the rest have 1024 entries (because
      * their bottom half overlaps with and is already covered by the all of the previous buckets put together). In other
      * words, the k'th bucket could represent 0 * 2^k to 2048 * 2^k in 2048 buckets with 2^k precision, but the midpoint
      * of 1024 * 2^k = 2048 * 2^(k-1) = the k-1'th bucket's end, so we would use the previous bucket for those lower
      * values as it has better precision.
      */
    def establishSize(newHighestTrackableValue: Double): Unit = js.native
    
    /**
      * Provide a (conservatively high) estimate of the Histogram's total footprint in bytes
      *
      * @return a (conservatively high) estimate of the Histogram's total footprint in bytes
      */
    @JSName("estimatedFootprintInBytes")
    def estimatedFootprintInBytes_MJsHistogram: Double = js.native
    
    /**
      * @return the lowest (and therefore highest precision) bucket index that can represent the value
      */
    def getBucketIndex(value: Double): Double = js.native
    
    def getBucketsNeededToCoverValue(value: Double): Double = js.native
    
    def getCountAtIndex(index: Double): Double = js.native
    
    /**
      * Get the count of recorded values at a specific value (to within the histogram resolution at the value level).
      *
      * @param value The value for which to provide the recorded count
      * @return The total count of values recorded in the histogram within the value range that is
      * {@literal >=} lowestEquivalentValue(<i>value</i>) and {@literal <=} highestEquivalentValue(<i>value</i>)
      */
    /* private */ var getCountAtValue: Any = js.native
    
    /**
      * If we have N such that subBucketCount * 2^N > max value, we need storage for N+1 buckets, each with enough
      * slots to hold the top half of the subBucketCount (the lower half is covered by previous buckets), and the +1
      * being used for the lower half of the 0'th bucket. Or, equivalently, we need 1 more bucket to capture the max
      * value if we consider the sub-bucket length to be halved.
      */
    def getLengthForNumberOfBuckets(numberOfBuckets: Double): Double = js.native
    
    /* private */ var getStdDeviation: Any = js.native
    
    def getSubBucketIndex(value: Double, bucketIndex: Double): Double = js.native
    
    def handleRecordException(count: Double, value: Double): Unit = js.native
    
    /**
      * Get the highest value that is equivalent to the given value within the histogram's resolution.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The highest value that is equivalent to the given value within the histogram's resolution.
      */
    def highestEquivalentValue(value: Double): Double = js.native
    
    var identity: Double = js.native
    
    def incrementCountAtIndex(index: Double): Unit = js.native
    
    def incrementTotalCount(): Unit = js.native
    
    def init(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ): Unit = js.native
    
    def inspect(): String = js.native
    
    /**
      * Number of leading zeros in the largest value that can fit in bucket 0.
      */
    var leadingZeroCountBase: Double = js.native
    
    var lowestDiscernibleValue: Double = js.native
    
    var lowestDiscernibleValueRounded: Double = js.native
    
    /**
      * Get the lowest value that is equivalent to the given value within the histogram's resolution.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The lowest value that is equivalent to the given value within the histogram's resolution.
      */
    def lowestEquivalentValue(value: Double): Double = js.native
    
    /**
      * Get the computed mean value of all recorded values in the histogram
      *
      * @return the mean value (in value units) of the histogram data
      */
    @JSName("mean")
    def mean_MJsHistogram: Double = js.native
    
    /**
      * Get a value that lies in the middle (rounded up) of the range of values equivalent the given value.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The value lies in the middle (rounded up) of the range of values equivalent the given value.
      */
    def medianEquivalentValue(value: Double): Double = js.native
    
    /**
      * Get the next value that is not equivalent to the given value within the histogram's resolution.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The next value that is not equivalent to the given value within the histogram's resolution.
      */
    def nextNonEquivalentValue(value: Double): Double = js.native
    
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    
    var percentileIterator: typings.hdrHistogramJs.distPercentileIteratorMod.default = js.native
    
    /* private */ var recordCountAtValue: Any = js.native
    
    def recordSingleValue(value: Double): Unit = js.native
    
    def recordSingleValueWithExpectedInterval(value: Double, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    /* private */ var recordValueWithCountAndExpectedInterval: Any = js.native
    
    var recordedValuesIterator: typings.hdrHistogramJs.distRecordedValuesIteratorMod.default = js.native
    
    def resize(newHighestTrackableValue: Double): Unit = js.native
    
    def setCountAtIndex(index: Double, value: Double): Unit = js.native
    
    def setTotalCount(value: Double): Unit = js.native
    
    /**
      * Get the size (in value units) of the range of values that are equivalent to the given value within the
      * histogram's resolution. Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The size of the range of values equivalent to the given value.
      */
    def sizeOfEquivalentValueRange(value: Double): Double = js.native
    
    /**
      * Get the computed standard deviation of all recorded values in the histogram
      *
      * @return the standard deviation (in value units) of the histogram data
      */
    @JSName("stdDeviation")
    def stdDeviation_MJsHistogram: Double = js.native
    
    /**
      * Power-of-two length of linearly scaled array slots in the counts array. Long enough to hold the first sequence of
      * entries that must be distinguished by a single unit (determined by configured precision).
      */
    var subBucketCount: Double = js.native
    
    var subBucketHalfCount: Double = js.native
    
    var subBucketHalfCountMagnitude: Double = js.native
    
    /**
      * Biggest value that can fit in bucket 0
      */
    var subBucketMask: Double = js.native
    
    /**
      * Subtract the contents of another histogram from this one.
      * <p>
      * The start/end timestamps of this histogram will remain unchanged.
      *
      * @param otherHistogram The other histogram.
      * @throws ArrayIndexOutOfBoundsException (may throw) if values in otherHistogram's are higher than highestTrackableValue.
      *
      */
    def subtract(otherHistogram: JsHistogram): Unit = js.native
    
    @JSName("summary")
    def summary_MJsHistogram: HistogramSummary = js.native
    
    /**
      * Get the total count of all recorded values in the histogram
      * @return the total count of all recorded values in the histogram
      */
    @JSName("totalCount")
    def totalCount_MJsHistogram: Double = js.native
    
    /**
      * Largest k such that 2^k &lt;= lowestDiscernibleValue
      */
    var unitMagnitude: Double = js.native
    
    /**
      * Lowest unitMagnitude bits are set
      */
    var unitMagnitudeMask: Double = js.native
    
    def updateMinAndMax(value: Double): Unit = js.native
    
    /* private */ var updateMinNonZeroValue: Any = js.native
    
    /* private */ var updatedMaxValue: Any = js.native
    
    def valueFromIndex(index: Double): Double = js.native
    
    def valueFromIndexes(bucketIndex: Double, subBucketIndex: Double): Double = js.native
    
    var wordSizeInBytes: Double = js.native
  }
  /* static members */
  object JsHistogram {
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "JsHistogram")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "JsHistogram.identityBuilder")
    @js.native
    def identityBuilder: Double = js.native
    inline def identityBuilder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identityBuilder")(x.asInstanceOf[js.Any])
  }
}
