package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunPipelineRequest extends StObject {
  
  /**
    * A new pipeline object to run once and then delete.
    */
  var ephemeralPipeline: js.UndefOr[SchemaPipeline] = js.undefined
  
  /**
    * The arguments to use when running this pipeline.
    */
  var pipelineArgs: js.UndefOr[SchemaRunPipelineArgs] = js.undefined
  
  /**
    * The already created pipeline to run.
    */
  var pipelineId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunPipelineRequest {
  
  inline def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  
  extension [Self <: SchemaRunPipelineRequest](x: Self) {
    
    inline def setEphemeralPipeline(value: SchemaPipeline): Self = StObject.set(x, "ephemeralPipeline", value.asInstanceOf[js.Any])
    
    inline def setEphemeralPipelineUndefined: Self = StObject.set(x, "ephemeralPipeline", js.undefined)
    
    inline def setPipelineArgs(value: SchemaRunPipelineArgs): Self = StObject.set(x, "pipelineArgs", value.asInstanceOf[js.Any])
    
    inline def setPipelineArgsUndefined: Self = StObject.set(x, "pipelineArgs", js.undefined)
    
    inline def setPipelineId(value: String): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineIdNull: Self = StObject.set(x, "pipelineId", null)
    
    inline def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
  }
}
