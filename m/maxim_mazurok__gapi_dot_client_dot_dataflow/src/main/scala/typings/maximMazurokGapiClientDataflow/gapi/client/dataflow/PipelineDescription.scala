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
  
  @scala.inline
  def apply(): PipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDescription]
  }
  
  @scala.inline
  implicit class PipelineDescriptionMutableBuilder[Self <: PipelineDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayData(value: js.Array[DisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: DisplayData*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setExecutionPipelineStage(value: js.Array[ExecutionStageSummary]): Self = StObject.set(x, "executionPipelineStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPipelineStageUndefined: Self = StObject.set(x, "executionPipelineStage", js.undefined)
    
    @scala.inline
    def setExecutionPipelineStageVarargs(value: ExecutionStageSummary*): Self = StObject.set(x, "executionPipelineStage", js.Array(value :_*))
    
    @scala.inline
    def setOriginalPipelineTransform(value: js.Array[TransformSummary]): Self = StObject.set(x, "originalPipelineTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPipelineTransformUndefined: Self = StObject.set(x, "originalPipelineTransform", js.undefined)
    
    @scala.inline
    def setOriginalPipelineTransformVarargs(value: TransformSummary*): Self = StObject.set(x, "originalPipelineTransform", js.Array(value :_*))
  }
}
