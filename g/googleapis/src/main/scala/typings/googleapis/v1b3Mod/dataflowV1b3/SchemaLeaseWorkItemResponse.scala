package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to lease WorkItems.
  */
@js.native
trait SchemaLeaseWorkItemResponse extends js.Object {
  /**
    * Untranslated bag-of-bytes WorkResponse for UnifiedWorker.
    */
  var unifiedWorkerResponse: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * A list of the leased WorkItems.
    */
  var workItems: js.UndefOr[js.Array[SchemaWorkItem]] = js.native
}

object SchemaLeaseWorkItemResponse {
  @scala.inline
  def apply(unifiedWorkerResponse: StringDictionary[js.Any] = null, workItems: js.Array[SchemaWorkItem] = null): SchemaLeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    if (unifiedWorkerResponse != null) __obj.updateDynamic("unifiedWorkerResponse")(unifiedWorkerResponse.asInstanceOf[js.Any])
    if (workItems != null) __obj.updateDynamic("workItems")(workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLeaseWorkItemResponse]
  }
}

