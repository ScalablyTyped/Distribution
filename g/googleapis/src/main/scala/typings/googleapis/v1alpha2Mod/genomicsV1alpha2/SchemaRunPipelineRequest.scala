package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to run a pipeline. If `pipelineId` is specified, it refers to a
  * saved pipeline created with CreatePipeline and set as the `pipelineId` of
  * the returned Pipeline object. If `ephemeralPipeline` is specified, that
  * pipeline is run once with the given args and not saved. It is an error to
  * specify both `pipelineId` and `ephemeralPipeline`. `pipelineArgs` must be
  * specified.
  */
@js.native
trait SchemaRunPipelineRequest extends js.Object {
  
  /**
    * A new pipeline object to run once and then delete.
    */
  var ephemeralPipeline: js.UndefOr[SchemaPipeline] = js.native
  
  /**
    * The arguments to use when running this pipeline.
    */
  var pipelineArgs: js.UndefOr[SchemaRunPipelineArgs] = js.native
  
  /**
    * The already created pipeline to run.
    */
  var pipelineId: js.UndefOr[String] = js.native
}
object SchemaRunPipelineRequest {
  
  @scala.inline
  def apply(): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
  
  @scala.inline
  implicit class SchemaRunPipelineRequestOps[Self <: SchemaRunPipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEphemeralPipeline(value: SchemaPipeline): Self = this.set("ephemeralPipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEphemeralPipeline: Self = this.set("ephemeralPipeline", js.undefined)
    
    @scala.inline
    def setPipelineArgs(value: SchemaRunPipelineArgs): Self = this.set("pipelineArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineArgs: Self = this.set("pipelineArgs", js.undefined)
    
    @scala.inline
    def setPipelineId(value: String): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineId: Self = this.set("pipelineId", js.undefined)
  }
}
