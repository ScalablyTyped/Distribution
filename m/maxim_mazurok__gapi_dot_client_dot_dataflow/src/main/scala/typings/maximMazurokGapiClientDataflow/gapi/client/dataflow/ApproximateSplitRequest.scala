package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproximateSplitRequest extends StObject {
  
  /** A fraction at which to split the work item, from 0.0 (beginning of the input) to 1.0 (end of the input). */
  var fractionConsumed: js.UndefOr[Double] = js.undefined
  
  /** The fraction of the remainder of work to split the work item at, from 0.0 (split at the current position) to 1.0 (end of the input). */
  var fractionOfRemainder: js.UndefOr[Double] = js.undefined
  
  /** A Position at which to split the work item. */
  var position: js.UndefOr[Position] = js.undefined
}
object ApproximateSplitRequest {
  
  inline def apply(): ApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateSplitRequest]
  }
  
  extension [Self <: ApproximateSplitRequest](x: Self) {
    
    inline def setFractionConsumed(value: Double): Self = StObject.set(x, "fractionConsumed", value.asInstanceOf[js.Any])
    
    inline def setFractionConsumedUndefined: Self = StObject.set(x, "fractionConsumed", js.undefined)
    
    inline def setFractionOfRemainder(value: Double): Self = StObject.set(x, "fractionOfRemainder", value.asInstanceOf[js.Any])
    
    inline def setFractionOfRemainderUndefined: Self = StObject.set(x, "fractionOfRemainder", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
