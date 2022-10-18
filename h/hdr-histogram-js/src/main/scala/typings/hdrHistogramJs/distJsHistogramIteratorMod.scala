package typings.hdrHistogramJs

import typings.hdrHistogramJs.distJsHistogramMod.JsHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsHistogramIteratorMod {
  
  /**
    * Used for iterating through histogram values.
    */
  /* note: abstract class */ @JSImport("hdr-histogram-js/dist/JsHistogramIterator", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JsHistogramIterator {
    
    /* CompleteClass */
    var arrayTotalCount: Double = js.native
    
    /* CompleteClass */
    var countAtThisValue: Double = js.native
    
    /* CompleteClass */
    var currentIndex: Double = js.native
    
    /* CompleteClass */
    var currentIterationValue: typings.hdrHistogramJs.distHistogramIterationValueMod.default = js.native
    
    /* CompleteClass */
    var currentValueAtIndex: Double = js.native
    
    /* private */ /* CompleteClass */
    var exhaustedSubBuckets: Any = js.native
    
    /* private */ /* CompleteClass */
    var freshSubBucket: Any = js.native
    
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
    var histogram: JsHistogram = js.native
    
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
    override def next(): typings.hdrHistogramJs.distHistogramIterationValueMod.default = js.native
    
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
    override def resetIterator(histogram: JsHistogram): Unit = js.native
    
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
  trait JsHistogramIterator extends StObject {
    
    var arrayTotalCount: Double
    
    var countAtThisValue: Double
    
    var currentIndex: Double
    
    var currentIterationValue: typings.hdrHistogramJs.distHistogramIterationValueMod.default
    
    var currentValueAtIndex: Double
    
    /* private */ var exhaustedSubBuckets: Any
    
    /* private */ var freshSubBucket: Any
    
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
    
    var histogram: JsHistogram
    
    def incrementIterationLevel(): Unit
    
    def incrementSubBucket(): Unit
    
    /**
      * Returns the next element in the iteration.
      *
      * @return the {@link HistogramIterationValue} associated with the next element in the iteration.
      */
    def next(): typings.hdrHistogramJs.distHistogramIterationValueMod.default
    
    var nextValueAtIndex: Double
    
    var prevValueIteratedTo: Double
    
    /**
      * @return true if the current position's data should be emitted by the iterator
      */
    def reachedIterationLevel(): Boolean
    
    def resetIterator(histogram: JsHistogram): Unit
    
    var savedHistogramTotalRawCount: Double
    
    var totalCountToCurrentIndex: Double
    
    var totalCountToPrevIndex: Double
    
    var totalValueToCurrentIndex: Double
  }
  object JsHistogramIterator {
    
    inline def apply(
      arrayTotalCount: Double,
      countAtThisValue: Double,
      currentIndex: Double,
      currentIterationValue: typings.hdrHistogramJs.distHistogramIterationValueMod.default,
      currentValueAtIndex: Double,
      exhaustedSubBuckets: Any,
      freshSubBucket: Any,
      getPercentileIteratedFrom: () => Double,
      getPercentileIteratedTo: () => Double,
      getValueIteratedTo: () => Double,
      hasNext: () => Boolean,
      histogram: JsHistogram,
      incrementIterationLevel: () => Unit,
      incrementSubBucket: () => Unit,
      next: () => typings.hdrHistogramJs.distHistogramIterationValueMod.default,
      nextValueAtIndex: Double,
      prevValueIteratedTo: Double,
      reachedIterationLevel: () => Boolean,
      resetIterator: JsHistogram => Unit,
      savedHistogramTotalRawCount: Double,
      totalCountToCurrentIndex: Double,
      totalCountToPrevIndex: Double,
      totalValueToCurrentIndex: Double
    ): JsHistogramIterator = {
      val __obj = js.Dynamic.literal(arrayTotalCount = arrayTotalCount.asInstanceOf[js.Any], countAtThisValue = countAtThisValue.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], currentIterationValue = currentIterationValue.asInstanceOf[js.Any], currentValueAtIndex = currentValueAtIndex.asInstanceOf[js.Any], exhaustedSubBuckets = exhaustedSubBuckets.asInstanceOf[js.Any], freshSubBucket = freshSubBucket.asInstanceOf[js.Any], getPercentileIteratedFrom = js.Any.fromFunction0(getPercentileIteratedFrom), getPercentileIteratedTo = js.Any.fromFunction0(getPercentileIteratedTo), getValueIteratedTo = js.Any.fromFunction0(getValueIteratedTo), hasNext = js.Any.fromFunction0(hasNext), histogram = histogram.asInstanceOf[js.Any], incrementIterationLevel = js.Any.fromFunction0(incrementIterationLevel), incrementSubBucket = js.Any.fromFunction0(incrementSubBucket), next = js.Any.fromFunction0(next), nextValueAtIndex = nextValueAtIndex.asInstanceOf[js.Any], prevValueIteratedTo = prevValueIteratedTo.asInstanceOf[js.Any], reachedIterationLevel = js.Any.fromFunction0(reachedIterationLevel), resetIterator = js.Any.fromFunction1(resetIterator), savedHistogramTotalRawCount = savedHistogramTotalRawCount.asInstanceOf[js.Any], totalCountToCurrentIndex = totalCountToCurrentIndex.asInstanceOf[js.Any], totalCountToPrevIndex = totalCountToPrevIndex.asInstanceOf[js.Any], totalValueToCurrentIndex = totalValueToCurrentIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsHistogramIterator]
    }
    
    extension [Self <: JsHistogramIterator](x: Self) {
      
      inline def setArrayTotalCount(value: Double): Self = StObject.set(x, "arrayTotalCount", value.asInstanceOf[js.Any])
      
      inline def setCountAtThisValue(value: Double): Self = StObject.set(x, "countAtThisValue", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIterationValue(value: typings.hdrHistogramJs.distHistogramIterationValueMod.default): Self = StObject.set(x, "currentIterationValue", value.asInstanceOf[js.Any])
      
      inline def setCurrentValueAtIndex(value: Double): Self = StObject.set(x, "currentValueAtIndex", value.asInstanceOf[js.Any])
      
      inline def setExhaustedSubBuckets(value: Any): Self = StObject.set(x, "exhaustedSubBuckets", value.asInstanceOf[js.Any])
      
      inline def setFreshSubBucket(value: Any): Self = StObject.set(x, "freshSubBucket", value.asInstanceOf[js.Any])
      
      inline def setGetPercentileIteratedFrom(value: () => Double): Self = StObject.set(x, "getPercentileIteratedFrom", js.Any.fromFunction0(value))
      
      inline def setGetPercentileIteratedTo(value: () => Double): Self = StObject.set(x, "getPercentileIteratedTo", js.Any.fromFunction0(value))
      
      inline def setGetValueIteratedTo(value: () => Double): Self = StObject.set(x, "getValueIteratedTo", js.Any.fromFunction0(value))
      
      inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      inline def setHistogram(value: JsHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
      
      inline def setIncrementIterationLevel(value: () => Unit): Self = StObject.set(x, "incrementIterationLevel", js.Any.fromFunction0(value))
      
      inline def setIncrementSubBucket(value: () => Unit): Self = StObject.set(x, "incrementSubBucket", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => typings.hdrHistogramJs.distHistogramIterationValueMod.default): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setNextValueAtIndex(value: Double): Self = StObject.set(x, "nextValueAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevValueIteratedTo(value: Double): Self = StObject.set(x, "prevValueIteratedTo", value.asInstanceOf[js.Any])
      
      inline def setReachedIterationLevel(value: () => Boolean): Self = StObject.set(x, "reachedIterationLevel", js.Any.fromFunction0(value))
      
      inline def setResetIterator(value: JsHistogram => Unit): Self = StObject.set(x, "resetIterator", js.Any.fromFunction1(value))
      
      inline def setSavedHistogramTotalRawCount(value: Double): Self = StObject.set(x, "savedHistogramTotalRawCount", value.asInstanceOf[js.Any])
      
      inline def setTotalCountToCurrentIndex(value: Double): Self = StObject.set(x, "totalCountToCurrentIndex", value.asInstanceOf[js.Any])
      
      inline def setTotalCountToPrevIndex(value: Double): Self = StObject.set(x, "totalCountToPrevIndex", value.asInstanceOf[js.Any])
      
      inline def setTotalValueToCurrentIndex(value: Double): Self = StObject.set(x, "totalValueToCurrentIndex", value.asInstanceOf[js.Any])
    }
  }
}
