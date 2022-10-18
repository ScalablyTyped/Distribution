package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHistogramIterationValueMod {
  
  @JSImport("hdr-histogram-js/dist/HistogramIterationValue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HistogramIterationValue {
    
    /* CompleteClass */
    var countAddedInThisIterationStep: Double = js.native
    
    /* CompleteClass */
    var countAtValueIteratedTo: Double = js.native
    
    /* CompleteClass */
    var percentile: Double = js.native
    
    /* CompleteClass */
    var percentileLevelIteratedTo: Double = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var totalCountToThisValue: Double = js.native
    
    /* CompleteClass */
    var totalValueToThisValue: Double = js.native
    
    /* CompleteClass */
    var valueIteratedFrom: Double = js.native
    
    /* CompleteClass */
    var valueIteratedTo: Double = js.native
  }
  
  trait HistogramIterationValue extends StObject {
    
    var countAddedInThisIterationStep: Double
    
    var countAtValueIteratedTo: Double
    
    var percentile: Double
    
    var percentileLevelIteratedTo: Double
    
    def reset(): Unit
    
    var totalCountToThisValue: Double
    
    var totalValueToThisValue: Double
    
    var valueIteratedFrom: Double
    
    var valueIteratedTo: Double
  }
  object HistogramIterationValue {
    
    inline def apply(
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
    
    extension [Self <: HistogramIterationValue](x: Self) {
      
      inline def setCountAddedInThisIterationStep(value: Double): Self = StObject.set(x, "countAddedInThisIterationStep", value.asInstanceOf[js.Any])
      
      inline def setCountAtValueIteratedTo(value: Double): Self = StObject.set(x, "countAtValueIteratedTo", value.asInstanceOf[js.Any])
      
      inline def setPercentile(value: Double): Self = StObject.set(x, "percentile", value.asInstanceOf[js.Any])
      
      inline def setPercentileLevelIteratedTo(value: Double): Self = StObject.set(x, "percentileLevelIteratedTo", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setTotalCountToThisValue(value: Double): Self = StObject.set(x, "totalCountToThisValue", value.asInstanceOf[js.Any])
      
      inline def setTotalValueToThisValue(value: Double): Self = StObject.set(x, "totalValueToThisValue", value.asInstanceOf[js.Any])
      
      inline def setValueIteratedFrom(value: Double): Self = StObject.set(x, "valueIteratedFrom", value.asInstanceOf[js.Any])
      
      inline def setValueIteratedTo(value: Double): Self = StObject.set(x, "valueIteratedTo", value.asInstanceOf[js.Any])
    }
  }
}
