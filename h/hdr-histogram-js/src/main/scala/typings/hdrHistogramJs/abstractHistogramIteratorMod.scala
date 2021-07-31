package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHistogramIteratorMod {
  
  /**
    * Used for iterating through histogram values.
    */
  @JSImport("hdr-histogram-js/AbstractHistogramIterator", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with AbstractHistogramIterator {
    
    /* CompleteClass */
    var arrayTotalCount: Double = js.native
    
    /* CompleteClass */
    var countAtThisValue: Double = js.native
    
    /* CompleteClass */
    var currentIndex: Double = js.native
    
    /* CompleteClass */
    var currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default = js.native
    
    /* CompleteClass */
    var currentValueAtIndex: Double = js.native
    
    /* CompleteClass */
    var exhaustedSubBuckets: js.Any = js.native
    
    /* CompleteClass */
    var freshSubBucket: js.Any = js.native
    
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
    var histogram: AbstractHistogram = js.native
    
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
    
    /* CompleteClass */
    var nextValueAtIndex: Double = js.native
    
    /* CompleteClass */
    var prevValueIteratedTo: Double = js.native
    
    /**
      * @return true if the current position's data should be emitted by the iterator
      */
    /* CompleteClass */
    override def reachedIterationLevel(): Boolean = js.native
    
    /* CompleteClass */
    override def resetIterator(histogram: AbstractHistogram): Unit = js.native
    
    /* CompleteClass */
    var savedHistogramTotalRawCount: Double = js.native
    
    /* CompleteClass */
    var totalCountToCurrentIndex: Double = js.native
    
    /* CompleteClass */
    var totalCountToPrevIndex: Double = js.native
    
    /* CompleteClass */
    var totalValueToCurrentIndex: Double = js.native
  }
  
  /**
    * Used for iterating through histogram values.
    */
  trait AbstractHistogramIterator extends StObject {
    
    var arrayTotalCount: Double
    
    var countAtThisValue: Double
    
    var currentIndex: Double
    
    var currentIterationValue: typings.hdrHistogramJs.histogramIterationValueMod.default
    
    var currentValueAtIndex: Double
    
    var exhaustedSubBuckets: js.Any
    
    var freshSubBucket: js.Any
    
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
    
    var histogram: AbstractHistogram
    
    def incrementIterationLevel(): Unit
    
    def incrementSubBucket(): Unit
    
    /**
      * Returns the next element in the iteration.
      *
      * @return the {@link HistogramIterationValue} associated with the next element in the iteration.
      */
    def next(): typings.hdrHistogramJs.histogramIterationValueMod.default
    
    var nextValueAtIndex: Double
    
    var prevValueIteratedTo: Double
    
    /**
      * @return true if the current position's data should be emitted by the iterator
      */
    def reachedIterationLevel(): Boolean
    
    def resetIterator(histogram: AbstractHistogram): Unit
    
    var savedHistogramTotalRawCount: Double
    
    var totalCountToCurrentIndex: Double
    
    var totalCountToPrevIndex: Double
    
    var totalValueToCurrentIndex: Double
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
    
    @scala.inline
    implicit class AbstractHistogramIteratorMutableBuilder[Self <: AbstractHistogramIterator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayTotalCount(value: Double): Self = StObject.set(x, "arrayTotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountAtThisValue(value: Double): Self = StObject.set(x, "countAtThisValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentIterationValue(value: typings.hdrHistogramJs.histogramIterationValueMod.default): Self = StObject.set(x, "currentIterationValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentValueAtIndex(value: Double): Self = StObject.set(x, "currentValueAtIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExhaustedSubBuckets(value: js.Any): Self = StObject.set(x, "exhaustedSubBuckets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreshSubBucket(value: js.Any): Self = StObject.set(x, "freshSubBucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPercentileIteratedFrom(value: () => Double): Self = StObject.set(x, "getPercentileIteratedFrom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPercentileIteratedTo(value: () => Double): Self = StObject.set(x, "getPercentileIteratedTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueIteratedTo(value: () => Double): Self = StObject.set(x, "getValueIteratedTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHistogram(value: AbstractHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementIterationLevel(value: () => Unit): Self = StObject.set(x, "incrementIterationLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncrementSubBucket(value: () => Unit): Self = StObject.set(x, "incrementSubBucket", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => typings.hdrHistogramJs.histogramIterationValueMod.default): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextValueAtIndex(value: Double): Self = StObject.set(x, "nextValueAtIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValueIteratedTo(value: Double): Self = StObject.set(x, "prevValueIteratedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReachedIterationLevel(value: () => Boolean): Self = StObject.set(x, "reachedIterationLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetIterator(value: AbstractHistogram => Unit): Self = StObject.set(x, "resetIterator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSavedHistogramTotalRawCount(value: Double): Self = StObject.set(x, "savedHistogramTotalRawCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountToCurrentIndex(value: Double): Self = StObject.set(x, "totalCountToCurrentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountToPrevIndex(value: Double): Self = StObject.set(x, "totalCountToPrevIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalValueToCurrentIndex(value: Double): Self = StObject.set(x, "totalValueToCurrentIndex", value.asInstanceOf[js.Any])
    }
  }
}
