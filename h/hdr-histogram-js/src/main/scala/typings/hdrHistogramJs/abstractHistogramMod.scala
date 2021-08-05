package typings.hdrHistogramJs

import org.scalablytyped.runtime.Instantiable3
import typings.hdrHistogramJs.abstractHistogramBaseMod.AbstractHistogramBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHistogramMod {
  
  @JSImport("hdr-histogram-js/AbstractHistogram", JSImport.Default)
  @js.native
  abstract class default protected () extends AbstractHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
  }
  object default {
    
    @JSImport("hdr-histogram-js/AbstractHistogram", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js/AbstractHistogram", "default.decodeFromByteBuffer")
    @js.native
    def decodeFromByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any = js.native
    inline def decodeFromByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromByteBuffer")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js/AbstractHistogram", "default.decodeFromCompressedByteBuffer")
    @js.native
    def decodeFromCompressedByteBuffer: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any = js.native
    inline def decodeFromCompressedByteBuffer_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecodeFromCompressedByteBuffer */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFromCompressedByteBuffer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hdr-histogram-js/AbstractHistogram", "AbstractHistogram")
  @js.native
  abstract class AbstractHistogram protected () extends AbstractHistogramBase {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* protected */ def _getEstimatedFootprintInBytes(): Double = js.native
    
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
    def add(otherHistogram: AbstractHistogram): Unit = js.native
    
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
    def addWhileCorrectingForCoordinatedOmission(otherHistogram: AbstractHistogram, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    def clearCounts(): Unit = js.native
    
    /* private */ var computeCountsArrayIndex: js.Any = js.native
    
    /**
      * Get a copy of this histogram, corrected for coordinated omission.
      * <p>
      * To compensate for the loss of sampled values when a recorded value is larger than the expected
      * interval between value samples, the new histogram will include an auto-generated additional series of
      * decreasingly-smaller (down to the expectedIntervalBetweenValueSamples) value records for each count found
      * in the current histogram that is larger than the expectedIntervalBetweenValueSamples.
      *
      * Note: This is a post-correction method, as opposed to the at-recording correction method provided
      * by {@link #recordValueWithExpectedInterval(long, long) recordValueWithExpectedInterval}. The two
      * methods are mutually exclusive, and only one of the two should be be used on a given data set to correct
      * for the same coordinated omission issue.
      * by
      * <p>
      * See notes in the description of the Histogram calls for an illustration of why this corrective behavior is
      * important.
      *
      * @param expectedIntervalBetweenValueSamples If expectedIntervalBetweenValueSamples is larger than 0, add
      *                                           auto-generated value records as appropriate if value is larger
      *                                           than expectedIntervalBetweenValueSamples
      * @return a copy of this histogram, corrected for coordinated omission.
      */
    def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): AbstractHistogram = js.native
    
    def countsArrayIndex(value: Double): Double = js.native
    
    def determineArrayLengthNeeded(highestTrackableValue: Double): Double = js.native
    
    var encodeIntoByteBuffer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof encodeIntoByteBuffer */ js.Any = js.native
    
    var encodeIntoCompressedByteBuffer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof encodeIntoCompressedByteBuffer */ js.Any = js.native
    
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
    /* private */ var getCountAtValue: js.Any = js.native
    
    /**
      * Provide a (conservatively high) estimate of the Histogram's total footprint in bytes
      *
      * @return a (conservatively high) estimate of the Histogram's total footprint in bytes
      */
    def getEstimatedFootprintInBytes(): Double = js.native
    
    /**
      * If we have N such that subBucketCount * 2^N > max value, we need storage for N+1 buckets, each with enough
      * slots to hold the top half of the subBucketCount (the lower half is covered by previous buckets), and the +1
      * being used for the lower half of the 0'th bucket. Or, equivalently, we need 1 more bucket to capture the max
      * value if we consider the sub-bucket length to be halved.
      */
    def getLengthForNumberOfBuckets(numberOfBuckets: Double): Double = js.native
    
    /**
      * Get the computed mean value of all recorded values in the histogram
      *
      * @return the mean value (in value units) of the histogram data
      */
    def getMean(): Double = js.native
    
    /**
      * Get the computed standard deviation of all recorded values in the histogram
      *
      * @return the standard deviation (in value units) of the histogram data
      */
    def getStdDeviation(): Double = js.native
    
    def getSubBucketIndex(value: Double, bucketIndex: Double): Double = js.native
    
    /**
      * Get the total count of all recorded values in the histogram
      * @return the total count of all recorded values in the histogram
      */
    def getTotalCount(): Double = js.native
    
    /**
      * Get the value at a given percentile.
      * When the given percentile is &gt; 0.0, the value returned is the value that the given
      * percentage of the overall recorded value entries in the histogram are either smaller than
      * or equivalent to. When the given percentile is 0.0, the value returned is the value that all value
      * entries in the histogram are either larger than or equivalent to.
      * <p>
      * Note that two values are "equivalent" in this statement if
      * {@link org.HdrHistogram.AbstractHistogram#valuesAreEquivalent} would return true.
      *
      * @param percentile  The percentile for which to return the associated value
      * @return The value that the given percentage of the overall recorded value entries in the
      * histogram are either smaller than or equivalent to. When the percentile is 0.0, returns the
      * value that all value entries in the histogram are either larger than or equivalent to.
      */
    def getValueAtPercentile(percentile: Double): Double = js.native
    
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
    
    def incrementCountAtIndex(index: Double): Unit = js.native
    
    def incrementTotalCount(): Unit = js.native
    
    def init(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double,
      integerToDoubleValueConversionRatio: Double,
      normalizingIndexOffset: Double
    ): Unit = js.native
    
    /**
      * Number of leading zeros in the largest value that can fit in bucket 0.
      */
    var leadingZeroCountBase: Double = js.native
    
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
    
    var maxValue: Double = js.native
    
    /**
      * Get a value that lies in the middle (rounded up) of the range of values equivalent the given value.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The value lies in the middle (rounded up) of the range of values equivalent the given value.
      */
    def medianEquivalentValue(value: Double): Double = js.native
    
    var minNonZeroValue: Double = js.native
    
    /**
      * Get the next value that is not equivalent to the given value within the histogram's resolution.
      * Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The next value that is not equivalent to the given value within the histogram's resolution.
      */
    def nextNonEquivalentValue(value: Double): Double = js.native
    
    /**
      * Produce textual representation of the value distribution of histogram data by percentile. The distribution is
      * output with exponentially increasing resolution, with each exponentially decreasing half-distance containing
      * <i>dumpTicksPerHalf</i> percentile reporting tick points.
      *
      * @param printStream    Stream into which the distribution will be output
      * <p>
      * @param percentileTicksPerHalfDistance  The number of reporting points per exponentially decreasing half-distance
      * <p>
      * @param outputValueUnitScalingRatio    The scaling factor by which to divide histogram recorded values units in
      *                                     output
      * @param useCsvFormat  Output in CSV format if true. Otherwise use plain text form.
      */
    def outputPercentileDistribution(): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Double): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double, useCsvFormat: Boolean): String = js.native
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Unit, useCsvFormat: Boolean): String = js.native
    
    /* private */ var recordCountAtValue: js.Any = js.native
    
    def recordSingleValue(value: Double): Unit = js.native
    
    def recordSingleValueWithExpectedInterval(value: Double, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    /**
      * Record a value in the histogram
      *
      * @param value The value to be recorded
      * @throws may throw Error if value is exceeds highestTrackableValue
      */
    def recordValue(value: Double): Unit = js.native
    
    /**
      * Record a value in the histogram (adding to the value's current count)
      *
      * @param value The value to be recorded
      * @param count The number of occurrences of this value to record
      * @throws ArrayIndexOutOfBoundsException (may throw) if value is exceeds highestTrackableValue
      */
    def recordValueWithCount(value: Double, count: Double): Unit = js.native
    
    /* private */ var recordValueWithCountAndExpectedInterval: js.Any = js.native
    
    /**
      * Record a value in the histogram.
      * <p>
      * To compensate for the loss of sampled values when a recorded value is larger than the expected
      * interval between value samples, Histogram will auto-generate an additional series of decreasingly-smaller
      * (down to the expectedIntervalBetweenValueSamples) value records.
      * <p>
      * Note: This is a at-recording correction method, as opposed to the post-recording correction method provided
      * by {@link #copyCorrectedForCoordinatedOmission(long)}.
      * The two methods are mutually exclusive, and only one of the two should be be used on a given data set to correct
      * for the same coordinated omission issue.
      * <p>
      * See notes in the description of the Histogram calls for an illustration of why this corrective behavior is
      * important.
      *
      * @param value The value to record
      * @param expectedIntervalBetweenValueSamples If expectedIntervalBetweenValueSamples is larger than 0, add
      *                                           auto-generated value records as appropriate if value is larger
      *                                           than expectedIntervalBetweenValueSamples
      * @throws ArrayIndexOutOfBoundsException (may throw) if value is exceeds highestTrackableValue
      */
    def recordValueWithExpectedInterval(value: Double, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var resetMinNonZeroValue: js.Any = js.native
    
    def resize(newHighestTrackableValue: Double): Unit = js.native
    
    def setCountAtIndex(index: Double, value: Double): Unit = js.native
    
    def setNormalizingIndexOffset(normalizingIndexOffset: Double): Unit = js.native
    
    def setTotalCount(totalCount: Double): Unit = js.native
    
    /**
      * Get the size (in value units) of the range of values that are equivalent to the given value within the
      * histogram's resolution. Where "equivalent" means that value samples recorded for any two
      * equivalent values are counted in a common total count.
      *
      * @param value The given value
      * @return The size of the range of values equivalent to the given value.
      */
    def sizeOfEquivalentValueRange(value: Double): Double = js.native
    
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
    def subtract(otherHistogram: AbstractHistogram): Unit = js.native
    
    /**
      * Largest k such that 2^k &lt;= lowestDiscernibleValue
      */
    var unitMagnitude: Double = js.native
    
    /**
      * Lowest unitMagnitude bits are set
      */
    var unitMagnitudeMask: Double = js.native
    
    def updateMinAndMax(value: Double): Unit = js.native
    
    /* private */ var updateMinNonZeroValue: js.Any = js.native
    
    /* private */ var updatedMaxValue: js.Any = js.native
    
    def valueFromIndex(index: Double): Double = js.native
    
    def valueFromIndexes(bucketIndex: Double, subBucketIndex: Double): Double = js.native
  }
  
  @js.native
  trait HistogramConstructor
    extends StObject
       with Instantiable3[
          /* lowestDiscernibleValue */ Double, 
          /* highestTrackableValue */ Double, 
          /* numberOfSignificantValueDigits */ Double, 
          AbstractHistogram
        ]
}
