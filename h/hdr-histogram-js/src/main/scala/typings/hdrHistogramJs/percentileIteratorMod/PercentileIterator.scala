package typings.hdrHistogramJs.percentileIteratorMod

import typings.hdrHistogramJs.abstractHistogramIteratorMod.AbstractHistogramIterator
import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for iterating through histogram values according to percentile levels. The iteration is
  * performed in steps that start at 0% and reduce their distance to 100% according to the
  * <i>percentileTicksPerHalfDistance</i> parameter, ultimately reaching 100% when all recorded histogram
  * values are exhausted.
  */
@js.native
trait PercentileIterator extends AbstractHistogramIterator {
  
  var doReset: js.Any = js.native
  
  var percentileLevelToIterateFrom: Double = js.native
  
  var percentileLevelToIterateTo: Double = js.native
  
  var percentileTicksPerHalfDistance: Double = js.native
  
  var reachedLastRecordedValue: Boolean = js.native
  
  /**
    * Reset iterator for re-use in a fresh iteration over the same histogram data set.
    *
    * @param percentileTicksPerHalfDistance The number of iteration steps per half-distance to 100%.
    */
  def reset(percentileTicksPerHalfDistance: Double): Unit = js.native
}
object PercentileIterator {
  
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
    percentileLevelToIterateFrom: Double,
    percentileLevelToIterateTo: Double,
    percentileTicksPerHalfDistance: Double,
    prevValueIteratedTo: Double,
    reachedIterationLevel: () => Boolean,
    reachedLastRecordedValue: Boolean,
    reset: Double => Unit,
    resetIterator: AbstractHistogram => Unit,
    savedHistogramTotalRawCount: Double,
    totalCountToCurrentIndex: Double,
    totalCountToPrevIndex: Double,
    totalValueToCurrentIndex: Double
  ): PercentileIterator = {
    val __obj = js.Dynamic.literal(arrayTotalCount = arrayTotalCount.asInstanceOf[js.Any], countAtThisValue = countAtThisValue.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], currentIterationValue = currentIterationValue.asInstanceOf[js.Any], currentValueAtIndex = currentValueAtIndex.asInstanceOf[js.Any], doReset = doReset.asInstanceOf[js.Any], exhaustedSubBuckets = exhaustedSubBuckets.asInstanceOf[js.Any], freshSubBucket = freshSubBucket.asInstanceOf[js.Any], getPercentileIteratedFrom = js.Any.fromFunction0(getPercentileIteratedFrom), getPercentileIteratedTo = js.Any.fromFunction0(getPercentileIteratedTo), getValueIteratedTo = js.Any.fromFunction0(getValueIteratedTo), hasNext = js.Any.fromFunction0(hasNext), histogram = histogram.asInstanceOf[js.Any], incrementIterationLevel = js.Any.fromFunction0(incrementIterationLevel), incrementSubBucket = js.Any.fromFunction0(incrementSubBucket), next = js.Any.fromFunction0(next), nextValueAtIndex = nextValueAtIndex.asInstanceOf[js.Any], percentileLevelToIterateFrom = percentileLevelToIterateFrom.asInstanceOf[js.Any], percentileLevelToIterateTo = percentileLevelToIterateTo.asInstanceOf[js.Any], percentileTicksPerHalfDistance = percentileTicksPerHalfDistance.asInstanceOf[js.Any], prevValueIteratedTo = prevValueIteratedTo.asInstanceOf[js.Any], reachedIterationLevel = js.Any.fromFunction0(reachedIterationLevel), reachedLastRecordedValue = reachedLastRecordedValue.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), resetIterator = js.Any.fromFunction1(resetIterator), savedHistogramTotalRawCount = savedHistogramTotalRawCount.asInstanceOf[js.Any], totalCountToCurrentIndex = totalCountToCurrentIndex.asInstanceOf[js.Any], totalCountToPrevIndex = totalCountToPrevIndex.asInstanceOf[js.Any], totalValueToCurrentIndex = totalValueToCurrentIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentileIterator]
  }
  
  @scala.inline
  implicit class PercentileIteratorOps[Self <: PercentileIterator] (val x: Self) extends AnyVal {
    
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
    def setPercentileLevelToIterateFrom(value: Double): Self = this.set("percentileLevelToIterateFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileLevelToIterateTo(value: Double): Self = this.set("percentileLevelToIterateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileTicksPerHalfDistance(value: Double): Self = this.set("percentileTicksPerHalfDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedLastRecordedValue(value: Boolean): Self = this.set("reachedLastRecordedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Double => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
  }
}
