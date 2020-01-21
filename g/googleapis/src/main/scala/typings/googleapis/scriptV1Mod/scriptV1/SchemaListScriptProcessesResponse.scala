package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of Process resources.
  */
@js.native
trait SchemaListScriptProcessesResponse extends js.Object {
  /**
    * Token for the next page of results. If empty, there are no more pages
    * remaining.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeProcess]] = js.native
}

object SchemaListScriptProcessesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, processes: js.Array[SchemaGoogleAppsScriptTypeProcess] = null): SchemaListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (processes != null) __obj.updateDynamic("processes")(processes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListScriptProcessesResponse]
  }
}

