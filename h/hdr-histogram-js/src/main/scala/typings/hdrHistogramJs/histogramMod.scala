package typings.hdrHistogramJs

import org.scalablytyped.runtime.Instantiable3
import typings.hdrHistogramJs.hdrHistogramJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramMod {
  
  @JSImport("hdr-histogram-js/dist/Histogram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hdr-histogram-js/dist/Histogram", "NO_TAG")
  @js.native
  val NO_TAG: /* "NO TAG" */ String = js.native
  
  inline def toSummary(histogram: Histogram): HistogramSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("toSummary")(histogram.asInstanceOf[js.Any]).asInstanceOf[HistogramSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hdrHistogramJs.hdrHistogramJsNumbers.`8`
    - typings.hdrHistogramJs.hdrHistogramJsNumbers.`16`
    - typings.hdrHistogramJs.hdrHistogramJsNumbers.`32`
    - typings.hdrHistogramJs.hdrHistogramJsNumbers.`64`
    - typings.hdrHistogramJs.hdrHistogramJsStrings.packed
  */
  trait BitBucketSize extends StObject
  object BitBucketSize {
    
    inline def `16`: typings.hdrHistogramJs.hdrHistogramJsNumbers.`16` = 16.asInstanceOf[typings.hdrHistogramJs.hdrHistogramJsNumbers.`16`]
    
    inline def `32`: typings.hdrHistogramJs.hdrHistogramJsNumbers.`32` = 32.asInstanceOf[typings.hdrHistogramJs.hdrHistogramJsNumbers.`32`]
    
    inline def `64`: typings.hdrHistogramJs.hdrHistogramJsNumbers.`64` = 64.asInstanceOf[typings.hdrHistogramJs.hdrHistogramJsNumbers.`64`]
    
    inline def `8`: typings.hdrHistogramJs.hdrHistogramJsNumbers.`8` = 8.asInstanceOf[typings.hdrHistogramJs.hdrHistogramJsNumbers.`8`]
    
    inline def packed: typings.hdrHistogramJs.hdrHistogramJsStrings.packed = "packed".asInstanceOf[typings.hdrHistogramJs.hdrHistogramJsStrings.packed]
  }
  
  @js.native
  trait Histogram extends StObject {
    
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
    def add(otherHistogram: Histogram): Unit = js.native
    
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
    def addWhileCorrectingForCoordinatedOmission(otherHistogram: Histogram, expectedIntervalBetweenValueSamples: Double): Unit = js.native
    
    /**
      * Flag to enable automatic resizing of the underlying array
      */
    var autoResize: Boolean = js.native
    
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
    def copyCorrectedForCoordinatedOmission(expectedIntervalBetweenValueSamples: Double): Histogram = js.native
    
    /**
      * Clean up memory associated to this histogram. Useful for WebAssembly implementations
      */
    def destroy(): Unit = js.native
    
    var endTimeStampMsec: Double = js.native
    
    /**
      * A (conservatively high) estimate of the Histogram's total footprint in bytes
      */
    val estimatedFootprintInBytes: Double = js.native
    
    /**
      * Get the value at a given percentile.
      * When the given percentile is &gt; 0.0, the value returned is the value that the given
      * percentage of the overall recorded value entries in the histogram are either smaller than
      * or equivalent to. When the given percentile is 0.0, the value returned is the value that all value
      * entries in the histogram are either larger than or equivalent to.
      * <p>
      * Note that two values are "equivalent" in this statement if
      * {@link org.HdrHistogram.JsHistogram#valuesAreEquivalent} would return true.
      *
      * @param percentile  The percentile for which to return the associated value
      * @return The value that the given percentage of the overall recorded value entries in the
      * histogram are either smaller than or equivalent to. When the percentile is 0.0, returns the
      * value that all value entries in the histogram are either larger than or equivalent to.
      */
    def getValueAtPercentile(percentile: Double): Double = js.native
    
    /**
      * The current highest trackable value. May change if autoresize flag is set to true
      */
    val highestTrackableValue: Double = js.native
    
    val maxValue: Double = js.native
    
    /**
      * The computed mean value of all recorded values in the histogram
      */
    val mean: Double = js.native
    
    val minNonZeroValue: Double = js.native
    
    val numberOfSignificantValueDigits: Double = js.native
    
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
    def outputPercentileDistribution(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double): String = js.native
    @JSName("outputPercentileDistribution")
    def outputPercentileDistribution_false(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Double, useCsvFormat: `false`): String = js.native
    @JSName("outputPercentileDistribution")
    def outputPercentileDistribution_false(percentileTicksPerHalfDistance: Double, outputValueUnitScalingRatio: Unit, useCsvFormat: `false`): String = js.native
    @JSName("outputPercentileDistribution")
    def outputPercentileDistribution_false(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Double, useCsvFormat: `false`): String = js.native
    @JSName("outputPercentileDistribution")
    def outputPercentileDistribution_false(percentileTicksPerHalfDistance: Unit, outputValueUnitScalingRatio: Unit, useCsvFormat: `false`): String = js.native
    
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
    
    var startTimeStampMsec: Double = js.native
    
    /**
      * The computed standard deviation of all recorded values in the histogram
      */
    val stdDeviation: Double = js.native
    
    /**
      * Subtract the contents of another histogram from this one.
      * <p>
      * The start/end timestamps of this histogram will remain unchanged.
      *
      * @param otherHistogram The other histogram.
      * @throws ArrayIndexOutOfBoundsException (may throw) if values in otherHistogram's are higher than highestTrackableValue.
      *
      */
    def subtract(otherHistogram: Histogram): Unit = js.native
    
    /**
      * Main percentiles, max value and total number of recorded values
      */
    val summary: HistogramSummary = js.native
    
    var tag: String = js.native
    
    def toJSON(): HistogramSummary = js.native
    
    /**
      * Total count of all recorded values in the histogram
      */
    val totalCount: Double = js.native
  }
  
  @js.native
  trait HistogramConstructor
    extends StObject
       with Instantiable3[
          /* lowestDiscernibleValue */ Double, 
          /* highestTrackableValue */ Double, 
          /* numberOfSignificantValueDigits */ Double, 
          Histogram
        ]
  
  trait HistogramSummary extends StObject {
    
    var max: Double
    
    var p50: Double
    
    var p75: Double
    
    var p90: Double
    
    var p97_5: Double
    
    var p99: Double
    
    var p99_9: Double
    
    var p99_99: Double
    
    var p99_999: Double
    
    var totalCount: Double
  }
  object HistogramSummary {
    
    inline def apply(
      max: Double,
      p50: Double,
      p75: Double,
      p90: Double,
      p97_5: Double,
      p99: Double,
      p99_9: Double,
      p99_99: Double,
      p99_999: Double,
      totalCount: Double
    ): HistogramSummary = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p75 = p75.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p97_5 = p97_5.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], p99_9 = p99_9.asInstanceOf[js.Any], p99_99 = p99_99.asInstanceOf[js.Any], p99_999 = p99_999.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramSummary]
    }
    
    extension [Self <: HistogramSummary](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setP50(value: Double): Self = StObject.set(x, "p50", value.asInstanceOf[js.Any])
      
      inline def setP75(value: Double): Self = StObject.set(x, "p75", value.asInstanceOf[js.Any])
      
      inline def setP90(value: Double): Self = StObject.set(x, "p90", value.asInstanceOf[js.Any])
      
      inline def setP97_5(value: Double): Self = StObject.set(x, "p97_5", value.asInstanceOf[js.Any])
      
      inline def setP99(value: Double): Self = StObject.set(x, "p99", value.asInstanceOf[js.Any])
      
      inline def setP99_9(value: Double): Self = StObject.set(x, "p99_9", value.asInstanceOf[js.Any])
      
      inline def setP99_99(value: Double): Self = StObject.set(x, "p99_99", value.asInstanceOf[js.Any])
      
      inline def setP99_999(value: Double): Self = StObject.set(x, "p99_999", value.asInstanceOf[js.Any])
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
}
