package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListClientsResponse extends js.Object {
  /**
    * The returned list of clients.
    */
  var clients: js.UndefOr[js.Array[SchemaClient]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientsRequest.pageToken field in the subsequent call to the
    * accounts.clients.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClientsResponse {
  @scala.inline
  def apply(clients: js.Array[SchemaClient] = null, nextPageToken: String = null): SchemaListClientsResponse = {
    val __obj = js.Dynamic.literal()
    if (clients != null) __obj.updateDynamic("clients")(clients.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListClientsResponse]
  }
}

