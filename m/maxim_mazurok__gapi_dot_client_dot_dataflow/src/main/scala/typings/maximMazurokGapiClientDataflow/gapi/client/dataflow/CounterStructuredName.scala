package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStructuredName extends StObject {
  
  /** Name of the optimized step being executed by the workers. */
  var componentStepName: js.UndefOr[String] = js.undefined
  
  /** Name of the stage. An execution step contains multiple component steps. */
  var executionStepName: js.UndefOr[String] = js.undefined
  
  /**
    * Index of an input collection that's being read from/written to as a side input. The index identifies a step's side inputs starting by 1 (e.g. the first side input has input_index 1,
    * the third has input_index 3). Side inputs are identified by a pair of (original_step_name, input_index). This field helps uniquely identify them.
    */
  var inputIndex: js.UndefOr[Double] = js.undefined
  
  /** Counter name. Not necessarily globally-unique, but unique within the context of the other fields. Required. */
  var name: js.UndefOr[String] = js.undefined
  
  /** One of the standard Origins defined above. */
  var origin: js.UndefOr[String] = js.undefined
  
  /** A string containing a more specific namespace of the counter's origin. */
  var originNamespace: js.UndefOr[String] = js.undefined
  
  /** The step name requesting an operation, such as GBK. I.e. the ParDo causing a read/write from shuffle to occur, or a read from side inputs. */
  var originalRequestingStepName: js.UndefOr[String] = js.undefined
  
  /** System generated name of the original step in the user's graph, before optimization. */
  var originalStepName: js.UndefOr[String] = js.undefined
  
  /** Portion of this counter, either key or value. */
  var portion: js.UndefOr[String] = js.undefined
  
  /** ID of a particular worker. */
  var workerId: js.UndefOr[String] = js.undefined
}
object CounterStructuredName {
  
  @scala.inline
  def apply(): CounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStructuredName]
  }
  
  @scala.inline
  implicit class CounterStructuredNameMutableBuilder[Self <: CounterStructuredName] (val x: Self) extends AnyVal {
    
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
