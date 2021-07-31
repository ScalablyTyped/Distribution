package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an event period update resource.
  */
trait SchemaEventRecordRequest extends StObject {
  
  /**
    * The current time when this update was sent, in milliseconds, since 1970
    * UTC (Unix Epoch).
    */
  var currentTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventRecordRequest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The request ID used to identify this attempt to record events.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the time period updates being made in this request.
    */
  var timePeriods: js.UndefOr[js.Array[SchemaEventPeriodUpdate]] = js.undefined
}
object SchemaEventRecordRequest {
  
  @scala.inline
  def apply(): SchemaEventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventRecordRequest]
  }
  
  @scala.inline
  implicit class SchemaEventRecordRequestMutableBuilder[Self <: SchemaEventRecordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTimeMillis(value: String): Self = StObject.set(x, "currentTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMillisUndefined: Self = StObject.set(x, "currentTimeMillis", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setTimePeriods(value: js.Array[SchemaEventPeriodUpdate]): Self = StObject.set(x, "timePeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePeriodsUndefined: Self = StObject.set(x, "timePeriods", js.undefined)
    
    @scala.inline
    def setTimePeriodsVarargs(value: SchemaEventPeriodUpdate*): Self = StObject.set(x, "timePeriods", js.Array(value :_*))
  }
}
