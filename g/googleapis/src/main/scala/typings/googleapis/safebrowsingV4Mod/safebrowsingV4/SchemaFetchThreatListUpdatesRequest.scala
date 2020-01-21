package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Safe Browsing API update request. Clients can request updates
  * for multiple lists in a single request. NOTE: Field index 2 is unused.
  * NEXT: 5
  */
@js.native
trait SchemaFetchThreatListUpdatesRequest extends js.Object {
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * The requested threat list updates.
    */
  var listUpdateRequests: js.UndefOr[js.Array[SchemaListUpdateRequest]] = js.native
}

object SchemaFetchThreatListUpdatesRequest {
  @scala.inline
  def apply(client: SchemaClientInfo = null, listUpdateRequests: js.Array[SchemaListUpdateRequest] = null): SchemaFetchThreatListUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (listUpdateRequests != null) __obj.updateDynamic("listUpdateRequests")(listUpdateRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFetchThreatListUpdatesRequest]
  }
}

