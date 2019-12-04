package typings.keycloakDashJs.distKeycloakDashAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationRequest extends js.Object {
  /**
    * Defines whether or not this authorization request should include the current RPT. If set to true, the RPT will
    * be sent and permissions in the current RPT will be included in the new RPT. Otherwise, only the permissions referenced in this
    * authorization request will be granted in the new RPT.
    */
  var incrementalAuthorization: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines additional information about this authorization request in order to specify how it should be processed
    * by the server.
    */
  var metadata: js.UndefOr[AuthorizationRequestMetadata] = js.undefined
  /**
    * An array of objects representing the resource and scopes.
    */
  var permissions: js.UndefOr[js.Array[ResourcePermission]] = js.undefined
  /**
    * A boolean value indicating whether the server should create permission requests to the resources
    * and scopes referenced by a permission ticket. This parameter will only take effect when used together
    * with the ticket parameter as part of a UMA authorization process.
    */
  var submitRequest: js.UndefOr[Boolean] = js.undefined
  /**
    * A permission ticket obtained from a resource server when using UMA authorization protocol.
    */
  var ticket: js.UndefOr[String] = js.undefined
}

object AuthorizationRequest {
  @scala.inline
  def apply(
    incrementalAuthorization: js.UndefOr[Boolean] = js.undefined,
    metadata: AuthorizationRequestMetadata = null,
    permissions: js.Array[ResourcePermission] = null,
    submitRequest: js.UndefOr[Boolean] = js.undefined,
    ticket: String = null
  ): AuthorizationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incrementalAuthorization)) __obj.updateDynamic("incrementalAuthorization")(incrementalAuthorization.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (!js.isUndefined(submitRequest)) __obj.updateDynamic("submitRequest")(submitRequest.asInstanceOf[js.Any])
    if (ticket != null) __obj.updateDynamic("ticket")(ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationRequest]
  }
}

