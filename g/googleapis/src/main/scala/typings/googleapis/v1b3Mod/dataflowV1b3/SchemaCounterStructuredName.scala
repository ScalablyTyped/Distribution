package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a counter within a per-job namespace. Counters whose structured
  * names are the same get merged into a single value for the job.
  */
@js.native
trait SchemaCounterStructuredName extends js.Object {
  
  /**
    * Name of the optimized step being executed by the workers.
    */
  var componentStepName: js.UndefOr[String] = js.native
  
  /**
    * Name of the stage. An execution step contains multiple component steps.
    */
  var executionStepName: js.UndefOr[String] = js.native
  
  /**
    * Index of an input collection that&#39;s being read from/written to as a
    * side input. The index identifies a step&#39;s side inputs starting by 1
    * (e.g. the first side input has input_index 1, the third has input_index
    * 3). Side inputs are identified by a pair of (original_step_name,
    * input_index). This field helps uniquely identify them.
    */
  var inputIndex: js.UndefOr[Double] = js.native
  
  /**
    * Counter name. Not necessarily globally-unique, but unique within the
    * context of the other fields. Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * One of the standard Origins defined above.
    */
  var origin: js.UndefOr[String] = js.native
  
  /**
    * A string containing a more specific namespace of the counter&#39;s
    * origin.
    */
  var originNamespace: js.UndefOr[String] = js.native
  
  /**
    * The step name requesting an operation, such as GBK. I.e. the ParDo
    * causing a read/write from shuffle to occur, or a read from side inputs.
    */
  var originalRequestingStepName: js.UndefOr[String] = js.native
  
  /**
    * System generated name of the original step in the user&#39;s graph,
    * before optimization.
    */
  var originalStepName: js.UndefOr[String] = js.native
  
  /**
    * Portion of this counter, either key or value.
    */
  var portion: js.UndefOr[String] = js.native
  
  /**
    * ID of a particular worker.
    */
  var workerId: js.UndefOr[String] = js.native
}
object SchemaCounterStructuredName {
  
  @scala.inline
  def apply(): SchemaCounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredName]
  }
  
  @scala.inline
  implicit class SchemaCounterStructuredNameOps[Self <: SchemaCounterStructuredName] (val x: Self) extends AnyVal {
    
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
    def setComponentStepName(value: String): Self = this.set("componentStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentStepName: Self = this.set("componentStepName", js.undefined)
    
    @scala.inline
    def setExecutionStepName(value: String): Self = this.set("executionStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionStepName: Self = this.set("executionStepName", js.undefined)
    
    @scala.inline
    def setInputIndex(value: Double): Self = this.set("inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputIndex: Self = this.set("inputIndex", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setOriginNamespace(value: String): Self = this.set("originNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginNamespace: Self = this.set("originNamespace", js.undefined)
    
    @scala.inline
    def setOriginalRequestingStepName(value: String): Self = this.set("originalRequestingStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRequestingStepName: Self = this.set("originalRequestingStepName", js.undefined)
    
    @scala.inline
    def setOriginalStepName(value: String): Self = this.set("originalStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalStepName: Self = this.set("originalStepName", js.undefined)
    
    @scala.inline
    def setPortion(value: String): Self = this.set("portion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortion: Self = this.set("portion", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = this.set("workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerId: Self = this.set("workerId", js.undefined)
  }
}
