package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `UpdateServiceInstance()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse extends js.Object {
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation.
    */
  var operation: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse {
  @scala.inline
  def apply(description: String = null, operation: String = null): SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1UpdateServiceInstanceResponse]
  }
}

