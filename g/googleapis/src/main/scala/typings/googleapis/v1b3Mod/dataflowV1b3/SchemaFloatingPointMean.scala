package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloatingPointMean extends StObject {
  
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFloatingPointMean {
  
  inline def apply(): SchemaFloatingPointMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatingPointMean]
  }
  
  extension [Self <: SchemaFloatingPointMean](x: Self) {
    
    inline def setCount(value: SchemaSplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumNull: Self = StObject.set(x, "sum", null)
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
