package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information about how a Cloud Dataflow job will be executed that
  * isn&#39;t contained in the submitted job.
  */
@js.native
trait SchemaJobExecutionInfo extends js.Object {
  /**
    * A mapping from each stage to the information about that stage.
    */
  var stages: js.UndefOr[StringDictionary[SchemaJobExecutionStageInfo]] = js.native
}

object SchemaJobExecutionInfo {
  @scala.inline
  def apply(stages: StringDictionary[SchemaJobExecutionStageInfo] = null): SchemaJobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobExecutionInfo]
  }
}

