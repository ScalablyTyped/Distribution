package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingConfigTask extends StObject {
  
  /** Chunk size for commit streams from the harness to windmill. */
  var commitStreamChunkSizeBytes: js.UndefOr[String] = js.native
  
  /** Chunk size for get data streams from the harness to windmill. */
  var getDataStreamChunkSizeBytes: js.UndefOr[String] = js.native
  
  /** Maximum size for work item commit supported windmill storage layer. */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.native
  
  /** Set of computation configuration information. */
  var streamingComputationConfigs: js.UndefOr[js.Array[StreamingComputationConfig]] = js.native
  
  /** Map from user step names to state families. */
  var userStepToStateFamilyNameMap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingConfigTask with TopLevel[js.Any]
  ] = js.native
  
  /** If present, the worker must use this endpoint to communicate with Windmill Service dispatchers, otherwise the worker must continue to use whatever endpoint it had been using. */
  var windmillServiceEndpoint: js.UndefOr[String] = js.native
  
  /** If present, the worker must use this port to communicate with Windmill Service dispatchers. Only applicable when windmill_service_endpoint is specified. */
  var windmillServicePort: js.UndefOr[String] = js.native
}
object StreamingConfigTask {
  
  @scala.inline
  def apply(): StreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingConfigTask]
  }
  
  @scala.inline
  implicit class StreamingConfigTaskMutableBuilder[Self <: StreamingConfigTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitStreamChunkSizeBytes(value: String): Self = StObject.set(x, "commitStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitStreamChunkSizeBytesUndefined: Self = StObject.set(x, "commitStreamChunkSizeBytes", js.undefined)
    
    @scala.inline
    def setGetDataStreamChunkSizeBytes(value: String): Self = StObject.set(x, "getDataStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataStreamChunkSizeBytesUndefined: Self = StObject.set(x, "getDataStreamChunkSizeBytes", js.undefined)
    
    @scala.inline
    def setMaxWorkItemCommitBytes(value: String): Self = StObject.set(x, "maxWorkItemCommitBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkItemCommitBytesUndefined: Self = StObject.set(x, "maxWorkItemCommitBytes", js.undefined)
    
    @scala.inline
    def setStreamingComputationConfigs(value: js.Array[StreamingComputationConfig]): Self = StObject.set(x, "streamingComputationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingComputationConfigsUndefined: Self = StObject.set(x, "streamingComputationConfigs", js.undefined)
    
    @scala.inline
    def setStreamingComputationConfigsVarargs(value: StreamingComputationConfig*): Self = StObject.set(x, "streamingComputationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setUserStepToStateFamilyNameMap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingConfigTask with TopLevel[js.Any]
    ): Self = StObject.set(x, "userStepToStateFamilyNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStepToStateFamilyNameMapUndefined: Self = StObject.set(x, "userStepToStateFamilyNameMap", js.undefined)
    
    @scala.inline
    def setWindmillServiceEndpoint(value: String): Self = StObject.set(x, "windmillServiceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindmillServiceEndpointUndefined: Self = StObject.set(x, "windmillServiceEndpoint", js.undefined)
    
    @scala.inline
    def setWindmillServicePort(value: String): Self = StObject.set(x, "windmillServicePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindmillServicePortUndefined: Self = StObject.set(x, "windmillServicePort", js.undefined)
  }
}
