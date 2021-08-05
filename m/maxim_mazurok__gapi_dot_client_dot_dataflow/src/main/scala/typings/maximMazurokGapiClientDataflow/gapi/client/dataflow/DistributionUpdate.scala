package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionUpdate extends StObject {
  
  /** The count of the number of elements present in the distribution. */
  var count: js.UndefOr[SplitInt64] = js.undefined
  
  /** (Optional) Histogram of value counts for the distribution. */
  var histogram: js.UndefOr[Histogram] = js.undefined
  
  /** The maximum value present in the distribution. */
  var max: js.UndefOr[SplitInt64] = js.undefined
  
  /** The minimum value present in the distribution. */
  var min: js.UndefOr[SplitInt64] = js.undefined
  
  /** Use an int64 since we'd prefer the added precision. If overflow is a common problem we can detect it and use an additional int64 or a double. */
  var sum: js.UndefOr[SplitInt64] = js.undefined
  
  /** Use a double since the sum of squares is likely to overflow int64. */
  var sumOfSquares: js.UndefOr[Double] = js.undefined
}
object DistributionUpdate {
  
  inline def apply(): DistributionUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionUpdate]
  }
  
  extension [Self <: DistributionUpdate](x: Self) {
    
    inline def setCount(value: SplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setHistogram(value: Histogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setMax(value: SplitInt64): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: SplitInt64): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setSum(value: SplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquares(value: Double): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquaresUndefined: Self = StObject.set(x, "sumOfSquares", js.undefined)
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
