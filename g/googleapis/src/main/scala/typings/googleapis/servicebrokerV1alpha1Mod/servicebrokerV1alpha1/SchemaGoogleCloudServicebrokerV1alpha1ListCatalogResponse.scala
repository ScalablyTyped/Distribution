package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListCatalog()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse extends js.Object {
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The services available for the requested GCP project.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1Service]] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse {
  @scala.inline
  def apply(
    description: String = null,
    nextPageToken: String = null,
    services: js.Array[SchemaGoogleCloudServicebrokerV1alpha1Service] = null
  ): SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]
  }
}

