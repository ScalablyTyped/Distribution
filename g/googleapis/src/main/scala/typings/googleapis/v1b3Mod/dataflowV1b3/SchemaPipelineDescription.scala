package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A descriptive representation of submitted pipeline as well as the executed
  * form.  This data is provided by the Dataflow service for ease of
  * visualizing the pipeline and interpreting Dataflow provided metrics.
  */
trait SchemaPipelineDescription extends StObject {
  
  /**
    * Pipeline level display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.undefined
  
  /**
    * Description of each stage of execution of the pipeline.
    */
  var executionPipelineStage: js.UndefOr[js.Array[SchemaExecutionStageSummary]] = js.undefined
  
  /**
    * Description of each transform in the pipeline and collections between
    * them.
    */
  var originalPipelineTransform: js.UndefOr[js.Array[SchemaTransformSummary]] = js.undefined
}
object SchemaPipelineDescription {
  
  @scala.inline
  def apply(): SchemaPipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineDescription]
  }
  
  @scala.inline
  implicit class SchemaPipelineDescriptionMutableBuilder[Self <: SchemaPipelineDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayData(value: js.Array[SchemaDisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    @scala.inline
    def setDisplayDataVarargs(value: SchemaDisplayData*): Self = StObject.set(x, "displayData", js.Array(value :_*))
    
    @scala.inline
    def setExecutionPipelineStage(value: js.Array[SchemaExecutionStageSummary]): Self = StObject.set(x, "executionPipelineStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPipelineStageUndefined: Self = StObject.set(x, "executionPipelineStage", js.undefined)
    
    @scala.inline
    def setExecutionPipelineStageVarargs(value: SchemaExecutionStageSummary*): Self = StObject.set(x, "executionPipelineStage", js.Array(value :_*))
    
    @scala.inline
    def setOriginalPipelineTransform(value: js.Array[SchemaTransformSummary]): Self = StObject.set(x, "originalPipelineTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPipelineTransformUndefined: Self = StObject.set(x, "originalPipelineTransform", js.undefined)
    
    @scala.inline
    def setOriginalPipelineTransformVarargs(value: SchemaTransformSummary*): Self = StObject.set(x, "originalPipelineTransform", js.Array(value :_*))
  }
}
