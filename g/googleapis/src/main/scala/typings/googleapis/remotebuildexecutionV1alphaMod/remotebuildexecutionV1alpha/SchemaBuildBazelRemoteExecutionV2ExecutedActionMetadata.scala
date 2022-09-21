package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata extends StObject {
  
  /**
    * Details that are specific to the kind of worker used. For example, on POSIX-like systems this could contain a message with getrusage(2) statistics.
    */
  var auxiliaryMetadata: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * When the worker completed executing the action command.
    */
  var executionCompletedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker started executing the action command.
    */
  var executionStartTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker finished fetching action inputs.
    */
  var inputFetchCompletedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker started fetching action inputs.
    */
  var inputFetchStartTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker finished uploading action outputs.
    */
  var outputUploadCompletedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker started uploading action outputs.
    */
  var outputUploadStartTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When was the action added to the queue.
    */
  var queuedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the worker which ran the execution.
    */
  var worker: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker completed the action, including all stages.
    */
  var workerCompletedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the worker received the action.
    */
  var workerStartTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata](x: Self) {
    
    inline def setAuxiliaryMetadata(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "auxiliaryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryMetadataNull: Self = StObject.set(x, "auxiliaryMetadata", null)
    
    inline def setAuxiliaryMetadataUndefined: Self = StObject.set(x, "auxiliaryMetadata", js.undefined)
    
    inline def setAuxiliaryMetadataVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "auxiliaryMetadata", js.Array(value*))
    
    inline def setExecutionCompletedTimestamp(value: String): Self = StObject.set(x, "executionCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExecutionCompletedTimestampNull: Self = StObject.set(x, "executionCompletedTimestamp", null)
    
    inline def setExecutionCompletedTimestampUndefined: Self = StObject.set(x, "executionCompletedTimestamp", js.undefined)
    
    inline def setExecutionStartTimestamp(value: String): Self = StObject.set(x, "executionStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartTimestampNull: Self = StObject.set(x, "executionStartTimestamp", null)
    
    inline def setExecutionStartTimestampUndefined: Self = StObject.set(x, "executionStartTimestamp", js.undefined)
    
    inline def setInputFetchCompletedTimestamp(value: String): Self = StObject.set(x, "inputFetchCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInputFetchCompletedTimestampNull: Self = StObject.set(x, "inputFetchCompletedTimestamp", null)
    
    inline def setInputFetchCompletedTimestampUndefined: Self = StObject.set(x, "inputFetchCompletedTimestamp", js.undefined)
    
    inline def setInputFetchStartTimestamp(value: String): Self = StObject.set(x, "inputFetchStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInputFetchStartTimestampNull: Self = StObject.set(x, "inputFetchStartTimestamp", null)
    
    inline def setInputFetchStartTimestampUndefined: Self = StObject.set(x, "inputFetchStartTimestamp", js.undefined)
    
    inline def setOutputUploadCompletedTimestamp(value: String): Self = StObject.set(x, "outputUploadCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOutputUploadCompletedTimestampNull: Self = StObject.set(x, "outputUploadCompletedTimestamp", null)
    
    inline def setOutputUploadCompletedTimestampUndefined: Self = StObject.set(x, "outputUploadCompletedTimestamp", js.undefined)
    
    inline def setOutputUploadStartTimestamp(value: String): Self = StObject.set(x, "outputUploadStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOutputUploadStartTimestampNull: Self = StObject.set(x, "outputUploadStartTimestamp", null)
    
    inline def setOutputUploadStartTimestampUndefined: Self = StObject.set(x, "outputUploadStartTimestamp", js.undefined)
    
    inline def setQueuedTimestamp(value: String): Self = StObject.set(x, "queuedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimestampNull: Self = StObject.set(x, "queuedTimestamp", null)
    
    inline def setQueuedTimestampUndefined: Self = StObject.set(x, "queuedTimestamp", js.undefined)
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerCompletedTimestamp(value: String): Self = StObject.set(x, "workerCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWorkerCompletedTimestampNull: Self = StObject.set(x, "workerCompletedTimestamp", null)
    
    inline def setWorkerCompletedTimestampUndefined: Self = StObject.set(x, "workerCompletedTimestamp", js.undefined)
    
    inline def setWorkerNull: Self = StObject.set(x, "worker", null)
    
    inline def setWorkerStartTimestamp(value: String): Self = StObject.set(x, "workerStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWorkerStartTimestampNull: Self = StObject.set(x, "workerStartTimestamp", null)
    
    inline def setWorkerStartTimestampUndefined: Self = StObject.set(x, "workerStartTimestamp", js.undefined)
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
