package typings.googleapis.lifesciencesV2betaMod.lifesciencesV2beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunPipelineRequest extends StObject {
  
  /**
    * User-defined labels to associate with the returned operation. These labels are not propagated to any Google Cloud Platform resources used by the operation, and can be modified at any time. To associate labels with resources created while executing the operation, see the appropriate resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The description of the pipeline to run.
    */
  var pipeline: js.UndefOr[SchemaPipeline] = js.undefined
  
  /**
    * The name of an existing Pub/Sub topic. The server will publish messages to this topic whenever the status of the operation changes. The Life Sciences Service Agent account must have publisher permissions to the specified topic or notifications will not be sent.
    */
  var pubSubTopic: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunPipelineRequest {
  
  inline def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  
  extension [Self <: SchemaRunPipelineRequest](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPipeline(value: SchemaPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPubSubTopic(value: String): Self = StObject.set(x, "pubSubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubSubTopicNull: Self = StObject.set(x, "pubSubTopic", null)
    
    inline def setPubSubTopicUndefined: Self = StObject.set(x, "pubSubTopic", js.undefined)
  }
}
