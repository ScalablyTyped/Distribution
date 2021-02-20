package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a counter within a per-job namespace. Counters whose structured
  * names are the same get merged into a single value for the job.
  */
@js.native
trait SchemaCounterStructuredName extends StObject {
  
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
  implicit class SchemaCounterStructuredNameMutableBuilder[Self <: SchemaCounterStructuredName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentStepName(value: String): Self = StObject.set(x, "componentStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentStepNameUndefined: Self = StObject.set(x, "componentStepName", js.undefined)
    
    @scala.inline
    def setExecutionStepName(value: String): Self = StObject.set(x, "executionStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStepNameUndefined: Self = StObject.set(x, "executionStepName", js.undefined)
    
    @scala.inline
    def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIndexUndefined: Self = StObject.set(x, "inputIndex", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginNamespace(value: String): Self = StObject.set(x, "originNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginNamespaceUndefined: Self = StObject.set(x, "originNamespace", js.undefined)
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginalRequestingStepName(value: String): Self = StObject.set(x, "originalRequestingStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestingStepNameUndefined: Self = StObject.set(x, "originalRequestingStepName", js.undefined)
    
    @scala.inline
    def setOriginalStepName(value: String): Self = StObject.set(x, "originalStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStepNameUndefined: Self = StObject.set(x, "originalStepName", js.undefined)
    
    @scala.inline
    def setPortion(value: String): Self = StObject.set(x, "portion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortionUndefined: Self = StObject.set(x, "portion", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
