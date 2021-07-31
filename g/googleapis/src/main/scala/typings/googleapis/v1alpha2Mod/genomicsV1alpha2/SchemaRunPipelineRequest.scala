package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to run a pipeline. If `pipelineId` is specified, it refers to a
  * saved pipeline created with CreatePipeline and set as the `pipelineId` of
  * the returned Pipeline object. If `ephemeralPipeline` is specified, that
  * pipeline is run once with the given args and not saved. It is an error to
  * specify both `pipelineId` and `ephemeralPipeline`. `pipelineArgs` must be
  * specified.
  */
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
  var pipelineId: js.UndefOr[String] = js.undefined
}
object SchemaRunPipelineRequest {
  
  @scala.inline
  def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  
  @scala.inline
  implicit class SchemaRunPipelineRequestMutableBuilder[Self <: SchemaRunPipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEphemeralPipeline(value: SchemaPipeline): Self = StObject.set(x, "ephemeralPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralPipelineUndefined: Self = StObject.set(x, "ephemeralPipeline", js.undefined)
    
    @scala.inline
    def setPipelineArgs(value: SchemaRunPipelineArgs): Self = StObject.set(x, "pipelineArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineArgsUndefined: Self = StObject.set(x, "pipelineArgs", js.undefined)
    
    @scala.inline
    def setPipelineId(value: String): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdUndefined: Self = StObject.set(x, "pipelineId", js.undefined)
  }
}
