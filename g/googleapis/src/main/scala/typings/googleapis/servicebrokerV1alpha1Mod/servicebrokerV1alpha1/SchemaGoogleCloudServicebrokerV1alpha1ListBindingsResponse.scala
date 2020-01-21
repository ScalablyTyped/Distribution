package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for the `ListBindings()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse extends js.Object {
  /**
    * The list of the bindings in the instance.
    */
  var bindings: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1Binding]] = js.native
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
}

object SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse {
  @scala.inline
  def apply(
    bindings: js.Array[SchemaGoogleCloudServicebrokerV1alpha1Binding] = null,
    description: String = null,
    nextPageToken: String = null
  ): SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ListBindingsResponse]
  }
}

