package typings.googleapis.loggingV2Mod.loggingV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListLogs.
  */
@js.native
trait SchemaListLogsResponse extends js.Object {
  /**
    * A list of log names. For example, &quot;projects/my-project/syslog&quot;
    * or
    * &quot;organizations/123/cloudresourcemanager.googleapis.com%2Factivity&quot;.
    */
  var logNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * If there might be more results than those appearing in this response,
    * then nextPageToken is included. To get the next set of results, call this
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLogsResponse {
  @scala.inline
  def apply(logNames: js.Array[String] = null, nextPageToken: String = null): SchemaListLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (logNames != null) __obj.updateDynamic("logNames")(logNames.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLogsResponse]
  }
}

