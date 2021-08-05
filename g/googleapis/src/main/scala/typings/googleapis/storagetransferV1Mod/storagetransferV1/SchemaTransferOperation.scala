package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of the execution of a transfer.
  */
trait SchemaTransferOperation extends StObject {
  
  /**
    * Information about the progress of the transfer operation.
    */
  var counters: js.UndefOr[SchemaTransferCounters] = js.undefined
  
  /**
    * End time of this transfer execution.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Summarizes errors encountered with sample error log entries.
    */
  var errorBreakdowns: js.UndefOr[js.Array[SchemaErrorSummary]] = js.undefined
  
  /**
    * A globally unique ID assigned by the system.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Google Cloud Platform Project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Start time of this transfer execution.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the transfer operation.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the transfer job that triggers this transfer operation.
    */
  var transferJobName: js.UndefOr[String] = js.undefined
  
  /**
    * Transfer specification. Required.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.undefined
}
object SchemaTransferOperation {
  
  inline def apply(): SchemaTransferOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferOperation]
  }
  
  extension [Self <: SchemaTransferOperation](x: Self) {
    
    inline def setCounters(value: SchemaTransferCounters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setErrorBreakdowns(value: js.Array[SchemaErrorSummary]): Self = StObject.set(x, "errorBreakdowns", value.asInstanceOf[js.Any])
    
    inline def setErrorBreakdownsUndefined: Self = StObject.set(x, "errorBreakdowns", js.undefined)
    
    inline def setErrorBreakdownsVarargs(value: SchemaErrorSummary*): Self = StObject.set(x, "errorBreakdowns", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransferJobName(value: String): Self = StObject.set(x, "transferJobName", value.asInstanceOf[js.Any])
    
    inline def setTransferJobNameUndefined: Self = StObject.set(x, "transferJobName", js.undefined)
    
    inline def setTransferSpec(value: SchemaTransferSpec): Self = StObject.set(x, "transferSpec", value.asInstanceOf[js.Any])
    
    inline def setTransferSpecUndefined: Self = StObject.set(x, "transferSpec", js.undefined)
  }
}
