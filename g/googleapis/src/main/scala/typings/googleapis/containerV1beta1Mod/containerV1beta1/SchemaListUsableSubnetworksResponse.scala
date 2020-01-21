package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListUsableSubnetworksResponse is the response of
  * ListUsableSubnetworksRequest.
  */
@js.native
trait SchemaListUsableSubnetworksResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `page_size`, use the
    * `next_page_token` as a value for the query parameter `page_token` in the
    * next request. The value will become empty when there are no more pages.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of usable subnetworks in the specified network project.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaUsableSubnetwork]] = js.native
}

object SchemaListUsableSubnetworksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subnetworks: js.Array[SchemaUsableSubnetwork] = null): SchemaListUsableSubnetworksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListUsableSubnetworksResponse]
  }
}

