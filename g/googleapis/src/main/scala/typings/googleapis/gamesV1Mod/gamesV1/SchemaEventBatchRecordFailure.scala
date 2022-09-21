package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventBatchRecordFailure extends StObject {
  
  /**
    * The cause for the update failure.
    */
  var failureCause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#eventBatchRecordFailure`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time range which was rejected; empty for a request-wide failure.
    */
  var range: js.UndefOr[SchemaEventPeriodRange] = js.undefined
}
object SchemaEventBatchRecordFailure {
  
  inline def apply(): SchemaEventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventBatchRecordFailure]
  }
  
  extension [Self <: SchemaEventBatchRecordFailure](x: Self) {
    
    inline def setFailureCause(value: String): Self = StObject.set(x, "failureCause", value.asInstanceOf[js.Any])
    
    inline def setFailureCauseNull: Self = StObject.set(x, "failureCause", null)
    
    inline def setFailureCauseUndefined: Self = StObject.set(x, "failureCause", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRange(value: SchemaEventPeriodRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
