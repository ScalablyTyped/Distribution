package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineDescription extends StObject {
  
  /** Pipeline level display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.undefined
  
  /** Description of each stage of execution of the pipeline. */
  var executionPipelineStage: js.UndefOr[js.Array[ExecutionStageSummary]] = js.undefined
  
  /** Description of each transform in the pipeline and collections between them. */
  var originalPipelineTransform: js.UndefOr[js.Array[TransformSummary]] = js.undefined
}
object PipelineDescription {
  
  inline def apply(): PipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineDescription] (val x: Self) extends AnyVal {
    
    inline def setDisplayData(value: js.Array[DisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: DisplayData*): Self = StObject.set(x, "displayData", js.Array(value*))
    
    inline def setExecutionPipelineStage(value: js.Array[ExecutionStageSummary]): Self = StObject.set(x, "executionPipelineStage", value.asInstanceOf[js.Any])
    
    inline def setExecutionPipelineStageUndefined: Self = StObject.set(x, "executionPipelineStage", js.undefined)
    
    inline def setExecutionPipelineStageVarargs(value: ExecutionStageSummary*): Self = StObject.set(x, "executionPipelineStage", js.Array(value*))
    
    inline def setOriginalPipelineTransform(value: js.Array[TransformSummary]): Self = StObject.set(x, "originalPipelineTransform", value.asInstanceOf[js.Any])
    
    inline def setOriginalPipelineTransformUndefined: Self = StObject.set(x, "originalPipelineTransform", js.undefined)
    
    inline def setOriginalPipelineTransformVarargs(value: TransformSummary*): Self = StObject.set(x, "originalPipelineTransform", js.Array(value*))
  }
}
