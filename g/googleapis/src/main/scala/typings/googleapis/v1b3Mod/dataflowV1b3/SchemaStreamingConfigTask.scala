package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingConfigTask extends StObject {
  
  /**
    * Chunk size for commit streams from the harness to windmill.
    */
  var commitStreamChunkSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Chunk size for get data streams from the harness to windmill.
    */
  var getDataStreamChunkSizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum size for work item commit supported windmill storage layer.
    */
  var maxWorkItemCommitBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of computation configuration information.
    */
  var streamingComputationConfigs: js.UndefOr[js.Array[SchemaStreamingComputationConfig]] = js.undefined
  
  /**
    * Map from user step names to state families.
    */
  var userStepToStateFamilyNameMap: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * If present, the worker must use this endpoint to communicate with Windmill Service dispatchers, otherwise the worker must continue to use whatever endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If present, the worker must use this port to communicate with Windmill Service dispatchers. Only applicable when windmill_service_endpoint is specified.
    */
  var windmillServicePort: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamingConfigTask {
  
  inline def apply(): SchemaStreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingConfigTask]
  }
  
  extension [Self <: SchemaStreamingConfigTask](x: Self) {
    
    inline def setCommitStreamChunkSizeBytes(value: String): Self = StObject.set(x, "commitStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setCommitStreamChunkSizeBytesNull: Self = StObject.set(x, "commitStreamChunkSizeBytes", null)
    
    inline def setCommitStreamChunkSizeBytesUndefined: Self = StObject.set(x, "commitStreamChunkSizeBytes", js.undefined)
    
    inline def setGetDataStreamChunkSizeBytes(value: String): Self = StObject.set(x, "getDataStreamChunkSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setGetDataStreamChunkSizeBytesNull: Self = StObject.set(x, "getDataStreamChunkSizeBytes", null)
    
    inline def setGetDataStreamChunkSizeBytesUndefined: Self = StObject.set(x, "getDataStreamChunkSizeBytes", js.undefined)
    
    inline def setMaxWorkItemCommitBytes(value: String): Self = StObject.set(x, "maxWorkItemCommitBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkItemCommitBytesNull: Self = StObject.set(x, "maxWorkItemCommitBytes", null)
    
    inline def setMaxWorkItemCommitBytesUndefined: Self = StObject.set(x, "maxWorkItemCommitBytes", js.undefined)
    
    inline def setStreamingComputationConfigs(value: js.Array[SchemaStreamingComputationConfig]): Self = StObject.set(x, "streamingComputationConfigs", value.asInstanceOf[js.Any])
    
    inline def setStreamingComputationConfigsUndefined: Self = StObject.set(x, "streamingComputationConfigs", js.undefined)
    
    inline def setStreamingComputationConfigsVarargs(value: SchemaStreamingComputationConfig*): Self = StObject.set(x, "streamingComputationConfigs", js.Array(value*))
    
    inline def setUserStepToStateFamilyNameMap(value: StringDictionary[String]): Self = StObject.set(x, "userStepToStateFamilyNameMap", value.asInstanceOf[js.Any])
    
    inline def setUserStepToStateFamilyNameMapNull: Self = StObject.set(x, "userStepToStateFamilyNameMap", null)
    
    inline def setUserStepToStateFamilyNameMapUndefined: Self = StObject.set(x, "userStepToStateFamilyNameMap", js.undefined)
    
    inline def setWindmillServiceEndpoint(value: String): Self = StObject.set(x, "windmillServiceEndpoint", value.asInstanceOf[js.Any])
    
    inline def setWindmillServiceEndpointNull: Self = StObject.set(x, "windmillServiceEndpoint", null)
    
    inline def setWindmillServiceEndpointUndefined: Self = StObject.set(x, "windmillServiceEndpoint", js.undefined)
    
    inline def setWindmillServicePort(value: String): Self = StObject.set(x, "windmillServicePort", value.asInstanceOf[js.Any])
    
    inline def setWindmillServicePortNull: Self = StObject.set(x, "windmillServicePort", null)
    
    inline def setWindmillServicePortUndefined: Self = StObject.set(x, "windmillServicePort", js.undefined)
  }
}
