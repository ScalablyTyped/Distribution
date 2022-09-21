package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegerMean extends StObject {
  
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.undefined
}
object SchemaIntegerMean {
  
  inline def apply(): SchemaIntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerMean]
  }
  
  extension [Self <: SchemaIntegerMean](x: Self) {
    
    inline def setCount(value: SchemaSplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSum(value: SchemaSplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
