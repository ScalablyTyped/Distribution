package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task that carries configuration information for streaming computations.
  */
trait SchemaStreamingConfigTask extends StObject {
  
  /**
    * Maximum size for work item commit supported windmill storage layer.
    */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.undefined
  
  /**
    * Set of computation configuration information.
    */
  var streamingComputationConfigs: js.UndefOr[js.Array[SchemaStreamingComputationConfig]] = js.undefined
  
  /**
    * Map from user step names to state families.
    */
  var userStepToStateFamilyNameMap: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * If present, the worker must use this endpoint to communicate with
    * Windmill Service dispatchers, otherwise the worker must continue to use
    * whatever endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.undefined
}
object SchemaStreamingConfigTask {
  
  @scala.inline
  def apply(): SchemaStreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingConfigTask]
  }
  
  @scala.inline
  implicit class SchemaStreamingConfigTaskMutableBuilder[Self <: SchemaStreamingConfigTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxWorkItemCommitBytes(value: String): Self = StObject.set(x, "maxWorkItemCommitBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorkItemCommitBytesUndefined: Self = StObject.set(x, "maxWorkItemCommitBytes", js.undefined)
    
    @scala.inline
    def setStreamingComputationConfigs(value: js.Array[SchemaStreamingComputationConfig]): Self = StObject.set(x, "streamingComputationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingComputationConfigsUndefined: Self = StObject.set(x, "streamingComputationConfigs", js.undefined)
    
    @scala.inline
    def setStreamingComputationConfigsVarargs(value: SchemaStreamingComputationConfig*): Self = StObject.set(x, "streamingComputationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setUserStepToStateFamilyNameMap(value: StringDictionary[String]): Self = StObject.set(x, "userStepToStateFamilyNameMap", value.asInstanceOf[js.Any])
    
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
