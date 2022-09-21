package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingConfigTask extends StObject {
  
  /** Chunk size for commit streams from the harness to windmill. */
  var commitStreamChunkSizeBytes: js.UndefOr[String] = js.undefined
  
  /** Chunk size for get data streams from the harness to windmill. */
  var getDataStreamChunkSizeBytes: js.UndefOr[String] = js.undefined
  
  /** Maximum size for work item commit supported windmill storage layer. */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.undefined
  
  /** Set of computation configuration information. */
  var streamingComputationConfigs: js.UndefOr[js.Array[StreamingComputationConfig]] = js.undefined
  
  /** Map from user step names to state families. */
  var userStepToStateFamilyNameMap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingConfigTask & TopLevel[Any]
  ] = js.undefined
  
  /** If present, the worker must use this endpoint to communicate with Windmill Service dispatchers, otherwise the worker must continue to use whatever endpoint it had been using. */
  var windmillServiceEndpoint: js.UndefOr[String] = js.undefined
  
  /** If present, the worker must use this port to communicate with Windmill Service dispatchers. Only applicable when windmill_service_endpoint is specified. */
  var windmillServicePort: js.UndefOr[String] = js.undefined
}
object StreamingConfigTask {
  
  inline def apply(): StreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingConfigTask]
  }
  
  extension [Self <: StreamingConfigTask](x: Self) {
    
    inline def setCommitStreamChunkSizeBytes(value: String): Self = StObject.set(x, "commitStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCommitStreamChunkSizeBytesUndefined: Self = StObject.set(x, "commitStreamChunkSizeBytes", js.undefined)
    
    inline def setGetDataStreamChunkSizeBytes(value: String): Self = StObject.set(x, "getDataStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setGetDataStreamChunkSizeBytesUndefined: Self = StObject.set(x, "getDataStreamChunkSizeBytes", js.undefined)
    
    inline def setMaxWorkItemCommitBytes(value: String): Self = StObject.set(x, "maxWorkItemCommitBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkItemCommitBytesUndefined: Self = StObject.set(x, "maxWorkItemCommitBytes", js.undefined)
    
    inline def setStreamingComputationConfigs(value: js.Array[StreamingComputationConfig]): Self = StObject.set(x, "streamingComputationConfigs", value.asInstanceOf[js.Any])
    
    inline def setStreamingComputationConfigsUndefined: Self = StObject.set(x, "streamingComputationConfigs", js.undefined)
    
    inline def setStreamingComputationConfigsVarargs(value: StreamingComputationConfig*): Self = StObject.set(x, "streamingComputationConfigs", js.Array(value*))
    
    inline def setUserStepToStateFamilyNameMap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.StreamingConfigTask & TopLevel[Any]
    ): Self = StObject.set(x, "userStepToStateFamilyNameMap", value.asInstanceOf[js.Any])
    
    inline def setUserStepToStateFamilyNameMapUndefined: Self = StObject.set(x, "userStepToStateFamilyNameMap", js.undefined)
    
    inline def setWindmillServiceEndpoint(value: String): Self = StObject.set(x, "windmillServiceEndpoint", value.asInstanceOf[js.Any])
    
    inline def setWindmillServiceEndpointUndefined: Self = StObject.set(x, "windmillServiceEndpoint", js.undefined)
    
    inline def setWindmillServicePort(value: String): Self = StObject.set(x, "windmillServicePort", value.asInstanceOf[js.Any])
    
    inline def setWindmillServicePortUndefined: Self = StObject.set(x, "windmillServicePort", js.undefined)
  }
}
