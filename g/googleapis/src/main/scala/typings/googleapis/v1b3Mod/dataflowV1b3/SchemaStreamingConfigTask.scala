package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task that carries configuration information for streaming computations.
  */
@js.native
trait SchemaStreamingConfigTask extends js.Object {
  
  /**
    * Maximum size for work item commit supported windmill storage layer.
    */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.native
  
  /**
    * Set of computation configuration information.
    */
  var streamingComputationConfigs: js.UndefOr[js.Array[SchemaStreamingComputationConfig]] = js.native
  
  /**
    * Map from user step names to state families.
    */
  var userStepToStateFamilyNameMap: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * If present, the worker must use this endpoint to communicate with
    * Windmill Service dispatchers, otherwise the worker must continue to use
    * whatever endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.native
  
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.native
}
object SchemaStreamingConfigTask {
  
  @scala.inline
  def apply(): SchemaStreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingConfigTask]
  }
  
  @scala.inline
  implicit class SchemaStreamingConfigTaskOps[Self <: SchemaStreamingConfigTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxWorkItemCommitBytes(value: String): Self = this.set("maxWorkItemCommitBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWorkItemCommitBytes: Self = this.set("maxWorkItemCommitBytes", js.undefined)
    
    @scala.inline
    def setStreamingComputationConfigsVarargs(value: SchemaStreamingComputationConfig*): Self = this.set("streamingComputationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setStreamingComputationConfigs(value: js.Array[SchemaStreamingComputationConfig]): Self = this.set("streamingComputationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingComputationConfigs: Self = this.set("streamingComputationConfigs", js.undefined)
    
    @scala.inline
    def setUserStepToStateFamilyNameMap(value: StringDictionary[String]): Self = this.set("userStepToStateFamilyNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStepToStateFamilyNameMap: Self = this.set("userStepToStateFamilyNameMap", js.undefined)
    
    @scala.inline
    def setWindmillServiceEndpoint(value: String): Self = this.set("windmillServiceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindmillServiceEndpoint: Self = this.set("windmillServiceEndpoint", js.undefined)
    
    @scala.inline
    def setWindmillServicePort(value: String): Self = this.set("windmillServicePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindmillServicePort: Self = this.set("windmillServicePort", js.undefined)
  }
}
