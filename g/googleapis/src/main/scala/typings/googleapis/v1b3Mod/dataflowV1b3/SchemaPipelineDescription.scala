package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Description of each transform in the pipeline and collections between them.
    */
  var originalPipelineTransform: js.UndefOr[js.Array[SchemaTransformSummary]] = js.undefined
}
object SchemaPipelineDescription {
  
  inline def apply(): SchemaPipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineDescription]
  }
  
  extension [Self <: SchemaPipelineDescription](x: Self) {
    
    inline def setDisplayData(value: js.Array[SchemaDisplayData]): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataUndefined: Self = StObject.set(x, "displayData", js.undefined)
    
    inline def setDisplayDataVarargs(value: SchemaDisplayData*): Self = StObject.set(x, "displayData", js.Array(value*))
    
    inline def setExecutionPipelineStage(value: js.Array[SchemaExecutionStageSummary]): Self = StObject.set(x, "executionPipelineStage", value.asInstanceOf[js.Any])
    
    inline def setExecutionPipelineStageUndefined: Self = StObject.set(x, "executionPipelineStage", js.undefined)
    
    inline def setExecutionPipelineStageVarargs(value: SchemaExecutionStageSummary*): Self = StObject.set(x, "executionPipelineStage", js.Array(value*))
    
    inline def setOriginalPipelineTransform(value: js.Array[SchemaTransformSummary]): Self = StObject.set(x, "originalPipelineTransform", value.asInstanceOf[js.Any])
    
    inline def setOriginalPipelineTransformUndefined: Self = StObject.set(x, "originalPipelineTransform", js.undefined)
    
    inline def setOriginalPipelineTransformVarargs(value: SchemaTransformSummary*): Self = StObject.set(x, "originalPipelineTransform", js.Array(value*))
  }
}
