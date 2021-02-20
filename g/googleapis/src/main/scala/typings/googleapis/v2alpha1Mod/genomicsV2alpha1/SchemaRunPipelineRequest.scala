package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments to the `RunPipeline` method. The requesting user must have
  * the `iam.serviceAccounts.actAs` permission for the Cloud Genomics service
  * account or the request will fail.
  */
@js.native
trait SchemaRunPipelineRequest extends StObject {
  
  /**
    * User-defined labels to associate with the returned operation. These
    * labels are not propagated to any Google Cloud Platform resources used by
    * the operation, and can be modified at any time.  To associate labels with
    * resources created while executing the operation, see the appropriate
    * resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The description of the pipeline to run.
    */
  var pipeline: js.UndefOr[SchemaPipeline] = js.native
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
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPipeline(value: SchemaPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
