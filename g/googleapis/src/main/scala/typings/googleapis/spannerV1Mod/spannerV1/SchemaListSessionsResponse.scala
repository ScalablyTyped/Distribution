package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListSessions.
  */
@js.native
trait SchemaListSessionsResponse extends js.Object {
  /**
    * `next_page_token` can be sent in a subsequent ListSessions call to fetch
    * more of the matching sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of requested sessions.
    */
  var sessions: js.UndefOr[js.Array[SchemaSession]] = js.native
}

object SchemaListSessionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sessions: js.Array[SchemaSession] = null): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
}

