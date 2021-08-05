package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A metric value representing a distribution.
  */
trait SchemaDistributionUpdate extends StObject {
  
  /**
    * The count of the number of elements present in the distribution.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * (Optional) Histogram of value counts for the distribution.
    */
  var histogram: js.UndefOr[SchemaHistogram] = js.undefined
  
  /**
    * The maximum value present in the distribution.
    */
  var max: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * The minimum value present in the distribution.
    */
  var min: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * Use an int64 since we&#39;d prefer the added precision. If overflow is a
    * common problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * Use a double since the sum of squares is likely to overflow int64.
    */
  var sumOfSquares: js.UndefOr[Double] = js.undefined
}
object SchemaDistributionUpdate {
  
  inline def apply(): SchemaDistributionUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionUpdate]
  }
  
  extension [Self <: SchemaDistributionUpdate](x: Self) {
    
    inline def setCount(value: SchemaSplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setHistogram(value: SchemaHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    
    inline def setMax(value: SchemaSplitInt64): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: SchemaSplitInt64): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setSum(value: SchemaSplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquares(value: Double): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquaresUndefined: Self = StObject.set(x, "sumOfSquares", js.undefined)
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
