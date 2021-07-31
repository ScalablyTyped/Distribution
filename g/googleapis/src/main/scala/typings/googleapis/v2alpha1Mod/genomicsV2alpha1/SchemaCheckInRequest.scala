package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameters to the CheckIn method.
  */
trait SchemaCheckInRequest extends StObject {
  
  /**
    * The deadline has expired and the worker needs more time.
    */
  var deadlineExpired: js.UndefOr[SchemaEmpty] = js.undefined
  
  /**
    * A workflow specific event occurred.
    */
  var event: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The operation has finished with the given result.
    */
  var result: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Data about the status of the worker VM.
    */
  var workerStatus: js.UndefOr[SchemaWorkerStatus] = js.undefined
}
object SchemaCheckInRequest {
  
  @scala.inline
  def apply(): SchemaCheckInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInRequest]
  }
  
  @scala.inline
  implicit class SchemaCheckInRequestMutableBuilder[Self <: SchemaCheckInRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadlineExpired(value: SchemaEmpty): Self = StObject.set(x, "deadlineExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadlineExpiredUndefined: Self = StObject.set(x, "deadlineExpired", js.undefined)
    
    @scala.inline
    def setEvent(value: StringDictionary[js.Any]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setWorkerStatus(value: SchemaWorkerStatus): Self = StObject.set(x, "workerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerStatusUndefined: Self = StObject.set(x, "workerStatus", js.undefined)
  }
}
