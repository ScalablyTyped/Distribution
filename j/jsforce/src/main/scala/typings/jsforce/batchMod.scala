package typings.jsforce

import typings.jsforce.recordMod.Record
import typings.jsforce.recordResultMod.RecordResult
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMod {
  
  @JSImport("jsforce/batch", "Batch")
  @js.native
  class Batch () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def check(): js.Promise[BatchInfo] = js.native
    def check(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[BatchInfo] = js.native
    
    def execute(): Batch = js.native
    def execute(
      input: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(input: String): Batch = js.native
    def execute(
      input: String,
      callback: js.Function2[/* err */ Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(input: js.Array[Record[_]]): Batch = js.native
    def execute(
      input: js.Array[Record[_]],
      callback: js.Function2[/* err */ Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def execute(input: Stream): Batch = js.native
    def execute(
      input: Stream,
      callback: js.Function2[/* err */ Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    
    def poll(interval: Double, timeout: Double): Unit = js.native
    
    def retrieve(): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
    def retrieve(callback: js.Function1[/* batchInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchResultInfo | RecordResult]] = js.native
    
    def `then`(): js.Promise[_] = js.native
    
    def thenAll(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait BatchInfo extends StObject {
    
    var id: String = js.native
    
    var jobId: String = js.native
    
    var numberRecordsFailed: String = js.native
    
    var numberRecordsProcessed: String = js.native
    
    var state: String = js.native
    
    var stateMessage: String = js.native
    
    var totalProcessingTime: String = js.native
  }
  object BatchInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BatchInfoMutableBuilder[Self <: BatchInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberRecordsFailed(value: String): Self = StObject.set(x, "numberRecordsFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberRecordsProcessed(value: String): Self = StObject.set(x, "numberRecordsProcessed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalProcessingTime(value: String): Self = StObject.set(x, "totalProcessingTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BatchResultInfo extends StObject {
    
    var batchId: js.UndefOr[String] = js.native
    
    var errors: js.UndefOr[js.Array[String]] = js.native
    
    var id: String = js.native
    
    var jobId: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[Boolean] = js.native
  }
  object BatchResultInfo {
    
    @scala.inline
    def apply(id: String): BatchResultInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchResultInfo]
    }
    
    @scala.inline
    implicit class BatchResultInfoMutableBuilder[Self <: BatchResultInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
