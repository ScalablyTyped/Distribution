package typings.jsforce

import typings.jsforce.recordMod.Record
import typings.jsforce.recordResultMod.RecordResult
import typings.jsforce.recordStreamMod.Parsable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMod {
  
  @JSImport("jsforce/batch", "Batch")
  @js.native
  open class Batch () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def check(): js.Promise[BatchInfo] = js.native
    def check(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[BatchInfo] = js.native
    
    def execute(): Batch = js.native
    def execute(input: String): Batch = js.native
    def execute(
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(input: js.Array[Record[Any]]): Batch = js.native
    def execute(
      input: js.Array[Record[Any]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(
      input: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(input: Stream): Batch = js.native
    def execute(
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    
    def poll(interval: Double, timeout: Double): Unit = js.native
    
    def result(resultId: String): Parsable[Any] = js.native
    
    def retrieve(): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
    def retrieve(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
    
    def `then`(): js.Promise[Any] = js.native
    
    def thenAll(callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
  }
  
  trait BatchInfo extends StObject {
    
    var id: String
    
    var jobId: String
    
    var numberRecordsFailed: String
    
    var numberRecordsProcessed: String
    
    var state: String
    
    var stateMessage: String
    
    var totalProcessingTime: String
  }
  object BatchInfo {
    
    inline def apply(
      id: String,
      jobId: String,
      numberRecordsFailed: String,
      numberRecordsProcessed: String,
      state: String,
      stateMessage: String,
      totalProcessingTime: String
    ): BatchInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], numberRecordsFailed = numberRecordsFailed.asInstanceOf[js.Any], numberRecordsProcessed = numberRecordsProcessed.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateMessage = stateMessage.asInstanceOf[js.Any], totalProcessingTime = totalProcessingTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchInfo]
    }
    
    extension [Self <: BatchInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setNumberRecordsFailed(value: String): Self = StObject.set(x, "numberRecordsFailed", value.asInstanceOf[js.Any])
      
      inline def setNumberRecordsProcessed(value: String): Self = StObject.set(x, "numberRecordsProcessed", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
      
      inline def setTotalProcessingTime(value: String): Self = StObject.set(x, "totalProcessingTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchResultInfo extends StObject {
    
    var batchId: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[js.Array[String]] = js.undefined
    
    var id: String
    
    var jobId: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
  }
  object BatchResultInfo {
    
    inline def apply(id: String): BatchResultInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchResultInfo]
    }
    
    extension [Self <: BatchResultInfo](x: Self) {
      
      inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
      
      inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
