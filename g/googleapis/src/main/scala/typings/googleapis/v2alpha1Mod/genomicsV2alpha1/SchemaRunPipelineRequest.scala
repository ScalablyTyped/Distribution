package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments to the `RunPipeline` method. The requesting user must have
  * the `iam.serviceAccounts.actAs` permission for the Cloud Genomics service
  * account or the request will fail.
  */
@js.native
trait SchemaRunPipelineRequest extends js.Object {
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
  def apply(labels: StringDictionary[String] = null, pipeline: SchemaPipeline = null): SchemaRunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunPipelineRequest]
  }
}

