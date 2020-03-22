package typings.hdrHistogramJs.abstractHistogramIteratorMod

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for iterating through histogram values.
  */
trait AbstractHistogramIterator extends js.Object {
  var arrayTotalCount: Double
  var countAtThisValue: Double
  var currentIndex: Double
  var currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default
  var currentValueAtIndex: Double
  var exhaustedSubBuckets: js.Any
  var freshSubBucket: js.Any
  var histogram: AbstractHistogram
  var nextValueAtIndex: Double
  var prevValueIteratedTo: Double
  var savedHistogramTotalRawCount: Double
  var totalCountToCurrentIndex: Double
  var totalCountToPrevIndex: Double
  var totalValueToCurrentIndex: Double
  def getPercentileIteratedFrom(): Double
  def getPercentileIteratedTo(): Double
  def getValueIteratedTo(): Double
  /**
    * Returns true if the iteration has more elements. (In other words, returns true if next would return an
    * element rather than throwing an exception.)
    *
    * @return true if the iterator has more elements.
    */
  def hasNext(): Boolean
  def incrementIterationLevel(): Unit
  def incrementSubBucket(): Unit
  /**
    * Returns the next element in the iteration.
    *
    * @return the {@link HistogramIterationValue} associated with the next element in the iteration.
    */
  def next(): typings.hdrHistogramJs.histogramIterationValueMod.default
  /**
    * @return true if the current position's data should be emitted by the iterator
    */
  def reachedIterationLevel(): Boolean
  def resetIterator(histogram: AbstractHistogram): Unit
}

object AbstractHistogramIterator {
  @scala.inline
  def apply(
    arrayTotalCount: Double,
    countAtThisValue: Double,
    currentIndex: Double,
    currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default,
    currentValueAtIndex: Double,
    exhaustedSubBuckets: js.Any,
    freshSubBucket: js.Any,
    getPercentileIteratedFrom: () => Double,
    getPercentileIteratedTo: () => Double,
    getValueIteratedTo: () => Double,
    hasNext: () => Boolean,
    histogram: AbstractHistogram,
    incrementIterationLevel: () => Unit,
    incrementSubBucket: () => Unit,
    next: () => typings.hdrHistogramJs.histogramIterationValueMod.default,
    nextValueAtIndex: Double,
    prevValueIteratedTo: Double,
    reachedIterationLevel: () => Boolean,
    resetIterator: AbstractHistogram => Unit,
    savedHistogramTotalRawCount: Double,
    totalCountToCurrentIndex: Double,
    totalCountToPrevIndex: Double,
    totalValueToCurrentIndex: Double
  ): AbstractHistogramIterator = {
    val __obj = js.Dynamic.literal(arrayTotalCount = arrayTotalCount.asInstanceOf[js.Any], countAtThisValue = countAtThisValue.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], currentIterationValue = currentIterationValue.asInstanceOf[js.Any], currentValueAtIndex = currentValueAtIndex.asInstanceOf[js.Any], exhaustedSubBuckets = exhaustedSubBuckets.asInstanceOf[js.Any], freshSubBucket = freshSubBucket.asInstanceOf[js.Any], getPercentileIteratedFrom = js.Any.fromFunction0(getPercentileIteratedFrom), getPercentileIteratedTo = js.Any.fromFunction0(getPercentileIteratedTo), getValueIteratedTo = js.Any.fromFunction0(getValueIteratedTo), hasNext = js.Any.fromFunction0(hasNext), histogram = histogram.asInstanceOf[js.Any], incrementIterationLevel = js.Any.fromFunction0(incrementIterationLevel), incrementSubBucket = js.Any.fromFunction0(incrementSubBucket), next = js.Any.fromFunction0(next), nextValueAtIndex = nextValueAtIndex.asInstanceOf[js.Any], prevValueIteratedTo = prevValueIteratedTo.asInstanceOf[js.Any], reachedIterationLevel = js.Any.fromFunction0(reachedIterationLevel), resetIterator = js.Any.fromFunction1(resetIterator), savedHistogramTotalRawCount = savedHistogramTotalRawCount.asInstanceOf[js.Any], totalCountToCurrentIndex = totalCountToCurrentIndex.asInstanceOf[js.Any], totalCountToPrevIndex = totalCountToPrevIndex.asInstanceOf[js.Any], totalValueToCurrentIndex = totalValueToCurrentIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractHistogramIterator]
  }
}

