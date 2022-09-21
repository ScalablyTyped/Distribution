package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproximateSplitRequest extends StObject {
  
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The fraction of the remainder of work to split the work item at, from 0.0 (split at the current position) to 1.0 (end of the input).
    */
  var fractionOfRemainder: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A Position at which to split the work item.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
}
object SchemaApproximateSplitRequest {
  
  inline def apply(): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
  
  extension [Self <: SchemaApproximateSplitRequest](x: Self) {
    
    inline def setFractionConsumed(value: Double): Self = StObject.set(x, "fractionConsumed", value.asInstanceOf[js.Any])
    
    inline def setFractionConsumedNull: Self = StObject.set(x, "fractionConsumed", null)
    
    inline def setFractionConsumedUndefined: Self = StObject.set(x, "fractionConsumed", js.undefined)
    
    inline def setFractionOfRemainder(value: Double): Self = StObject.set(x, "fractionOfRemainder", value.asInstanceOf[js.Any])
    
    inline def setFractionOfRemainderNull: Self = StObject.set(x, "fractionOfRemainder", null)
    
    inline def setFractionOfRemainderUndefined: Self = StObject.set(x, "fractionOfRemainder", js.undefined)
    
    inline def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
