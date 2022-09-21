package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventRecordRequest extends StObject {
  
  /**
    * The current time when this update was sent, in milliseconds, since 1970 UTC (Unix Epoch).
    */
  var currentTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#eventRecordRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The request ID used to identify this attempt to record events.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the time period updates being made in this request.
    */
  var timePeriods: js.UndefOr[js.Array[SchemaEventPeriodUpdate]] = js.undefined
}
object SchemaEventRecordRequest {
  
  inline def apply(): SchemaEventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventRecordRequest]
  }
  
  extension [Self <: SchemaEventRecordRequest](x: Self) {
    
    inline def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeMillisNull: Self = StObject.set(x, "currentTimeMillis", null)
    
    inline def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTimePeriods(value: js.Array[SchemaEventPeriodUpdate]): Self = StObject.set(x, "timePeriods", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodsUndefined: Self = StObject.set(x, "timePeriods", js.undefined)
    
    inline def setTimePeriodsVarargs(value: SchemaEventPeriodUpdate*): Self = StObject.set(x, "timePeriods", js.Array(value*))
  }
}
