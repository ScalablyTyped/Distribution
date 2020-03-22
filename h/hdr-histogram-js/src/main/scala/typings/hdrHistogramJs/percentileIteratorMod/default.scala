package typings.hdrHistogramJs.percentileIteratorMod

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for iterating through histogram values according to percentile levels. The iteration is
  * performed in steps that start at 0% and reduce their distance to 100% according to the
  * <i>percentileTicksPerHalfDistance</i> parameter, ultimately reaching 100% when all recorded histogram
  * values are exhausted.
  */
@JSImport("hdr-histogram-js/PercentileIterator", JSImport.Default)
@js.native
class default protected () extends PercentileIterator {
  /**
    * @param histogram The histogram this iterator will operate on
    * @param percentileTicksPerHalfDistance The number of equal-sized iteration steps per half-distance to 100%.
    */
  def this(histogram: AbstractHistogram, percentileTicksPerHalfDistance: Double) = this()
  /* CompleteClass */
  override var arrayTotalCount: Double = js.native
  /* CompleteClass */
  override var countAtThisValue: Double = js.native
  /* CompleteClass */
  override var currentIndex: Double = js.native
  /* CompleteClass */
  override var currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default = js.native
  /* CompleteClass */
  override var currentValueAtIndex: Double = js.native
  /* CompleteClass */
  override var doReset: js.Any = js.native
  /* CompleteClass */
  override var exhaustedSubBuckets: js.Any = js.native
  /* CompleteClass */
  override var freshSubBucket: js.Any = js.native
  /* CompleteClass */
  override var histogram: AbstractHistogram = js.native
  /* CompleteClass */
  override var nextValueAtIndex: Double = js.native
  /* CompleteClass */
  override var percentileLevelToIterateFrom: Double = js.native
  /* CompleteClass */
  override var percentileLevelToIterateTo: Double = js.native
  /* CompleteClass */
  override var percentileTicksPerHalfDistance: Double = js.native
  /* CompleteClass */
  override var prevValueIteratedTo: Double = js.native
  /* CompleteClass */
  override var reachedLastRecordedValue: Boolean = js.native
  /* CompleteClass */
  override var savedHistogramTotalRawCount: Double = js.native
  /* CompleteClass */
  override var totalCountToCurrentIndex: Double = js.native
  /* CompleteClass */
  override var totalCountToPrevIndex: Double = js.native
  /* CompleteClass */
  override var totalValueToCurrentIndex: Double = js.native
  /* CompleteClass */
  override def getPercentileIteratedFrom(): Double = js.native
  /* CompleteClass */
  override def getPercentileIteratedTo(): Double = js.native
  /* CompleteClass */
  override def getValueIteratedTo(): Double = js.native
  /**
    * Returns true if the iteration has more elements. (In other words, returns true if next would return an
    * element rather than throwing an exception.)
    *
    * @return true if the iterator has more elements.
    */
  /* CompleteClass */
  override def hasNext(): Boolean = js.native
  /* CompleteClass */
  override def incrementIterationLevel(): Unit = js.native
  /* CompleteClass */
  override def incrementSubBucket(): Unit = js.native
  /**
    * Returns the next element in the iteration.
    *
    * @return the {@link HistogramIterationValue} associated with the next element in the iteration.
    */
  /* CompleteClass */
  override def next(): typings.hdrHistogramJs.histogramIterationValueMod.default = js.native
  /**
    * @return true if the current position's data should be emitted by the iterator
    */
  /* CompleteClass */
  override def reachedIterationLevel(): Boolean = js.native
  /**
    * Reset iterator for re-use in a fresh iteration over the same histogram data set.
    *
    * @param percentileTicksPerHalfDistance The number of iteration steps per half-distance to 100%.
    */
  /* CompleteClass */
  override def reset(percentileTicksPerHalfDistance: Double): Unit = js.native
  /* CompleteClass */
  override def resetIterator(histogram: AbstractHistogram): Unit = js.native
}

