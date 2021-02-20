package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramIterationValueMod {
  
  @JSImport("hdr-histogram-js/HistogramIterationValue", JSImport.Default)
  @js.native
  class default () extends HistogramIterationValue
  
  @js.native
  trait HistogramIterationValue extends StObject {
    
    var countAddedInThisIterationStep: Double = js.native
    
    var countAtValueIteratedTo: Double = js.native
    
    var percentile: Double = js.native
    
    var percentileLevelIteratedTo: Double = js.native
    
    def reset(): Unit = js.native
    
    var totalCountToThisValue: Double = js.native
    
    var totalValueToThisValue: Double = js.native
    
    var valueIteratedFrom: Double = js.native
    
    var valueIteratedTo: Double = js.native
  }
  object HistogramIterationValue {
    
    @scala.inline
    def apply(
      countAddedInThisIterationStep: Double,
      countAtValueIteratedTo: Double,
      percentile: Double,
      percentileLevelIteratedTo: Double,
      reset: () => Unit,
      totalCountToThisValue: Double,
      totalValueToThisValue: Double,
      valueIteratedFrom: Double,
      valueIteratedTo: Double
    ): HistogramIterationValue = {
      val __obj = js.Dynamic.literal(countAddedInThisIterationStep = countAddedInThisIterationStep.asInstanceOf[js.Any], countAtValueIteratedTo = countAtValueIteratedTo.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any], percentileLevelIteratedTo = percentileLevelIteratedTo.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), totalCountToThisValue = totalCountToThisValue.asInstanceOf[js.Any], totalValueToThisValue = totalValueToThisValue.asInstanceOf[js.Any], valueIteratedFrom = valueIteratedFrom.asInstanceOf[js.Any], valueIteratedTo = valueIteratedTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramIterationValue]
    }
    
    @scala.inline
    implicit class HistogramIterationValueMutableBuilder[Self <: HistogramIterationValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountAddedInThisIterationStep(value: Double): Self = StObject.set(x, "countAddedInThisIterationStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountAtValueIteratedTo(value: Double): Self = StObject.set(x, "countAtValueIteratedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentileLevelIteratedTo(value: Double): Self = StObject.set(x, "percentileLevelIteratedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTotalCountToThisValue(value: Double): Self = StObject.set(x, "totalCountToThisValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalValueToThisValue(value: Double): Self = StObject.set(x, "totalValueToThisValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueIteratedFrom(value: Double): Self = StObject.set(x, "valueIteratedFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueIteratedTo(value: Double): Self = StObject.set(x, "valueIteratedTo", value.asInstanceOf[js.Any])
    }
  }
}
