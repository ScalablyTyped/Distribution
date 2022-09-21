package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCounterStructuredName extends StObject {
  
  /**
    * Name of the optimized step being executed by the workers.
    */
  var componentStepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the stage. An execution step contains multiple component steps.
    */
  var executionStepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Index of an input collection that's being read from/written to as a side input. The index identifies a step's side inputs starting by 1 (e.g. the first side input has input_index 1, the third has input_index 3). Side inputs are identified by a pair of (original_step_name, input_index). This field helps uniquely identify them.
    */
  var inputIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Counter name. Not necessarily globally-unique, but unique within the context of the other fields. Required.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One of the standard Origins defined above.
    */
  var origin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string containing a more specific namespace of the counter's origin.
    */
  var originNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The step name requesting an operation, such as GBK. I.e. the ParDo causing a read/write from shuffle to occur, or a read from side inputs.
    */
  var originalRequestingStepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System generated name of the original step in the user's graph, before optimization.
    */
  var originalStepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Portion of this counter, either key or value.
    */
  var portion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of a particular worker.
    */
  var workerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCounterStructuredName {
  
  inline def apply(): SchemaCounterStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterStructuredName]
  }
  
  extension [Self <: SchemaCounterStructuredName](x: Self) {
    
    inline def setComponentStepName(value: String): Self = StObject.set(x, "componentStepName", value.asInstanceOf[js.Any])
    
    inline def setComponentStepNameNull: Self = StObject.set(x, "componentStepName", null)
    
    inline def setComponentStepNameUndefined: Self = StObject.set(x, "componentStepName", js.undefined)
    
    inline def setExecutionStepName(value: String): Self = StObject.set(x, "executionStepName", value.asInstanceOf[js.Any])
    
    inline def setExecutionStepNameNull: Self = StObject.set(x, "executionStepName", null)
    
    inline def setExecutionStepNameUndefined: Self = StObject.set(x, "executionStepName", js.undefined)
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setInputIndexNull: Self = StObject.set(x, "inputIndex", null)
    
    inline def setInputIndexUndefined: Self = StObject.set(x, "inputIndex", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginNamespace(value: String): Self = StObject.set(x, "originNamespace", value.asInstanceOf[js.Any])
    
    inline def setOriginNamespaceNull: Self = StObject.set(x, "originNamespace", null)
    
    inline def setOriginNamespaceUndefined: Self = StObject.set(x, "originNamespace", js.undefined)
    
    inline def setOriginNull: Self = StObject.set(x, "origin", null)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginalRequestingStepName(value: String): Self = StObject.set(x, "originalRequestingStepName", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestingStepNameNull: Self = StObject.set(x, "originalRequestingStepName", null)
    
    inline def setOriginalRequestingStepNameUndefined: Self = StObject.set(x, "originalRequestingStepName", js.undefined)
    
    inline def setOriginalStepName(value: String): Self = StObject.set(x, "originalStepName", value.asInstanceOf[js.Any])
    
    inline def setOriginalStepNameNull: Self = StObject.set(x, "originalStepName", null)
    
    inline def setOriginalStepNameUndefined: Self = StObject.set(x, "originalStepName", js.undefined)
    
    inline def setPortion(value: String): Self = StObject.set(x, "portion", value.asInstanceOf[js.Any])
    
    inline def setPortionNull: Self = StObject.set(x, "portion", null)
    
    inline def setPortionUndefined: Self = StObject.set(x, "portion", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdNull: Self = StObject.set(x, "workerId", null)
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
