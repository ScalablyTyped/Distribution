package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerMean extends StObject {
  
  /** The number of values being aggregated. */
  var count: js.UndefOr[SplitInt64] = js.undefined
  
  /** The sum of all values being aggregated. */
  var sum: js.UndefOr[SplitInt64] = js.undefined
}
object IntegerMean {
  
  inline def apply(): IntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerMean]
  }
  
  extension [Self <: IntegerMean](x: Self) {
    
    inline def setCount(value: SplitInt64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSum(value: SplitInt64): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
  }
}
