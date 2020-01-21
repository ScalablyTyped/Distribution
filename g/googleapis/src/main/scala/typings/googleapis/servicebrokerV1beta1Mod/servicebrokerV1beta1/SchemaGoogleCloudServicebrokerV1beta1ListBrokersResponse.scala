package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for the `ListBrokers()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse extends js.Object {
  /**
    * The list of brokers in the container.
    */
  var brokers: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker]] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse {
  @scala.inline
  def apply(
    brokers: js.Array[SchemaGoogleCloudServicebrokerV1beta1Broker] = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    if (brokers != null) __obj.updateDynamic("brokers")(brokers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1ListBrokersResponse]
  }
}

