package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckInRequest extends StObject {
  
  /**
    * The deadline has expired and the worker needs more time.
    */
  var deadlineExpired: js.UndefOr[SchemaEmpty] = js.undefined
  
  /**
    * A workflow specific event occurred.
    */
  var event: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * A list of timestamped events.
    */
  var events: js.UndefOr[js.Array[SchemaTimestampedEvent]] = js.undefined
  
  /**
    * The operation has finished with the given result.
    */
  var result: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * An SOS report for an unexpected VM failure.
    */
  var sosReport: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data about the status of the worker VM.
    */
  var workerStatus: js.UndefOr[SchemaWorkerStatus] = js.undefined
}
object SchemaCheckInRequest {
  
  inline def apply(): SchemaCheckInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInRequest]
  }
  
  extension [Self <: SchemaCheckInRequest](x: Self) {
    
    inline def setDeadlineExpired(value: SchemaEmpty): Self = StObject.set(x, "deadlineExpired", value.asInstanceOf[js.Any])
    
    inline def setDeadlineExpiredUndefined: Self = StObject.set(x, "deadlineExpired", js.undefined)
    
    inline def setEvent(value: StringDictionary[Any]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEvents(value: js.Array[SchemaTimestampedEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SchemaTimestampedEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setResult(value: SchemaStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSosReport(value: String): Self = StObject.set(x, "sosReport", value.asInstanceOf[js.Any])
    
    inline def setSosReportNull: Self = StObject.set(x, "sosReport", null)
    
    inline def setSosReportUndefined: Self = StObject.set(x, "sosReport", js.undefined)
    
    inline def setWorkerStatus(value: SchemaWorkerStatus): Self = StObject.set(x, "workerStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkerStatusUndefined: Self = StObject.set(x, "workerStatus", js.undefined)
  }
}
