package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Locations where the results of running the test are stored.
  */
@js.native
trait SchemaResultStorage extends js.Object {
  /**
    * Required.
    */
  var googleCloudStorage: js.UndefOr[SchemaGoogleCloudStorage] = js.native
  /**
    * Output only. The tool results execution that results are written to.
    */
  var toolResultsExecution: js.UndefOr[SchemaToolResultsExecution] = js.native
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.  If not provided, the service will choose an
    * appropriate value.
    */
  var toolResultsHistory: js.UndefOr[SchemaToolResultsHistory] = js.native
}

object SchemaResultStorage {
  @scala.inline
  def apply(
    googleCloudStorage: SchemaGoogleCloudStorage = null,
    toolResultsExecution: SchemaToolResultsExecution = null,
    toolResultsHistory: SchemaToolResultsHistory = null
  ): SchemaResultStorage = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStorage != null) __obj.updateDynamic("googleCloudStorage")(googleCloudStorage.asInstanceOf[js.Any])
    if (toolResultsExecution != null) __obj.updateDynamic("toolResultsExecution")(toolResultsExecution.asInstanceOf[js.Any])
    if (toolResultsHistory != null) __obj.updateDynamic("toolResultsHistory")(toolResultsHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResultStorage]
  }
}

