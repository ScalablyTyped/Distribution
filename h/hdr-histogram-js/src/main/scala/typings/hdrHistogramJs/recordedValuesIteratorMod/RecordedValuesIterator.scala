package typings.hdrHistogramJs.recordedValuesIteratorMod

import typings.hdrHistogramJs.abstractHistogramIteratorMod.AbstractHistogramIterator
import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for iterating through all recorded histogram values using the finest granularity steps supported by the
  * underlying representation. The iteration steps through all non-zero recorded value counts, and terminates when
  * all recorded histogram values are exhausted.
  */
@js.native
trait RecordedValuesIterator extends AbstractHistogramIterator {
  var doReset: js.Any = js.native
  var visitedIndex: Double = js.native
  /**
    * Reset iterator for re-use in a fresh iteration over the same histogram data set.
    */
  def reset(): Unit = js.native
}

object RecordedValuesIterator {
  @scala.inline
  def apply(
    arrayTotalCount: Double,
    countAtThisValue: Double,
    currentIndex: Double,
    currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default,
    currentValueAtIndex: Double,
    doReset: js.Any,
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
    reset: () => Unit,
    resetIterator: AbstractHistogram => Unit,
    savedHistogramTotalRawCount: Double,
    totalCountToCurrentIndex: Double,
    totalCountToPrevIndex: Double,
    totalValueToCurrentIndex: Double,
    visitedIndex: Double
  ): RecordedValuesIterator = {
    val __obj = js.Dynamic.literal(arrayTotalCount = arrayTotalCount.asInstanceOf[js.Any], countAtThisValue = countAtThisValue.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], currentIterationValue = currentIterationValue.asInstanceOf[js.Any], currentValueAtIndex = currentValueAtIndex.asInstanceOf[js.Any], doReset = doReset.asInstanceOf[js.Any], exhaustedSubBuckets = exhaustedSubBuckets.asInstanceOf[js.Any], freshSubBucket = freshSubBucket.asInstanceOf[js.Any], getPercentileIteratedFrom = js.Any.fromFunction0(getPercentileIteratedFrom), getPercentileIteratedTo = js.Any.fromFunction0(getPercentileIteratedTo), getValueIteratedTo = js.Any.fromFunction0(getValueIteratedTo), hasNext = js.Any.fromFunction0(hasNext), histogram = histogram.asInstanceOf[js.Any], incrementIterationLevel = js.Any.fromFunction0(incrementIterationLevel), incrementSubBucket = js.Any.fromFunction0(incrementSubBucket), next = js.Any.fromFunction0(next), nextValueAtIndex = nextValueAtIndex.asInstanceOf[js.Any], prevValueIteratedTo = prevValueIteratedTo.asInstanceOf[js.Any], reachedIterationLevel = js.Any.fromFunction0(reachedIterationLevel), reset = js.Any.fromFunction0(reset), resetIterator = js.Any.fromFunction1(resetIterator), savedHistogramTotalRawCount = savedHistogramTotalRawCount.asInstanceOf[js.Any], totalCountToCurrentIndex = totalCountToCurrentIndex.asInstanceOf[js.Any], totalCountToPrevIndex = totalCountToPrevIndex.asInstanceOf[js.Any], totalValueToCurrentIndex = totalValueToCurrentIndex.asInstanceOf[js.Any], visitedIndex = visitedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordedValuesIterator]
  }
  @scala.inline
  implicit class RecordedValuesIteratorOps[Self <: RecordedValuesIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoReset(value: js.Any): Self = this.set("doReset", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setVisitedIndex(value: Double): Self = this.set("visitedIndex", value.asInstanceOf[js.Any])
  }
  
}

