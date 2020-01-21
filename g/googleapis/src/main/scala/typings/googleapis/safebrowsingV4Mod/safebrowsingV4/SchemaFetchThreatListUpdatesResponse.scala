package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFetchThreatListUpdatesResponse extends js.Object {
  /**
    * The list updates requested by the clients.
    */
  var listUpdateResponses: js.UndefOr[js.Array[SchemaListUpdateResponse]] = js.native
  /**
    * The minimum duration the client must wait before issuing any update
    * request. If this field is not set clients may update as soon as they
    * want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
}

object SchemaFetchThreatListUpdatesResponse {
  @scala.inline
  def apply(listUpdateResponses: js.Array[SchemaListUpdateResponse] = null, minimumWaitDuration: String = null): SchemaFetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    if (listUpdateResponses != null) __obj.updateDynamic("listUpdateResponses")(listUpdateResponses.asInstanceOf[js.Any])
    if (minimumWaitDuration != null) __obj.updateDynamic("minimumWaitDuration")(minimumWaitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesResponse]
  }
}

